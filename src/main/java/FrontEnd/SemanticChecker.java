package FrontEnd;

import ASTNode.*;
import Scope.*;
import Type.*;
import Util.*;

public class SemanticChecker extends ScopeBuilder {
    private Scope globalScope, currentScope;
    private int inLoop = 0;
    private Type currentReturnType;
    private ClassType currentClassType;
    private FuncEntity currentFuncEntity;

    public SemanticChecker(Scope globalScope) {
        this.globalScope = globalScope;
    }

    @Override
    public void visit(ProgramNode node) {
        currentScope = globalScope;
        for (DefinitionNode declNode : node.getDecls()) {
            if (declNode instanceof VariableDefinitionNode
                    || declNode instanceof FunctionDefinitionNode
                    || declNode instanceof ClassDefinitionNode)
                declNode.accept(this);
            else throw new CompilerError(declNode.loc, "Invalid declNode");
        }
    }

    @Override
    public void visit(VariableDefinitionNode node) {
        if (node.getType().getType() instanceof ClassType) {
            String className = ((ClassType) node.getType().getType()).getName();
            currentScope.get(node.loc, className, "@C" + className);
        }
        if (node.exp != null) {
            node.exp.accept(this);
            if (checkVarExpr(node)) throw new SemanticError(node.loc, "Invalid initialization type");
        }
        currentScope.put(node.loc, node.getName(), "@V" + node.getName(), new VarEntity(node));
    }

    private boolean checkVarExpr(VariableDefinitionNode node) {
        if (node.exp.getType() instanceof NullType)
            return !(node.getType().getType() instanceof ClassType || node.getType().getType() instanceof ArrayType);
        if (node.getType().getType() instanceof VoidType || node.exp.getType() instanceof VoidType) return true;
        return !node.getType().getType().equals(node.exp.getType());
    }

    @Override
    public void visit(FunctionDefinitionNode node) {
        FuncEntity entity = (FuncEntity) currentScope.get(node.loc, node.getName(), "@F" + node.getName());
        if (entity.getReturnType() instanceof ClassType)
            globalScope.get(node.loc, ((ClassType) entity.getReturnType()).getName(), "@C" + ((ClassType) entity.getReturnType()).getName());
        currentReturnType = entity.getReturnType();
        node.getBody().setScope(currentScope);
        currentScope = node.getBody().getScope();
        if (currentClassType != null) {
            currentScope.put(node.loc, "this", "@Vthis", new VarEntity("this", currentClassType));
            if (node.getIsConstruct() && !node.getName().equals(currentClassType.getName()))
                throw new SemanticError(node.loc, "Constructor's name should be the same as the class's name");
        }
        for (VariableDefinitionNode varDeclNode : node.getParameterList()) {
            if (varDeclNode.exp != null)
                throw new SemanticError(varDeclNode.loc, "Function's parameters should have no assignment");
            varDeclNode.accept(this);
        }
        node.getBody().accept(this);
    }

    @Override
    public void visit(ClassDefinitionNode node) {
        ClassEntity entity = (ClassEntity) globalScope.get(node.loc, node.getName(), "@C" + node.getName());
        currentScope = entity.getScope();
        currentClassType = (ClassType) entity.getType();
        for (FunctionDefinitionNode funcDeclNode : node.getFuncMember()) funcDeclNode.accept(this);
        currentScope = currentScope.getParent();
        currentClassType = null;
    }

    @Override
    public void visit(BlockStatementNode node) {
        node.setScope(currentScope);
        currentScope = node.getScope();
        for (ASTNode node1 : node.getStmtsAndVarDecls()) {
            if (node1 instanceof VariableDefinitionNode) node1.accept(this);
            else if (node1 instanceof StatementNode) {
                if (node1 instanceof BlockStatementNode) {
                    ((BlockStatementNode) node1).setScope(currentScope);
                    currentScope = ((BlockStatementNode) node1).getScope();
                }
                node1.accept(this);
            } else throw new CompilerError(node.loc, "Invalid statement in block");
        }
        currentScope = currentScope.getParent();
    }

    @Override
    public void visit(ExpressionStatementNode node) {
        if (node.exp != null) node.exp.accept(this);
    }

    @Override
    public void visit(IfStatementNode node) {
        node.getCondition().accept(this);
        if (!(node.getCondition().getType() instanceof BoolType))
            throw new SemanticError(node.getCondition().loc, "Condition should be boolean type");
        if (node.getThenStmt() != null) node.getThenStmt().accept(this);
        if (node.getElseStmt() != null) node.getElseStmt().accept(this);
    }

    @Override
    public void visit(WhileStatementNode node) {
        ++inLoop;
        node.getCondition().accept(this);
        if (!(node.getCondition().getType() instanceof BoolType))
            throw new SemanticError(node.getCondition().loc, "Condition should be boolean type");
        if (node.getStmt() != null) node.getStmt().accept(this);
        --inLoop;
    }

