package FrontEnd;

import ASTNode.*;
import Scope.*;
import Type.*;
import Util.CompilerError;
import IR.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IRBuilder extends ScopeBuilder {
    private Scope globalScope, currentScope;
    private IRRoot irRoot = new IRRoot();
    private LinkedList<ASTNode> initFuncStmts = new LinkedList<>();
    private String currentClassName = null;
    private IRFunction currentFunction = null;
    private BasicBlock currentBB = null;
    private boolean isArgDecl = false, wantAddr = false;
    private int isInForStmt = 0;
    private BasicBlock currentLoopUpdateBB = null, currentLoopAfterBB = null;
    private List<String> forVarName = new ArrayList<>();
    private List<Integer> forVarNum = new ArrayList<>();

    public IRBuilder(Scope globalScope) {
        this.globalScope = globalScope;
    }

    public IRRoot getIrRoot() {
        return irRoot;
    }

    @Override
    public void visit(ProgramNode node) {
        currentScope = globalScope;
        for (DefinitionNode declNode : node.getDecls()) {
            if (declNode instanceof VariableDefinitionNode) declNode.accept(this);
            else if (declNode instanceof FunctionDefinitionNode) {
                FuncEntity funcEntity = (FuncEntity) currentScope.get("@F" + declNode.getName());
                IRFunction irFunction = new IRFunction(funcEntity);
                irRoot.getFunctions().put(irFunction.getName(), irFunction);
            } else {
                ClassEntity classEntity = (ClassEntity) currentScope.get("@C" + declNode.getName());
                currentScope = classEntity.getScope();
                for (FunctionDefinitionNode funcDeclNode : ((ClassDefinitionNode) declNode).getFuncMember()) {
                    FuncEntity funcEntity = (FuncEntity) currentScope.get("@F" + funcDeclNode.getName());
                    IRFunction irFunction = new IRFunction(funcEntity);
                    irRoot.getFunctions().put(irFunction.getName(), irFunction);
                }
                currentScope = currentScope.getParent();
            }
        }

        BlockStatementNode blockStmtNode = new BlockStatementNode(initFuncStmts, -1);
        blockStmtNode.setScope(globalScope);
        FunctionDefinitionNode funcDeclNode = new FunctionDefinitionNode(new TypeNode(VoidType.getVoidType(), -1), "__init_func", new ArrayList<>(), blockStmtNode, -1);
        FuncEntity funcEntity = new FuncEntity(funcDeclNode);
        globalScope.put("__init_func", "@F__init_func", funcEntity);
        IRFunction irFunction = new IRFunction(funcEntity);
        irRoot.getFunctions().put(irFunction.getName(), irFunction);
        funcDeclNode.accept(this);
        for (DefinitionNode declNode : node.getDecls()) {
            if (declNode instanceof FunctionDefinitionNode || declNode instanceof ClassDefinitionNode)
                declNode.accept(this);
        }
        for (IRFunction irFunction1 : irRoot.getFunctions().values()) irFunction1.updateCalleeSet();
        irRoot.updateCalleeSet();
    }

    @Override
    public void visit(VariableDefinitionNode node) {
        VarEntity varEntity = (VarEntity) currentScope.get("@V" + node.getName());
        if (currentScope.isTop()) {
            StaticData staticData = new StaticVar(node.getName(), 8);
            irRoot.getStaticDataList().add(staticData);
            varEntity.setRegister(staticData);
            if (node.getExp() != null) {
                IdExpressionNode lhs = new IdExpressionNode(node.getName(), -1);
                lhs.setEntity(varEntity);
                AssignExpressionNode assignExprNode = new AssignExpressionNode(lhs, node.getExp(), -1);
                initFuncStmts.add(new ExpressionStatementNode(assignExprNode, -1));
            }
        } else {
            VirtualRegister vr = new VirtualRegister(node.getName());
            varEntity.setRegister(vr);
            if (isArgDecl) currentFunction.getArgVrList().add(vr);
            if (node.getExp() == null) {
                if (!isArgDecl) currentBB.addInst(new Move(currentBB, vr, new ImmediateInt(0)));
            } else {
                if (isBoolExpr(node.getExp())) {
                    node.getExp().setTrueBB(new BasicBlock(currentFunction, null));
                    node.getExp().setFalseBB(new BasicBlock(currentFunction, null));
                }
                node.getExp().accept(this);
                assign(vr, 0, node.getExp(), false);
            }
        }
    }

    private void assign(RegValue lhs, int addrOffset, ExpressionNode rhs, boolean needMemOp) {
        if (rhs.getTrueBB() != null) {
            BasicBlock basicBlock = new BasicBlock(currentFunction, null);
            if (needMemOp) {
                rhs.getTrueBB().addInst(new Store(rhs.getTrueBB(), new ImmediateInt(1), 8, lhs, addrOffset));
                rhs.getFalseBB().addInst(new Store(rhs.getFalseBB(), new ImmediateInt(0), 8, lhs, addrOffset));
            } else {
                rhs.getTrueBB().addInst(new Move(rhs.getTrueBB(), (VirtualRegister) lhs, new ImmediateInt(1)));
                rhs.getFalseBB().addInst(new Move(rhs.getFalseBB(), (VirtualRegister) lhs, new ImmediateInt(0)));
            }
            if (!rhs.getTrueBB().getHasJumpInst()) rhs.getTrueBB().setJumpInst(new Jump(rhs.getTrueBB(), basicBlock));
            if (!rhs.getFalseBB().getHasJumpInst())
                rhs.getFalseBB().setJumpInst(new Jump(rhs.getFalseBB(), basicBlock));
            currentBB = basicBlock;
        } else {
            if (needMemOp) currentBB.addInst(new Store(currentBB, rhs.getRegValue(), 8, lhs, addrOffset));
            else currentBB.addInst(new Move(currentBB, (Register) lhs, rhs.getRegValue()));
        }
    }

    private boolean isBoolExpr(ExpressionNode node) {
        return node.getType() instanceof BoolType && !(node instanceof BoolExpressionNode);
    }

    @Override
    public void visit(ClassDefinitionNode node) {
        currentScope = globalScope;
        currentClassName = node.getName();
        for (FunctionDefinitionNode funcDeclNode : node.getFuncMember()) funcDeclNode.accept(this);
        currentClassName = null;
    }

    @Override
    public void visit(FunctionDefinitionNode node) {
        String funcName = node.getName();
        if (currentClassName != null) funcName = "__member_" + currentClassName + "_" + funcName;
        currentFunction = irRoot.getFunctions().get(funcName);
        currentBB = currentFunction.getStartBB();
        Scope tmp = currentScope;
        currentScope = node.getBody().getScope();
        if (currentClassName != null) {
            VarEntity varEntity = (VarEntity) currentScope.get("@Vthis");
            VirtualRegister vr = new VirtualRegister("this");
            varEntity.setRegister(vr);
            currentFunction.getArgVrList().add(vr);
        }
        isArgDecl = true;
        for (VariableDefinitionNode varDeclNode : node.getParameterList()) varDeclNode.accept(this);
        isArgDecl = false;
        currentScope = tmp;
        if (node.getName().equals("main"))
            currentBB.addInst(new FunctionCall(currentBB, irRoot.getFunctions().get("__init_func"), new ArrayList<>(), null));
        node.getBody().accept(this);
        if (!currentBB.isHasJumpInst()) {
            if (node.getReturnType() == null || node.getReturnType().getType() instanceof VoidType)
                currentBB.setJumpInst(new Return(currentBB, null));
            else currentBB.setJumpInst(new Return(currentBB, new ImmediateInt(0)));
        }

        if (currentFunction.getReturnList().size() > 1) {
            BasicBlock basicBlock = new BasicBlock(currentFunction, currentFunction.getName() + "_end");
            VirtualRegister retReg;
            if (node.getReturnType() == null || node.getReturnType().getType() instanceof VoidType) retReg = null;
            else retReg = new VirtualRegister("return_value");
            List<Return> returnList = new ArrayList<>(currentFunction.getReturnList());
            for (Return returnInst : returnList) {
                BasicBlock bb = returnInst.getParentBB();
                if (returnInst.getRetValue() != null)
                    returnInst.prepend(new Move(bb, retReg, returnInst.getRetValue()));
                returnInst.remove();
                bb.setJumpInst(new Jump(bb, basicBlock));
            }
            basicBlock.setJumpInst(new Return(basicBlock, retReg));
            currentFunction.setEndBB(basicBlock);
        } else currentFunction.setEndBB(currentFunction.getReturnList().get(0).getParentBB());
        currentFunction = null;
    }

    @Override
    public void visit(BlockStatementNode node) {
        currentScope = node.getScope();
        for (ASTNode node1 : node.getStmtsAndVarDecls()) {
            node1.accept(this);
            if (currentBB.getHasJumpInst()) break;
        }
        currentScope = currentScope.getParent();
    }

    @Override
    public void visit(ExpressionStatementNode node) {
        if (node.exp != null) node.exp.accept(this);
    }

    @Override
    public void visit(IfStatementNode node) {
        BasicBlock thenBB = new BasicBlock(currentFunction, "if_then"), afterBB = new BasicBlock(currentFunction, "if_after"), elseBB;
        if (node.getElseStmt() != null) {
            elseBB = new BasicBlock(currentFunction, "if_else");
            node.getCondition().setFalseBB(elseBB);
        } else {
            elseBB = null;
            node.getCondition().setFalseBB(afterBB);
        }
        node.getCondition().setTrueBB(thenBB);
        node.getCondition().accept(this);
        if (isInForStmt > 0 && node.getCondition() instanceof BinaryExpressionNode
                && ((BinaryExpressionNode) node.getCondition()).op == BinaryExpressionNode.binaryOp.GREATER_EQUAL) {
            if (((BinaryExpressionNode) node.getCondition()).lhs instanceof IdExpressionNode
                    && ((BinaryExpressionNode) node.getCondition()).rhs instanceof NumExpressionNode) {
                forVarName.add(((IdExpressionNode) ((BinaryExpressionNode) node.getCondition()).lhs).getName());
                forVarNum.add(((NumExpressionNode) ((BinaryExpressionNode) node.getCondition()).rhs).value);
            }
        }
        if (node.getCondition() instanceof BoolExpressionNode)
            currentBB.setJumpInst(new Branch(currentBB, node.getCondition().getRegValue(), node.getCondition().getTrueBB(), node.getCondition().getFalseBB()));
        currentBB = thenBB;
        node.getThenStmt().accept(this);
        if (!currentBB.getHasJumpInst()) currentBB.setJumpInst(new Jump(currentBB, afterBB));
        if (node.getElseStmt() != null) {
            currentBB = elseBB;
            node.getElseStmt().accept(this);
            if (!currentBB.getHasJumpInst()) currentBB.setJumpInst(new Jump(currentBB, afterBB));
        }
        currentBB = afterBB;
    }

    @Override
    public void visit(WhileStatementNode node) {
        BasicBlock condBB = new BasicBlock(currentFunction, "while_cond"), bodyBB = new BasicBlock(currentFunction, "while_body"), afterBB = new BasicBlock(currentFunction, "while_after");
        BasicBlock tmpLoopCondBB = currentLoopUpdateBB, tmpLoopAfterBB = currentLoopAfterBB;
        currentLoopUpdateBB = condBB;
        currentLoopAfterBB = afterBB;
        currentBB.setJumpInst(new Jump(currentBB, condBB));
        currentBB = condBB;
        node.getCondition().setTrueBB(bodyBB);
        node.getCondition().setFalseBB(afterBB);
        node.getCondition().accept(this);
        if (node.getCondition() instanceof BoolExpressionNode)
            currentBB.setJumpInst(new Branch(currentBB, node.getCondition().getRegValue(), bodyBB, afterBB));
        currentBB = bodyBB;
        node.getStmt().accept(this);
        if (!currentBB.getHasJumpInst()) currentBB.setJumpInst(new Jump(currentBB, condBB));
        currentLoopUpdateBB = tmpLoopCondBB;
        currentLoopAfterBB = tmpLoopAfterBB;
        currentBB = afterBB;
    }

    @Override
    public void visit(ForStatementNode node) {
        ++isInForStmt;
        BasicBlock condBB, updateBB, bodyBB = new BasicBlock(currentFunction, "for_body"), afterBB
                = new BasicBlock(currentFunction, "for_after");
        if (node.getCond() != null) condBB = new BasicBlock(currentFunction, "for_cond");
        else condBB = bodyBB;
        if (node.getUpdate() != null) updateBB = new BasicBlock(currentFunction, "for_update");
        else updateBB = condBB;
        BasicBlock tmpLoopUpdateBB = currentLoopUpdateBB, tmpLoopAfterBB = currentLoopAfterBB;
        currentLoopUpdateBB = updateBB;
        currentLoopAfterBB = afterBB;
        BasicBlock tmpBB = currentBB;
        if (node.getInit() != null) node.getInit().accept(this);
        currentBB.setJumpInst(new Jump(currentBB, condBB));
        if (node.getCond() != null) {
            currentBB = condBB;
            node.getCond().setTrueBB(bodyBB);
            node.getCond().setFalseBB(afterBB);
            node.getCond().accept(this);
            if (node.getCond() instanceof BoolExpressionNode)
                currentBB.setJumpInst(new Branch(currentBB, node.getCond().getRegValue(), bodyBB, afterBB));
        }
        if (node.getUpdate() != null) {
            currentBB = updateBB;
            node.getUpdate().accept(this);
            currentBB.setJumpInst(new Jump(currentBB, condBB));
        }
        currentBB = bodyBB;
        if (node.getStmt() != null) node.getStmt().accept(this);
        if (!currentBB.getHasJumpInst()) currentBB.setJumpInst(new Jump(currentBB, updateBB));
        Instruction inst = tmpBB.getTail().getPrev();
        if (node.getInit() instanceof AssignExpressionNode && node.getCond() instanceof BinaryExpressionNode
                && ((BinaryExpressionNode) node.getCond()).op == BinaryExpressionNode.binaryOp.LESS) {
            if (((BinaryExpressionNode) node.getCond()).lhs instanceof IdExpressionNode
                    && ((AssignExpressionNode) node.getInit()).lhs instanceof IdExpressionNode) {
                IdExpressionNode cond = (IdExpressionNode) ((BinaryExpressionNode) node.getCond()).lhs, init
                        = (IdExpressionNode) ((AssignExpressionNode) node.getInit()).lhs;
                if (cond.getName().equals(init.getName())) {
                    for (int i = 0; i < forVarName.size(); ++i) {
                        if (init.getName().equals(forVarName.get(i)) && inst instanceof Move) {
                            ((Move) inst).setRhs(new ImmediateInt(forVarNum.get(i)));
                            forVarName.remove(i);
                            forVarNum.remove(i);
                            break;
                        }
                    }
                }
            }
        }
        currentLoopUpdateBB = tmpLoopUpdateBB;
        currentLoopAfterBB = tmpLoopAfterBB;
        currentBB = afterBB;
        --isInForStmt;
        if (isInForStmt == 0) {
            forVarNum.clear();
        }
    }

    @Override
    public void visit(ContinueStatementNode node) {
        currentBB.setJumpInst(new Jump(currentBB, currentLoopUpdateBB));
    }

    @Override
    public void visit(BreakStatementNode node) {
        currentBB.setJumpInst(new Jump(currentBB, currentLoopAfterBB));
    }

    @Override
    public void visit(ReturnStatementNode node) {
        Type returnType = currentFunction.getFuncEntity().getReturnType();
        if (returnType == null || returnType instanceof VoidType)
            currentBB.setJumpInst(new Return(currentBB, null));
        else {
            if (returnType instanceof BoolType && !(node.exp instanceof BoolExpressionNode)) {
                node.exp.setTrueBB(new BasicBlock(currentFunction, null));
                node.exp.setFalseBB(new BasicBlock(currentFunction, null));
                node.exp.accept(this);
                VirtualRegister vr = new VirtualRegister("retBoolValue");
                assign(vr, 0, node.exp, false);
                currentBB.setJumpInst(new Return(currentBB, vr));
            } else {
                node.exp.accept(this);
                currentBB.setJumpInst(new Return(currentBB, node.exp.getRegValue()));
            }
        }
    }

    @Override
    public void visit(SuffixExpressionNode node) {
        selfIncDec(node, node.exp);
    }

    private void selfIncDec(ExpressionNode node, ExpressionNode exp) {
        boolean tmp = wantAddr;
        wantAddr = false;
        BinaryOp.binaryOp op;
        exp.accept(this);
        if (node instanceof SuffixExpressionNode) {
            op = ((SuffixExpressionNode) node).op
                    == SuffixExpressionNode.suffixOp.INC ? BinaryOp.binaryOp.ADD : BinaryOp.binaryOp.SUB;
            VirtualRegister vr = new VirtualRegister(null);
            currentBB.addInst(new Move(currentBB, vr, exp.getRegValue()));
            node.setRegValue(vr);
        } else {
            op = ((PrefixExpressionNode) node).op
                    == PrefixExpressionNode.prefixOp.INC ? BinaryOp.binaryOp.ADD : BinaryOp.binaryOp.SUB;
            node.setRegValue(exp.getRegValue());
        }
        ImmediateInt one = new ImmediateInt(1);
        if (isMemAcc(exp)) {
            wantAddr = true;
            exp.accept(this);
            VirtualRegister vr = new VirtualRegister(null);
            currentBB.addInst(new BinaryOp(currentBB, vr, op, exp.getRegValue(), one));
            currentBB.addInst(new Store(currentBB, vr, 8, exp.getAddrValue(), exp.getAddrOffset()));
            if (node instanceof PrefixExpressionNode) exp.setRegValue(vr);
        } else currentBB.addInst(new BinaryOp(currentBB, (Register) exp.getRegValue(), op, exp.getRegValue(), one));
        wantAddr = tmp;
    }

    private boolean isMemAcc(ExpressionNode node) {
        if (node instanceof ArrayExpressionNode || node instanceof MemberExpressionNode) return true;
        if (node instanceof IdExpressionNode) {
            if (!((IdExpressionNode) node).isChecked()) {
                if (currentClassName == null) ((IdExpressionNode) node).setNeedMemOp(false);
                else
                    ((IdExpressionNode) node).setNeedMemOp(((VarEntity) currentScope.get("@V" +
                            ((IdExpressionNode) node).getName())).getRegister() == null);
                ((IdExpressionNode) node).setChecked(true);
            }
            return ((IdExpressionNode) node).isNeedMemOp();
        }
        return false;
    }

    private void processPrintFuncCall(ExpressionNode arg, String funcName) {
        if (arg instanceof BinaryExpressionNode) {
            processPrintFuncCall(((BinaryExpressionNode) arg).lhs, "print");
            processPrintFuncCall(((BinaryExpressionNode) arg).rhs, funcName);
            return;
        }
        IRFunction calleeFunc;
        List<RegValue> vArgs = new ArrayList<>();
        if (arg instanceof FunctionCallExpressionNode
                && ((FunctionCallExpressionNode) arg).getFuncEntity().getName().equals("toString")) {
            ExpressionNode intExpr = ((FunctionCallExpressionNode) arg).getParaList().get(0);
            intExpr.accept(this);
            calleeFunc = irRoot.getBuiltInFunctions().get(funcName + "Int");
            vArgs.add(intExpr.getRegValue());
        } else {
            arg.accept(this);
            calleeFunc = irRoot.getBuiltInFunctions().get(funcName);
            vArgs.add(arg.getRegValue());
        }
        currentBB.addInst(new FunctionCall(currentBB, calleeFunc, vArgs, null));
    }

    @Override
    public void visit(FunctionCallExpressionNode node)
    {
        FuncEntity funcEntity = node.getFuncEntity();
        String funcName = funcEntity.getName();
        List<RegValue> argList = new ArrayList<>();
        ExpressionNode thisExpr = null;
        if (funcEntity.isMember()) {
            if (node.exp instanceof MemberExpressionNode) thisExpr
                    = ((MemberExpressionNode) node.exp).exp;
            else {
                if (currentClassName == null) throw new CompilerError("Invalid function call");
                thisExpr = new ThisExpressionNode(-1);
                thisExpr.setType(new ClassType(currentClassName));
            }
            thisExpr.accept(this);
            String className;
            if (thisExpr.getType() instanceof ClassType) className = ((ClassType) thisExpr.getType()).getName();
            else if (thisExpr.getType() instanceof ArrayType) className = "array";
            else className = "string";
            funcName = "__member_" + className + "_" + funcName;
            argList.add(thisExpr.getRegValue());
        }
        if (funcEntity.isBuiltIn()) {
            boolean tmp = wantAddr;
            wantAddr = false;
            ExpressionNode arg0, arg1;
            VirtualRegister vr;
            argList.clear();
            switch (funcName) {
                case "print":
                case "println":
                    arg0 = node.getParaList().get(0);
                    processPrintFuncCall(arg0, funcName);
//                    arg0 = node.getParaList().get(0);
//                    arg0.accept(this);
//                    argList.add(arg0.getRegValue());
//                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, null));
                    break;
                case "getString":
                    vr = new VirtualRegister("getString");
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "getInt":
                    vr = new VirtualRegister("getInt");
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "toString":
                    arg0 = node.getParaList().get(0);
                    arg0.accept(this);
                    argList.add(arg0.getRegValue());
                    vr = new VirtualRegister("toString");
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "__member_string_substring":
                    arg0 = node.getParaList().get(0);
                    arg1 = node.getParaList().get(1);
                    arg0.accept(this);
                    arg1.accept(this);
                    argList.add(thisExpr.getRegValue());
                    argList.add(arg0.getRegValue());
                    argList.add(arg1.getRegValue());
                    vr = new VirtualRegister("substring");
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "__member_string_parseInt":
                    vr = new VirtualRegister("parseInt");
                    argList.add(thisExpr.getRegValue());
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "__member_string_ord":
                    vr = new VirtualRegister("ord");
                    argList.add(thisExpr.getRegValue());
                    arg0 = node.getParaList().get(0);
                    arg0.accept(this);
                    argList.add(arg0.getRegValue());
                    currentBB.addInst(new FunctionCall(currentBB, irRoot.getBuiltInFunctions().get(funcName), argList, vr));
                    node.setRegValue(vr);
                    break;
                case "__member_string_length":
                case "__member_array_size":
                    vr = new VirtualRegister("sizeOrLength");
                    currentBB.addInst(new Load(currentBB, vr, 8, thisExpr.getRegValue(), 0));
                    node.setRegValue(vr);
                    break;
                default:
                    throw new CompilerError("Invalid built-in function call");
            }
            wantAddr = tmp;
        } else {
            for (ExpressionNode arg : node.getParaList()) {
                arg.accept(this);
                argList.add(arg.getRegValue());
            }
            VirtualRegister vr = new VirtualRegister(null);
            currentBB.addInst(new FunctionCall(currentBB, irRoot.getFunctions().get(funcName), argList, vr));
            node.setRegValue(vr);
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, vr, node.getTrueBB(), node.getFalseBB()));
        }
    }

    @Override
    public void visit(ArrayExpressionNode node) {
        boolean tmp = wantAddr;
        wantAddr = false;
        node.getArr().accept(this);
        node.getSub().accept(this);
        wantAddr = tmp;
        VirtualRegister vr = new VirtualRegister(null);
        currentBB.addInst(new BinaryOp(currentBB, vr, BinaryOp.binaryOp.MUL, node.getSub().getRegValue(), new ImmediateInt(8)));
        currentBB.addInst(new BinaryOp(currentBB, vr, BinaryOp.binaryOp.ADD, node.getArr().getRegValue(), vr));
        if (wantAddr) {
            node.setAddrValue(vr);
            node.setAddrOffset(8);
        } else {
            currentBB.addInst(new Load(currentBB, vr, node.getType().getVarSize(), vr, 8));
            node.setRegValue(vr);
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, node.getRegValue(), node.getTrueBB(), node.getFalseBB()));
        }
    }

    @Override
    public void visit(MemberExpressionNode node) {
        boolean tmp = wantAddr;
        wantAddr = false;
        node.exp.accept(this);
        wantAddr = tmp;
        RegValue classAddr = node.exp.getRegValue();
        String className = ((ClassType) node.exp.getType()).getName();
        ClassEntity classEntity = (ClassEntity) currentScope.get("@C" + className);
        VarEntity varEntity = (VarEntity) classEntity.getScope().selfGet("@V" + node.getName());
        if (wantAddr) {
            node.setAddrValue(classAddr);
            node.setAddrOffset(varEntity.getAddrOffset());
        } else {
            VirtualRegister vr = new VirtualRegister(null);
            node.setRegValue(vr);
            currentBB.addInst(new Load(currentBB, vr, varEntity.getType().getVarSize(), classAddr, varEntity.getAddrOffset()));
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, node.getRegValue(), node.getTrueBB(), node.getFalseBB()));
        }
    }

    @Override
    public void visit(PrefixExpressionNode node) {
        VirtualRegister vr;
        switch (node.op) {
            case DEC:
            case INC:
                selfIncDec(node, node.exp);
                break;
            case POS:
                node.exp.accept(this);
                node.setRegValue(node.exp.getRegValue());
                break;
            case NEG:
                vr = new VirtualRegister(null);
                node.setRegValue(vr);
                node.exp.accept(this);
                currentBB.addInst(new UnaryOp(currentBB, vr, UnaryOp.unaryOp.NEG, node.exp.getRegValue()));
                break;
            case BITWISE_NOT:
                vr = new VirtualRegister(null);
                node.setRegValue(vr);
                node.exp.accept(this);
                currentBB.addInst(new UnaryOp(currentBB, vr, UnaryOp.unaryOp.BITWISE_NOT, node.exp.getRegValue()));
                break;
            case LOGIC_NOT:
                node.exp.setTrueBB(node.getFalseBB());
                node.exp.setFalseBB(node.getTrueBB());
                node.exp.accept(this);
                break;
            default:
                throw new CompilerError("Invalid prefix operation");
        }
    }

    @Override
    public void visit(NewExpressionNode node) {
        VirtualRegister vr = new VirtualRegister(null);
        Type type = node.getNewType().getType();
        if (type instanceof ClassType) {
            String className = ((ClassType) type).getName();
            currentBB.addInst(new HeapAlloc(currentBB, vr, new ImmediateInt(((ClassEntity) globalScope.get("@C" + className)).getMemorySize())));
            IRFunction irFunction = irRoot.getFunctions().get("__member_" + className + "_" + className);
            if (irFunction != null) {
                List<RegValue> argList = new ArrayList<>();
                argList.add(vr);
                currentBB.addInst(new FunctionCall(currentBB, irFunction, argList, null));
            }
        } else if (type instanceof ArrayType) arrayNew(node, vr, null, 0);
        else throw new CompilerError("Invalid new type");
        node.setRegValue(vr);
    }

    private void arrayNew(NewExpressionNode node, VirtualRegister vr, RegValue addr, int idx) {
        VirtualRegister Vr = new VirtualRegister(null);
        ExpressionNode exprNode = node.getExpList().get(idx);
        boolean tmp = wantAddr;
        wantAddr = false;
        exprNode.accept(this);
        wantAddr = tmp;
        currentBB.addInst(new BinaryOp(currentBB, Vr, BinaryOp.binaryOp.MUL, exprNode.getRegValue(), new ImmediateInt(8)));
        currentBB.addInst(new BinaryOp(currentBB, Vr, BinaryOp.binaryOp.ADD, Vr, new ImmediateInt(8)));
        currentBB.addInst(new HeapAlloc(currentBB, Vr, Vr));
        currentBB.addInst(new Store(currentBB, exprNode.getRegValue(), 8, Vr, 0));
        if (idx < node.getExpList().size() - 1) {
            VirtualRegister index = new VirtualRegister(null), address = new VirtualRegister(null);
            currentBB.addInst(new Move(currentBB, index, new ImmediateInt(0)));
            currentBB.addInst(new Move(currentBB, address, Vr));
            BasicBlock condBB = new BasicBlock(currentFunction, "while_cond"), bodyBB
                    = new BasicBlock(currentFunction, "while_body"), afterBB
                    = new BasicBlock(currentFunction, "while_after");
            currentBB.setJumpInst(new Jump(currentBB, condBB));
            currentBB = condBB;
            VirtualRegister cmp = new VirtualRegister(null);
            currentBB.addInst(new Comparison(currentBB, cmp, Comparison.comparisonOp.LESS, index, exprNode.getRegValue()));
            currentBB.setJumpInst(new Branch(currentBB, cmp, bodyBB, afterBB));
            currentBB = bodyBB;
            currentBB.addInst(new BinaryOp(currentBB, address, BinaryOp.binaryOp.ADD, address, new ImmediateInt(8)));
            arrayNew(node, null, address, idx + 1);
            currentBB.addInst(new BinaryOp(currentBB, index, BinaryOp.binaryOp.ADD, index, new ImmediateInt(1)));
            currentBB.setJumpInst(new Jump(currentBB, condBB));
            currentBB = afterBB;
        }
        if (idx == 0) currentBB.addInst(new Move(currentBB, vr, Vr));
        else currentBB.addInst(new Store(currentBB, Vr, 8, addr, 0));
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        if (node.lhs.getType() instanceof StringType) {
            node.lhs.accept(this);
            node.rhs.accept(this);
            IRFunction irFunction;
            ExpressionNode tmp;
            switch (node.op) {
                case ADD:
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_concat");
                    break;
                case LESS:
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_less");
                    break;
                case EQUAL:
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_equal");
                    break;
                case UNEQUAL:
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_unequal");
                    break;
                case LESS_EQUAL:
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_less_equal");
                    break;
                case GREATER:
                    tmp = node.lhs;
                    node.lhs = node.rhs;
                    node.rhs = tmp;
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_less");
                    break;
                case GREATER_EQUAL:
                    tmp = node.lhs;
                    node.lhs = node.rhs;
                    node.rhs = tmp;
                    irFunction = irRoot.getBuiltInFunctions().get("__builtin_string_less_equal");
                    break;
                default:
                    throw new CompilerError("Invalid string binary operation");
            }
            List<RegValue> argList = new ArrayList<>();
            argList.add(node.lhs.getRegValue());
            argList.add(node.rhs.getRegValue());
            VirtualRegister vr = new VirtualRegister(null);
            currentBB.addInst(new FunctionCall(currentBB, irFunction, argList, vr));
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, vr, node.getTrueBB(), node.getFalseBB()));
            else node.setRegValue(vr);
            return;
        }
        if (isLogicalBinaryOp(node.op)) {
            if (node.op == BinaryExpressionNode.binaryOp.LOGIC_AND) {
                node.lhs.setTrueBB(new BasicBlock(currentFunction, "and_lhs_true"));
                node.lhs.setFalseBB(node.getFalseBB());
                node.lhs.accept(this);
                currentBB = node.lhs.getTrueBB();
            } else {
                node.lhs.setTrueBB(node.getTrueBB());
                node.lhs.setFalseBB(new BasicBlock(currentFunction, "or_lhs_false"));
                node.lhs.accept(this);
                currentBB = node.lhs.getFalseBB();
            }
            node.rhs.setTrueBB(node.getTrueBB());
            node.rhs.setFalseBB(node.getFalseBB());
            node.rhs.accept(this);
        } else if (isArithmeticBinaryOp(node.op)) {
            node.lhs.accept(this);
            node.rhs.accept(this);
            RegValue lhs = node.lhs.getRegValue(), rhs = node.rhs.getRegValue();
            int lhsValue = 0, rhsValue = 0;
            boolean bothImmediate = lhs instanceof ImmediateInt && rhs instanceof ImmediateInt;
            if (lhs instanceof ImmediateInt) lhsValue = ((ImmediateInt) lhs).getValue();
            if (rhs instanceof ImmediateInt) rhsValue = ((ImmediateInt) rhs).getValue();
            BinaryOp.binaryOp op = null;
            switch (node.op) {
                case MUL:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue * rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.MUL;
                    break;
                case DIV:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue / rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.DIV;
                    irRoot.setHasDivShiftInst(true);
                    break;
                case MOD:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue % rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.MOD;
                    irRoot.setHasDivShiftInst(true);
                    break;
                case ADD:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue + rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.ADD;
                    break;
                case SUB:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue - rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.SUB;
                    break;
                case SHL:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue << rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.SHL;
                    irRoot.setHasDivShiftInst(true);
                    break;
                case SHR:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue >> rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.SHR;
                    irRoot.setHasDivShiftInst(true);
                    break;
                case BITWISE_AND:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue & rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.BITWISE_AND;
                    break;
                case BITWISE_OR:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue | rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.BITWISE_OR;
                    break;
                case BITWISE_XOR:
                    if (bothImmediate) {
                        node.setRegValue(new ImmediateInt(lhsValue ^ rhsValue));
                        return;
                    }
                    op = BinaryOp.binaryOp.BITWISE_XOR;
                    break;
            }
            VirtualRegister vr = new VirtualRegister(null);
            node.setRegValue(vr);
            currentBB.addInst(new BinaryOp(currentBB, vr, op, lhs, rhs));
        } else {
            node.lhs.accept(this);
            node.rhs.accept(this);
            RegValue lhs = node.lhs.getRegValue(), rhs = node.rhs.getRegValue();
            int lhsValue = 0, rhsValue = 0;
            if (lhs instanceof ImmediateInt) lhsValue = ((ImmediateInt) lhs).getValue();
            if (rhs instanceof ImmediateInt) rhsValue = ((ImmediateInt) rhs).getValue();
            boolean bothImmediate = lhs instanceof ImmediateInt && rhs instanceof ImmediateInt;
            Comparison.comparisonOp op = null;
            switch (node.op) {
                case LESS:
                    if (bothImmediate) {
                        if (lhsValue < rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                        op = Comparison.comparisonOp.GREATER;
                    } else op = Comparison.comparisonOp.LESS;
                    break;
                case GREATER:
                    if (bothImmediate) {
                        if (lhsValue > rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                        op = Comparison.comparisonOp.LESS;
                    } else op = Comparison.comparisonOp.GREATER;
                    break;
                case LESS_EQUAL:
                    if (bothImmediate) {
                        if (lhsValue <= rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                        op = Comparison.comparisonOp.GREATER_EQUAL;
                    } else op = Comparison.comparisonOp.LESS_EQUAL;
                    break;
                case GREATER_EQUAL:
                    if (bothImmediate) {
                        if (lhsValue >= rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                        op = Comparison.comparisonOp.LESS_EQUAL;
                    } else op = Comparison.comparisonOp.GREATER_EQUAL;
                    break;
                case EQUAL:
                    if (bothImmediate) {
                        if (lhsValue == rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                    }
                    op = Comparison.comparisonOp.EQUAL;
                    break;
                case UNEQUAL:
                    if (bothImmediate) {
                        if (lhsValue != rhsValue) node.setRegValue(new ImmediateInt(1));
                        else node.setRegValue(new ImmediateInt(0));
                        return;
                    }
                    if (lhs instanceof ImmediateInt) {
                        RegValue tmp = rhs;
                        rhs = lhs;
                        lhs = tmp;
                    }
                    op = Comparison.comparisonOp.UNEQUAL;
                    break;
            }
            VirtualRegister vr = new VirtualRegister(null);
            currentBB.addInst(new Comparison(currentBB, vr, op, lhs, rhs));
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, vr, node.getTrueBB(), node.getFalseBB()));
            else node.setRegValue(vr);
        }
    }

    private boolean isLogicalBinaryOp(BinaryExpressionNode.binaryOp op) {
        return op == BinaryExpressionNode.binaryOp.LOGIC_AND || op == BinaryExpressionNode.binaryOp.LOGIC_OR;
    }

    private boolean isArithmeticBinaryOp(BinaryExpressionNode.binaryOp op) {
        return op == BinaryExpressionNode.binaryOp.MUL || op == BinaryExpressionNode.binaryOp.DIV
                || op == BinaryExpressionNode.binaryOp.MOD || op == BinaryExpressionNode.binaryOp.ADD
                || op == BinaryExpressionNode.binaryOp.SUB || op == BinaryExpressionNode.binaryOp.SHL
                || op == BinaryExpressionNode.binaryOp.SHR || op == BinaryExpressionNode.binaryOp.BITWISE_AND
                || op == BinaryExpressionNode.binaryOp.BITWISE_OR || op == BinaryExpressionNode.binaryOp.BITWISE_XOR;
    }

    @Override
    public void visit(AssignExpressionNode node) {
        boolean needMemOp = isMemAcc(node.lhs);
        wantAddr = needMemOp;
        node.lhs.accept(this);
        wantAddr = false;
        if (isBoolExpr(node.rhs)) {
            node.rhs.setTrueBB(new BasicBlock(currentFunction, null));
            node.rhs.setFalseBB(new BasicBlock(currentFunction, null));
        }
        node.rhs.accept(this);
        RegValue destination;
        int addrOffset;
        if (needMemOp) {
            destination = node.lhs.getAddrValue();
            addrOffset = node.lhs.getAddrOffset();
        } else {
            destination = node.lhs.getRegValue();
            addrOffset = 0;
        }
        assign(destination, addrOffset, node.rhs, needMemOp);
        node.setRegValue(node.rhs.getRegValue());
    }

    @Override
    public void visit(IdExpressionNode node) {
        VarEntity varEntity = node.getEntity();
        if (varEntity.getRegister() != null) {
            node.setRegValue(varEntity.getRegister());
            if (node.getTrueBB() != null)
                currentBB.setJumpInst(new Branch(currentBB, node.getRegValue(), node.getTrueBB(), node.getFalseBB()));
        } else {
            ThisExpressionNode thisExprNode = new ThisExpressionNode(-1);
            thisExprNode.setType(new ClassType(currentClassName));
            MemberExpressionNode memExprNode = new MemberExpressionNode(thisExprNode, node.getName(), -1);
            memExprNode.accept(this);
            if (wantAddr) {
                node.setAddrValue(memExprNode.getAddrValue());
                node.setAddrOffset(memExprNode.getAddrOffset());
            } else {
                node.setRegValue(memExprNode.getRegValue());
                if (node.getTrueBB() != null)
                    currentBB.setJumpInst(new Branch(currentBB, node.getRegValue(), node.getTrueBB(), node.getFalseBB()));
            }
            node.setNeedMemOp(true);
        }
    }

    @Override
    public void visit(ThisExpressionNode node) {
        VarEntity varEntity = (VarEntity) currentScope.get("@Vthis");
        node.setRegValue(varEntity.getRegister());
        if (node.getTrueBB() != null)
            currentBB.setJumpInst(new Branch(currentBB, node.getRegValue(), node.getTrueBB(), node.getFalseBB()));
    }

    @Override
    public void visit(NumExpressionNode node) {
        node.setRegValue(new ImmediateInt(node.value));
    }

    @Override
    public void visit(StringExpressionNode node) {
        StaticStr staticStr = irRoot.getStaticStrs().get(node.str);
        if (staticStr == null) {
            staticStr = new StaticStr(node.str);
            irRoot.getStaticStrs().put(node.str, staticStr);
        }
        node.setRegValue(staticStr);
    }

    @Override
    public void visit(BoolExpressionNode node) {
        node.setRegValue(new ImmediateInt(node.value ? 1 : 0));
    }

    @Override
    public void visit(NullExpressionNode node) {
        node.setRegValue(new ImmediateInt(0));
    }
}

