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
        for (DefinitionNode declNode : node.getDefs()) {
            if (declNode instanceof VariableDefinitionNode
                    || declNode instanceof FunctionDefinitionNode
                    || declNode instanceof ClassDefinitionNode)
                declNode.accept(this);
            else throw new CompilerError(declNode.line, "Invalid declNode");
        }
    }

    @Override
    public void visit(VariableDefinitionNode node) {
        if (node.getType().getType() instanceof ClassType) {
            String className = ((ClassType) node.getType().getType()).getName();
            currentScope.get(node.line, className, "@C" + className);
        }
        if (node.exp != null) {
            node.exp.accept(this);
            if (checkVarExpr(node)) throw new SemanticError(node.line, "Invalid initialization type");
        }
        currentScope.put(node.line, node.getName(), "@V" + node.getName(), new VarEntity(node));
    }

    private boolean checkVarExpr(VariableDefinitionNode node) {
        if (node.exp.getType() instanceof NullType)
            return !(node.getType().getType() instanceof ClassType || node.getType().getType() instanceof ArrayType);
        if (node.getType().getType() instanceof VoidType || node.exp.getType() instanceof VoidType) return true;
        return !node.getType().getType().equals(node.exp.getType());
    }

    @Override
    public void visit(FunctionDefinitionNode node) {
        FuncEntity entity = (FuncEntity) currentScope.get(node.line, node.getName(), "@F" + node.getName());
        if (entity.getReturnType() instanceof ClassType)
            globalScope.get(node.line, ((ClassType) entity.getReturnType()).getName(), "@C" + ((ClassType) entity.getReturnType()).getName());
        currentReturnType = entity.getReturnType();
        node.getBody().setScope(currentScope);
        currentScope = node.getBody().getScope();
        if (currentClassType != null) {
            currentScope.put(node.line, "this", "@Vthis", new VarEntity("this", currentClassType));
            if (node.getIsConstruct() && !node.getName().equals(currentClassType.getName()))
                throw new SemanticError(node.line, "Constructor's name should be the same as the class's name");
        }
        for (VariableDefinitionNode varDeclNode : node.getParameterList()) {
            if (varDeclNode.exp != null)
                throw new SemanticError(varDeclNode.line, "Function's parameters should have no assignment");
            varDeclNode.accept(this);
        }
        node.getBody().accept(this);
    }

    @Override
    public void visit(ClassDefinitionNode node) {
        ClassEntity entity = (ClassEntity) globalScope.get(node.line, node.getName(), "@C" + node.getName());
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
            } else throw new CompilerError(node.line, "Invalid statement in blinek");
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
            throw new SemanticError(node.getCondition().line, "Condition should be boolean type");
        if (node.getThenStmt() != null) node.getThenStmt().accept(this);
        if (node.getElseStmt() != null) node.getElseStmt().accept(this);
    }

    @Override
    public void visit(WhileStatementNode node) {
        ++inLoop;
        node.getCondition().accept(this);
        if (!(node.getCondition().getType() instanceof BoolType))
            throw new SemanticError(node.getCondition().line, "Condition should be boolean type");
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
                throw new SemanticError(node.line, "Condition should be boolean type");
        }
        if (node.getUpdate() != null) node.getUpdate().accept(this);
        if (node.getStmt() != null) node.getStmt().accept(this);
        --inLoop;
    }

    @Override
    public void visit(ContinueStatementNode node) {
        if (inLoop == 0) throw new SemanticError(node.line, "\"continue\" should be in the loop");
    }

    @Override
    public void visit(BreakStatementNode node) {
        if (inLoop == 0) throw new SemanticError(node.line, "\"break\" should be in the loop");
    }

    @Override
    public void visit(ReturnStatementNode node) {
        if (currentReturnType instanceof VoidType || currentReturnType == null) {
            if (node.exp != null) throw new SemanticError(node.line, "\"return\" should return nothing");
        } else {
            if (node.exp == null)
                throw new SemanticError(node.line, "\"return\" should return something");
            node.exp.accept(this);
            if (checkReturn(node.exp.getType()))
                throw new SemanticError(node.line, "Return type not match");
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
            throw new SemanticError(node.line, "Expression's type should be int type");
        if (!node.exp.isLeftValue())
            throw new SemanticError(node.line, "Expression should be left value");
        node.setType(IntType.getIntType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(FunctionCallExpressionNode node) {
        node.exp.accept(this);
        if (!(node.exp.getType() instanceof FuncType))
            throw new SemanticError(node.line, "Expression's type should be function type");
        FuncEntity entity = currentFuncEntity;
        node.setFuncEntity(entity);
        int paraNum = entity.getParameters().size();
        if (paraNum != node.getParaList().size())
            throw new SemanticError(node.line, "Parameter number don't match");
        for (int i = 0; i < paraNum; ++i) {
            node.getParaList().get(i).accept(this);
            Type exprType = node.getParaList().get(i).getType(), paraType = entity.getParameters().get(i).getType();
            int line = node.getParaList().get(i).line;
            if (checkFuncCall(exprType, paraType)) throw new SemanticError(line, "Parameter's type not match");
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
            throw new SemanticError(node.getArr().line, "Expression's type should be array type");
        node.getSub().accept(this);
        if (!(node.getSub().getType() instanceof IntType))
            throw new SemanticError(node.getSub().line, "Expression's type should be int type");
        node.setType(((ArrayType) node.getArr().getType()).getBaseType());
        node.setLeftValue(true);
    }

    @Override
    public void visit(MemberExpressionNode node) {
        node.exp.accept(this);
        String className;
        if (node.exp.getType() instanceof ArrayType) className = "array";
        else if (node.exp.getType() instanceof StringType) className = "string";
        else if (node.exp.getType() instanceof ClassType)
            className = ((ClassType) node.exp.getType()).getName();
        else throw new SemanticError(node.exp.line, "Expression should be class type");
        ClassEntity entity = (ClassEntity) currentScope.get(node.exp.line, className, "@C" + className);
        Entity varOrFunc = entity.getScope().selfGetVarFunc(node.line, node.getName());
        if (varOrFunc instanceof FuncEntity) currentFuncEntity = (FuncEntity) varOrFunc;
        node.setType(varOrFunc.getType());
        node.setLeftValue(true);
    }

    @Override
    public void visit(PrefixExpressionNode node) {
        node.exp.accept(this);
        switch (node.op) {
            case INC:
            case DEC:
                if (!(node.exp.getType() instanceof IntType))
                    throw new SemanticError(node.exp.line, "Expression's type should be int type");
                if (!node.exp.isLeftValue())
                    throw new SemanticError(node.exp.line, "Expression should be left value");
                node.setType(IntType.getIntType());
                node.setLeftValue(true);
                break;
            case NEG:
            case POS:
            case BITWISE_NOT:
                if (!(node.exp.getType() instanceof IntType))
                    throw new SemanticError(node.exp.line, "Expression's type should be int type");
                node.setType(IntType.getIntType());
                node.setLeftValue(false);
                break;
            case LOGIC_NOT:
                if (!(node.exp.getType() instanceof BoolType))
                    throw new SemanticError(node.exp.line, "Expression's type should be bool type");
                node.setType(BoolType.getBoolType());
                node.setLeftValue(false);
                break;
            default:
                throw new CompilerError(node.line, "Invalid prefix operator");
        }
    }

    @Override
    public void visit(NewExpressionNode node) {
        if (node.getExpList() != null) {
            for (ExpressionNode exprNode : node.getExpList()) {
                exprNode.accept(this);
                if (!(exprNode.getType() instanceof IntType))
                    throw new SemanticError(exprNode.line, "Expression's type should be int type");
            }
        }
        node.setType(node.getNewType().getType());
        node.setLeftValue(false);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        node.lhs.accept(this);
        node.rhs.accept(this);
        if (node.lhs.getType() instanceof StringType && node.rhs.getType() instanceof StringType) {
            switch (node.op) {
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
                    throw new CompilerError(node.line, "No such binary operator for string type");
            }
        } else {
            switch (node.op) {
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
                    if (!(node.lhs.getType() instanceof IntType && node.rhs.getType() instanceof IntType))
                        throw new SemanticError(node.line, "LHS and RHS should both be int type");
                    node.setType(IntType.getIntType());
                    break;
                case UNEQUAL:
                case EQUAL:
                    if (checkBinType(node.lhs.getType(), node.rhs.getType()))
                        throw new SemanticError(node.line, "Expression's type not match");
                    node.setType(BoolType.getBoolType());
                    break;
                case GREATER_EQUAL:
                case LESS_EQUAL:
                case GREATER:
                case LESS:
                    if (!(node.lhs.getType() instanceof IntType && node.rhs.getType() instanceof IntType))
                        throw new SemanticError(node.line, "LHS and RHS should both be int type");
                    node.setType(BoolType.getBoolType());
                    break;
                case LOGIC_OR:
                case LOGIC_AND:
                    if (!(node.lhs.getType() instanceof BoolType && node.rhs.getType() instanceof BoolType))
                        throw new SemanticError(node.line, "LHS and RHS should both be bool type");
                    node.setType(BoolType.getBoolType());
                    break;
                default:
                    throw new CompilerError(node.line, "Invalid binary operator");
            }
        }
        node.setLeftValue(false);
    }

    private boolean checkBinType(Type lhs, Type rhs) {
        if (lhs instanceof VoidType || rhs instanceof VoidType) return true;
        if (lhs.equals(rhs)) return false;
        if (lhs instanceof NullType) return !(rhs instanceof ArrayType || rhs instanceof ClassType);
        if (rhs instanceof NullType) return !(lhs instanceof ArrayType || lhs instanceof ClassType);
        return true;
    }

    @Override
    public void visit(AssignExpressionNode node) {
        node.lhs.accept(this);
        node.rhs.accept(this);
        if (!node.lhs.isLeftValue())
            throw new SemanticError(node.lhs.line, "LHS should be left value");
        if (checkAssignType(node.lhs.getType(), node.rhs.getType()))
            throw new SemanticError(node.line, "LHS's type and RHS's type not match");
        node.setType(node.lhs.getType());
        node.setLeftValue(false);
    }

    private boolean checkAssignType(Type lhs, Type rhs) {
        if (lhs instanceof VoidType || rhs instanceof VoidType) return true;
        if (lhs.equals(rhs)) return false;
        if (lhs instanceof NullType) return true;
        if (rhs instanceof NullType) return !(lhs instanceof ArrayType || lhs instanceof ClassType);
        return true;
    }

    @Override
    public void visit(IdExpressionNode node) {
        Entity entity = currentScope.getVarFunc(node.line, node.getName());
        if (entity instanceof VarEntity) {
            node.setEntity((VarEntity) entity);
            node.setLeftValue(true);
        } else if (entity instanceof FuncEntity) {
            currentFuncEntity = (FuncEntity) entity;
            node.setLeftValue(false);
        } else throw new SemanticError(node.line, "Invalid ID");
        node.setType(entity.getType());
    }

    @Override
    public void visit(ThisExpressionNode node) {
        Entity entity = currentScope.getVarFunc(node.line, "this");
        if (!(entity instanceof VarEntity)) throw new SemanticError(node.line, "Invalid entity type");
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