    @Override
    public void visit(ForStatementNode node) {
        ++inLoop;
        if (node.getInit() != null) node.getInit().accept(this);
        if (node.getCond() != null) {
            node.getCond().accept(this);
            if (!(node.getCond().getType() instanceof BoolType))
                throw new SemanticError(node.loc, "Condition should be boolean type");
        }
        if (node.getUpdate() != null) node.getUpdate().accept(this);
        if (node.getStmt() != null) node.getStmt().accept(this);
        --inLoop;
    }

    @Override
    public void visit(ContinueStatementNode node) {
        if (inLoop == 0) throw new SemanticError(node.loc, "\"continue\" should be in the loop");
    }

    @Override
    public void visit(BreakStatementNode node) {
        if (inLoop == 0) throw new SemanticError(node.loc, "\"break\" should be in the loop");
    }

    @Override
    public void visit(ReturnStatementNode node) {
        if (currentReturnType instanceof VoidType || currentReturnType == null) {
            if (node.exp != null) throw new SemanticError(node.loc, "\"return\" should return nothing");
        } else {
            if (node.exp == null)
                throw new SemanticError(node.loc, "\"return\" should return something");
            node.exp.accept(this);
            if (checkReturn(node.exp.getType()))
                throw new SemanticError(node.loc, "Return type not match");
        }
    }

    private boolean checkReturn(Type returnType) {
        if (returnType instanceof NullType)
            return !(currentReturnType instanceof ArrayType || currentReturnType instanceof ClassType);
        return !returnType.equals(currentReturnType);
    }

