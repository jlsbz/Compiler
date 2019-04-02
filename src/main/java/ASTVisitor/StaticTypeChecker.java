package ASTVisitor;

import ASTnode.*;
import Error.*;
import Scope.*;

import static ASTnode.PrimitiveTypeNode.PriType.*;

public class StaticTypeChecker extends ASTVisitor {

    Scope toplevelScope;

    public void checkStaticType(ProgramNode prog) throws SemanticError {
        toplevelScope = (Scope) (prog.scope);
        visit(prog);
    }

    @Override
    public void visit(ReferenceNode node) {
        if (node.referenceType == ReferenceNode.ReferenceType.VARIABLE) {
            node.exprType = ((ExpressionDefinitionNode) node.definitionNode).variableType;
            node.leftValue = true;
        }
    }

    @Override
    public void visit(ThisNode node) {
        ASTNode classDefinition = node;
        while (!(classDefinition instanceof ClassDefinitionNode))
            classDefinition = classDefinition.parent;
        node.exprType = new ClassTypeNode(((ClassDefinitionNode) classDefinition).className);
    }

    @Override
    public void visit(MemberAccessExpressionNode node) throws SemanticError {
        try {
            super.visit(node);
        } catch (SemanticError excpetion) {
        }
        ClassDefinitionNode classDefinition;
        if (!(node.caller.exprType instanceof ClassTypeNode))
            if (node.caller.exprType instanceof ArrayTypeNode)
                classDefinition = toplevelScope.classDefinitionMap.get("array__");
            else
                throw new SemanticError(node.line, "caller must be of ClassType");
        else
            classDefinition = toplevelScope.classDefinitionMap
                    .get(((ClassTypeNode) (node.caller.exprType)).referenceClassName);
        if (node.member instanceof ReferenceNode) {
            ReferenceNode member = (ReferenceNode) node.member;
            member.referenceType = ReferenceNode.ReferenceType.VARIABLE;
            // if (member.referenceType != ReferenceNode.ReferenceType.VARIABLE)
            // throw new SemanticException(node.line, "member must be a variable reference
            // or method call");
            ExpressionDefinitionNode memberVariableDefinition = classDefinition.scope.variableDefinitionMap
                    .get(member.referenceName);
            if (memberVariableDefinition == null)
                throw new SemanticError(node.line,
                        "class \"" + classDefinition.className + "\" does not has such a member");
            member.definitionNode = memberVariableDefinition;
            node.exprType = memberVariableDefinition.variableType;
            node.leftValue = true;
        } else if (node.member instanceof MethodCallExpressionNode) {
            ReferenceNode member = (ReferenceNode) ((MethodCallExpressionNode) node.member).caller;
            member.referenceType = ReferenceNode.ReferenceType.METHOD;
            // if (member.referenceType != ReferenceNode.ReferenceType.METHOD)
            // throw new SemanticError(node.line, "member must be a variable reference
            // or method call");
            if (node.caller.exprType instanceof ArrayTypeNode) {
                if (member.referenceName.equals("size")) {
                    node.exprType = new PrimitiveTypeNode("int");
                    member.definitionNode = new MethodDefinitionNode();
                    member.referenceName = "_array_size";
                    return;
                }
            }
            MethodDefinitionNode memberMethodDefinition = classDefinition.scope.methodDefinitionMap
                    .get(member.referenceName);
            if (memberMethodDefinition == null)
                throw new SemanticError(node.line,
                        "class \"" + classDefinition.className + "\" does not has such a member");
            node.exprType = memberMethodDefinition.returnType;
        } else
            throw new SemanticError(node.line, "member must be a variable reference or method call");
    }

    @Override
    public void visit(IndexAccessExpressionNode node) throws SemanticError {
        super.visit(node);
        if (!(node.caller.exprType instanceof ArrayTypeNode))
            throw new SemanticError(node.line, "the index access caller must be an array");
        if (!(node.index.exprType instanceof PrimitiveTypeNode))
            throw new SemanticError(node.line, "the index must be int");
        if (((PrimitiveTypeNode) (node.index.exprType)).type != INT)
            throw new SemanticError(node.line, "the index must be int");
        node.exprType = ((ArrayTypeNode) node.caller.exprType).innerTypeNode;
        node.leftValue = true;
    }

    @Override
    public void visit(MethodCallExpressionNode node) throws SemanticError {
        super.visit(node);
        if (!(node.caller instanceof ReferenceNode))
            throw new SemanticError(node.line, "caller must be a method reference");
        if (((ReferenceNode) node.caller).referenceType != ReferenceNode.ReferenceType.METHOD)
            throw new SemanticError(node.line, "caller must be a method reference");
        String methodName = ((ReferenceNode) node.caller).referenceName;
        MethodDefinitionNode methodDefinition = null;
        ASTNode ancestor = node.parent;
        while (ancestor.scope == null || ancestor.scope.methodDefinitionMap.get(methodName) == null) {
            if (ancestor.parent == null)
                throw new SemanticError(node.line, "no such method");
            ancestor = ancestor.parent;
        }
        methodDefinition = ancestor.scope.methodDefinitionMap.get(methodName);
        if (methodDefinition.formalArgumentList.size() != node.actualParameterList.size())
            throw new SemanticError(node.line, "number of parameter error");
        for (int i = 0; i < node.actualParameterList.size(); ++i) {
            ExpressionDefinitionNode formalArgument = methodDefinition.formalArgumentList.get(i);
            ExpressionStatementNode actualArgument = node.actualParameterList.get(i);
            if (!formalArgument.variableType.equalTo(actualArgument.exprType))
                throw new SemanticError(node.line, "variable type of parameter error");
        }
        node.exprType = methodDefinition.returnType;
    }

    @Override
    public void visit(NewExpressionNode node) throws SemanticError {
        super.visit(node);
        node.exprType = node.variableType;
    }

    @Override
    public void visit(UnaryExpressionNode node) throws SemanticError {
        super.visit(node);
        switch (node.op) {
            case PREFIX_DEC:
                if (!node.inner.leftValue || !node.inner.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "--x must operate on leftValue int");
                node.leftValue = true;
                break;
            case PREFIX_INC:
                if (!node.inner.leftValue || !node.inner.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "++x must operate on leftValue int");
                node.leftValue = true;
                break;
            case POSTFIX_DEC:
                if (!node.inner.leftValue)
                    throw new SemanticError(node.line, "x-- must operate on leftValue int");
                if (!node.inner.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "x-- must operate on int");
                break;
            case POSTFIX_INC:
                if (!node.inner.leftValue)
                    throw new SemanticError(node.line, "x++ must operate on leftValue int");
                if (!node.inner.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "x++ must operate on int");
                break;
        }
        node.exprType = node.inner.exprType;
    }