    @Override
    public void visit(SuffixExpressionNode node) {
        node.exp.accept(this);
        if (!(node.exp.getType() instanceof IntType))
            throw new SemanticError(node.loc, "Expression's type should be int type");
        if (!node.exp.isLeftValue())
            throw new SemanticError(node.loc, "Expression should be left value");
        node.setType(IntType.getIntType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(FunctionCallExpressionNode node) {
        node.exp.accept(this);
        if (!(node.exp.getType() instanceof FuncType))
            throw new SemanticError(node.loc, "Expression's type should be function type");
        FuncEntity entity = currentFuncEntity;
        node.setFuncEntity(entity);
        int paraNum = entity.getParameters().size();
        if (paraNum != node.getParaList().size())
            throw new SemanticError(node.loc, "Parameter number don't match");
        for (int i = 0; i < paraNum; ++i) {
            node.getParaList().get(i).accept(this);
            Type exprType = node.getParaList().get(i).getType(), paraType = entity.getParameters().get(i).getType();
            Location loc = node.getParaList().get(i).loc;
            if (checkFuncCall(exprType, paraType)) throw new SemanticError(loc, "Parameter's type not match");
        }
        node.setType(entity.getReturnType());
        node.setLeftValue(false);
    }

    private boolean checkFuncCall(Type exprType, Type paraType) {
        if (exprType instanceof VoidType) return true;
        if (exprType instanceof NullType) return !(paraType instanceof ArrayType || paraType instanceof ClassType);
        return !exprType.equals(paraType);
    }

    @Override
    public void visit(ArrayExpressionNode node) {
        node.getArr().accept(this);
        if (!(node.getArr().getType() instanceof ArrayType))
            throw new SemanticError(node.getArr().loc, "Expression's type should be array type");
        node.getSub().accept(this);
        if (!(node.getSub().getType() instanceof IntType))
            throw new SemanticError(node.getSub().loc, "Expression's type should be int type");
        node.setType(((ArrayType) node.getArr().getType()).getBaseType());
        node.setLeftValue(true);
    }

    @Override
    public void visit(MethodExpressionNode node) {
        node.exp.accept(this);
        String className;
        if (node.exp.getType() instanceof ArrayType) className = "array";
        else if (node.exp.getType() instanceof StringType) className = "string";
        else if (node.exp.getType() instanceof ClassType)
            className = ((ClassType) node.exp.getType()).getName();
        else throw new SemanticError(node.exp.loc, "Expression should be class type");
        ClassEntity entity = (ClassEntity) currentScope.get(node.exp.loc, className, "@C" + className);
        Entity varOrFunc = entity.getScope().selfGetVarFunc(node.loc, node.getName());
        if (varOrFunc instanceof FuncEntity) currentFuncEntity = (FuncEntity) varOrFunc;
        node.setType(varOrFunc.getType());
        node.setLeftValue(true);
    }

    @Override
    public void visit(PrefixExpressionNode node) {
        node.exp.accept(this);
        switch (node.getOp()) {
            case INC:
            case DEC:
                if (!(node.exp.getType() instanceof IntType))
                    throw new SemanticError(node.exp.loc, "Expression's type should be int type");
                if (!node.exp.isLeftValue())
                    throw new SemanticError(node.exp.loc, "Expression should be left value");
                node.setType(IntType.getIntType());
                node.setLeftValue(true);
                break;
            case NEG:
            case POS:
            case BITWISE_NOT:
                if (!(node.exp.getType() instanceof IntType))
                    throw new SemanticError(node.exp.loc, "Expression's type should be int type");
                node.setType(IntType.getIntType());
                node.setLeftValue(false);
                break;
            case LOGIC_NOT:
                if (!(node.exp.getType() instanceof BoolType))
                    throw new SemanticError(node.exp.loc, "Expression's type should be bool type");
                node.setType(BoolType.getBoolType());
                node.setLeftValue(false);
                break;
            default:
                throw new CompilerError(node.loc, "Invalid prefix operator");
        }
    }

    @Override
    public void visit(NewExpressionNode node) {
        if (node.getExprList() != null) {
            for (ExpressionNode exprNode : node.getExprList()) {
                exprNode.accept(this);
                if (!(exprNode.getType() instanceof IntType))
                    throw new SemanticError(exprNode.loc, "Expression's type should be int type");
            }
        }
        node.setType(node.getNewType().getType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        node.getLhs().accept(this);
        node.getRhs().accept(this);
        if (node.getLhs().getType() instanceof StringType && node.getRhs().getType() instanceof StringType) {
            switch (node.getOp()) {
                case ADD:
                    node.setType(StringType.getStringType());
                    break;
                case LESS:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case EQUAL:
                case UNEQUAL:
                    node.setType(BoolType.getBoolType());
                    break;
                default:
                    throw new CompilerError(node.loc, "No such binary operator for string type");
            }
        } else {
            switch (node.getOp()) {
                case ADD:
                case SUB:
                case MUL:
                case DIV:
                case MOD:
                case SHL:
                case SHR:
                case BITWISE_OR:
                case BITWISE_AND:
                case BITWISE_XOR:
                    if (!(node.getLhs().getType() instanceof IntType && node.getRhs().getType() instanceof IntType))
                        throw new SemanticError(node.loc, "LHS and RHS should both be int type");
                    node.setType(IntType.getIntType());
                    break;
                case UNEQUAL:
                case EQUAL:
                    if (checkBinType(node.getLhs().getType(), node.getRhs().getType()))
                        throw new SemanticError(node.loc, "Expression's type not match");
                    node.setType(BoolType.getBoolType());
                    break;
                case GREATER_EQUAL:
                case LESS_EQUAL:
                case GREATER:
                case LESS:
                    if (!(node.getLhs().getType() instanceof IntType && node.getRhs().getType() instanceof IntType))
                        throw new SemanticError(node.loc, "LHS and RHS should both be int type");
                    node.setType(BoolType.getBoolType());
                    break;
                case LOGIC_OR:
                case LOGIC_AND:
                    if (!(node.getLhs().getType() instanceof BoolType && node.getRhs().getType() instanceof BoolType))
                        throw new SemanticError(node.loc, "LHS and RHS should both be bool type");
                    node.setType(BoolType.getBoolType());
                    break;
                default:
                    throw new CompilerError(node.loc, "Invalid binary operator");
            }
        }
        node.setLeftValue(false);
    }

    private boolean checkBinType(Type l, Type r) {
        if (l instanceof VoidType || r instanceof VoidType) return true;
        if (l.equals(r)) return false;
        if (l instanceof NullType) return !(r instanceof ArrayType || r instanceof ClassType);
        if (r instanceof NullType) return !(l instanceof ArrayType || l instanceof ClassType);
        return true;
    }

    @Override
    public void visit(AssignExpressionNode node) {
        node.getLhs().accept(this);
        node.getRhs().accept(this);
        if (!node.getLhs().isLeftValue())
            throw new SemanticError(node.getLhs().loc, "LHS should be left value");
        if (checkAssignType(node.getLhs().getType(), node.getRhs().getType()))
            throw new SemanticError(node.loc, "LHS's type and RHS's type not match");
        node.setType(node.getLhs().getType());
        node.setLeftValue(false);
    }

    private boolean checkAssignType(Type l, Type r) {
        if (l instanceof VoidType || r instanceof VoidType) return true;
        if (l.equals(r)) return false;
        if (l instanceof NullType) return true;
        if (r instanceof NullType) return !(l instanceof ArrayType || l instanceof ClassType);
        return true;
    }

    @Override
    public void visit(IdExpressionNode node) {
        Entity entity = currentScope.getVarFunc(node.loc, node.getName());
        if (entity instanceof VarEntity) {
            node.setEntity((VarEntity) entity);
            node.setLeftValue(true);
        } else if (entity instanceof FuncEntity) {
            currentFuncEntity = (FuncEntity) entity;
            node.setLeftValue(false);
        } else throw new SemanticError(node.loc, "Invalid ID");
        node.setType(entity.getType());
    }

    @Override
    public void visit(ThisExpressionNode node) {
        Entity entity = currentScope.getVarFunc(node.loc, "this");
        if (!(entity instanceof VarEntity)) throw new SemanticError(node.loc, "Invalid entity type");
        node.setType(entity.getType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(NumExpressionNode node) {
        node.setType(IntType.getIntType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(StringExpressionNode node) {
        node.setType(StringType.getStringType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(BoolExpressionNode node) {
        node.setType(BoolType.getBoolType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(NullExpressionNode node) {
        node.setType(NullType.getNullType());
        node.setLeftValue(false);
    }
}