    @Override
    public void visit(BinaryExpressionNode node) throws SemanticError {
        super.visit(node);
        ExpressionStatementNode lhs = node.lhs;
        ExpressionStatementNode rhs = node.rhs;
        switch (node.op) {
            case ADD:
                if (lhs.exprType instanceof ClassTypeNode && rhs.exprType instanceof ClassTypeNode) {
                    if (!((ClassTypeNode) lhs.exprType).referenceClassName.equals("string")
                            || !((ClassTypeNode) rhs.exprType).referenceClassName.equals("string"))
                        throw new SemanticError(node.line, "only string class instance can add");
                } else if (!lhs.exprType.isPrimitiveType(INT) || !rhs.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "only int can add");
                node.exprType = lhs.exprType;
                break;
            case OR:
            case AND:
            case XOR:
            case DIV:
            case MOD:
            case MUL:
            case SUB:
            case LSHIFT:
            case RSHIFT:
                if (!lhs.exprType.isPrimitiveType(INT) || !rhs.exprType.isPrimitiveType(INT))
                    throw new SemanticError(node.line, "opt like this must operate on int");
                node.exprType = lhs.exprType;
                break;
            case ASSIGN:
                if (!lhs.leftValue)
                    throw new SemanticError(node.line, "value must be assigned to a leftValue");
                if (!lhs.exprType.equalTo(rhs.exprType))
                    throw new SemanticError(node.line, "value must be assigned to same type");
                node.exprType = lhs.exprType;
                break;
            case EQ:
            case NEQ:
                if (!lhs.exprType.isPrimitiveType(NULL) && !rhs.exprType.isPrimitiveType(NULL))
                    if (!lhs.exprType.getTypeName().equals(rhs.exprType.getTypeName()))
                        throw new SemanticError(node.line, "binary operator must operate on the same type");
                node.exprType = new PrimitiveTypeNode("bool");
                break;
            case LOGAND:
            case LOGOR:
                if ((!lhs.exprType.isPrimitiveType(BOOL) && !lhs.exprType.isPrimitiveType(INT))
                        || (!rhs.exprType.isPrimitiveType(BOOL) && !rhs.exprType.isPrimitiveType(INT)))
                    throw new SemanticError(node.line, "lhs and rhs must be int or bool");
                node.exprType = new PrimitiveTypeNode("bool");
                break;
            case GE:
            case LE:
            case GT:
            case LT:
                if (!lhs.exprType.equalTo(rhs.exprType))
                    throw new SemanticError(node.line, "type of lhs and rhs must be the same");
                if (!lhs.exprType.isPrimitiveType(INT) && !lhs.exprType.isPrimitiveType(BOOL)
                        && !lhs.exprType.equalTo(new ClassTypeNode("string")))
                    throw new SemanticError(node.line, "only support relation btw int, bool, string");
                node.exprType = new PrimitiveTypeNode("bool");
                break;
            default:
                if (!lhs.exprType.getTypeName().equals(rhs.exprType.getTypeName()))
                    throw new SemanticError(node.line, "binary operator must operate on the same type");
                node.exprType = lhs.exprType;
        }
    }

    @Override
    public void visit(ForStatementNode node) throws SemanticError {
        super.visit(node);
        if (node.condition == null)
            return;
        if (!node.condition.exprType.isPrimitiveType(BOOL))
            throw new SemanticError(node.line, "condition must be type of bool");
    }

    @Override
    public void visit(IfStatementNode node) throws SemanticError {
        super.visit(node);
        if (!node.condition.exprType.isPrimitiveType(BOOL))
            throw new SemanticError(node.line, "condition must be type of bool");
    }

    @Override
    public void visit(WhileStatementNode node) throws SemanticError {
        super.visit(node);
        if (!node.condition.exprType.isPrimitiveType(BOOL))
            throw new SemanticError(node.line, "condition must be type of bool");
    }

    @Override
    public void visit(ExpressionDefinitionNode node) throws SemanticError {
        super.visit(node);
        if (node.initValue == null)
            return;
        VariableTypeNode variableType = node.variableType;
        VariableTypeNode initType = node.initValue.exprType;
        if (variableType.getTypeName().equals("string") && initType.isPrimitiveType(NULL))
            throw new SemanticError(node.line, "a string cannot be initialized to null");
        if (variableType instanceof ArrayTypeNode && initType instanceof ArrayTypeNode)
            if (((ArrayTypeNode) variableType).contain((ArrayTypeNode) initType))
                variableType = initType;
            else
                throw new SemanticError(node.line, "dim of array error");
        else if (!variableType.equalTo(initType))
            throw new SemanticError(node.line, "init value must be assigned to same type");
    }

    @Override
    public void visit(MethodDefinitionNode node) throws SemanticError {
        super.visit(node);
        for (ExpressionDefinitionNode item : node.formalArgumentList)
            if (item.variableType.isPrimitiveType(VOID))
                throw new SemanticError(node.line, "parameter cannot be of void type");
    }

    @Override
    public void visit(ReturnStatementNode node) throws SemanticError {
        super.visit(node);
        ASTNode methodDefinition = node.parent;
        while (!(methodDefinition instanceof MethodDefinitionNode))
            methodDefinition = methodDefinition.parent;
        if (node.returnValue != null)
            if (!node.returnValue.exprType.equalTo(((MethodDefinitionNode) methodDefinition).returnType))
                throw new SemanticError(node.line, "return value type error");
    }
}
