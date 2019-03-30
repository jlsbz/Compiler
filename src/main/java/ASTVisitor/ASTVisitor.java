package ASTVisitor;

import ASTnode.*;
import Error.*;

public abstract class ASTVisitor {
    public void visit(ASTNode node) throws SemanticError {
        if (node instanceof ProgramNode)
            visit((ProgramNode) node);
        else if (node instanceof ClassDefinitionNode)
            visit((ClassDefinitionNode) node);
        else if (node instanceof MethodDefinitionNode)
            visit((MethodDefinitionNode) node);
        else if (node instanceof BlockNode)
            visit((BlockNode) node);
        else if (node instanceof StatementNode)
            visit((StatementNode) node);
    }

    public void visit(ProgramNode node) throws SemanticError {
        for (ASTNode item : node.childrenList)
            if (item instanceof ClassDefinitionNode)
                visit((ClassDefinitionNode) item);
            else if (item instanceof MethodDefinitionNode)
                visit((MethodDefinitionNode) item);
            else if (item instanceof ExpressionDefinitionNode)
                visit((ExpressionDefinitionNode) item);
    }

    public void visit(ClassDefinitionNode node) throws SemanticError {
        for (ExpressionDefinitionNode item : node.memberVariableList)
            visit(item);
        for (MethodDefinitionNode item : node.memberMethodList)
            visit(item);
        for (MethodDefinitionNode item : node.memberConstructionMethodList)
            visit(item);
    }

    public void visit(MethodDefinitionNode node) throws SemanticError {
        visit(node.returnType);
        for (ExpressionDefinitionNode item : node.formalArgumentList)
            visit(item);
        visit(node.block);
    }

    public void visit(BlockNode node) throws SemanticError {
        for (ASTNode item : node.childList)
            visit(item);
    }

    public void visit(StatementNode node) throws SemanticError {
        if (node instanceof ExpressionStatementNode)
            visit((ExpressionStatementNode) node);
        else if (node instanceof IfStatementNode)
            visit((IfStatementNode) node);
        else if (node instanceof ForStatementNode)
            visit((ForStatementNode) node);
        else if (node instanceof WhileStatementNode)
            visit((WhileStatementNode) node);
        else if (node instanceof ReturnStatementNode)
            visit((ReturnStatementNode) node);
        else if (node instanceof BreakStatementNode)
            visit((BreakStatementNode) node);
        else if (node instanceof ContinueStatementNode)
            visit((ContinueStatementNode) node);
        else if (node instanceof EmptyStatementNode)
            visit((EmptyStatementNode) node);
    }

    public void visit(ExpressionStatementNode node) throws SemanticError {
        if (node instanceof PrimaryExpressionNode)
            visit((PrimaryExpressionNode) node);
        else if (node instanceof ExpressionDefinitionNode)
            visit((ExpressionDefinitionNode) node);
        else if (node instanceof MemberAccessExpressionNode)
            visit((MemberAccessExpressionNode) node);
        else if (node instanceof IndexAccessExpressionNode)
            visit((IndexAccessExpressionNode) node);
        else if (node instanceof MethodCallExpressionNode)
            visit((MethodCallExpressionNode) node);
        else if (node instanceof NewExpressionNode)
            visit((NewExpressionNode) node);
        else if (node instanceof UnaryExpressionNode)
            visit((UnaryExpressionNode) node);
        else if (node instanceof BinaryExpressionNode)
            visit((BinaryExpressionNode) node);
        else if (node instanceof TypeNode)
            visit((TypeNode) node);
        if (node.exprType != null)
            visit((TypeNode) node.exprType);
    }

    public void visit(IfStatementNode node) throws SemanticError {
        visit(node.condition);
        visit(node.ifBlock);
        if (node.elseBlock != null)
            visit(node.elseBlock);
    }

    public void visit(ForStatementNode node) throws SemanticError {
        if (node.init != null)
            visit(node.init);
        if (node.condition != null)
            visit(node.condition);
        if (node.afterBlock != null)
            visit(node.afterBlock);
        visit(node.block);
    }

    public void visit(WhileStatementNode node) throws SemanticError {
        visit(node.condition);
        visit(node.block);
    }

    public void visit(ReturnStatementNode node) throws SemanticError {
        if (node.returnValue != null)
            visit(node.returnValue);
    }

    public void visit(ContinueStatementNode node) throws SemanticError {
    }

    public void visit(BreakStatementNode node) throws SemanticError {
    }

    public void visit(EmptyStatementNode node) {
    }

    public void visit(PrimaryExpressionNode node) throws SemanticError {

        if (node instanceof ReferenceNode)
            visit((ReferenceNode) node);
        if (node instanceof ConstantNode)
            visit((ConstantNode) node);
        if (node instanceof ThisNode)
            visit((ThisNode) node);
    }

    public void visit(ExpressionDefinitionNode node) throws SemanticError {
        visit(node.variableType);
        if (node.initValue != null)
            visit(node.initValue);
    }

    public void visit(MemberAccessExpressionNode node) throws SemanticError {
        visit(node.caller);
        visit(node.member);
    }

    public void visit(IndexAccessExpressionNode node) throws SemanticError {
        visit(node.caller);
        visit(node.index);
    }

    public void visit(MethodCallExpressionNode node) throws SemanticError {
        visit(node.caller);
        for (ExpressionStatementNode item : node.actualParameterList)
            visit(item);
    }

    public void visit(NewExpressionNode node) throws SemanticError {
        visit(node.variableType);
        for (ExpressionStatementNode item : node.actualParameterList)
            visit(item);
    }

    public void visit(UnaryExpressionNode node) throws SemanticError {
        visit(node.inner);
    }

    public void visit(BinaryExpressionNode node) throws SemanticError {
        visit(node.lhs);
        visit(node.rhs);
    }

    public void visit(ReferenceNode node) throws SemanticError {
    }

    public void visit(ConstantNode node) {

    }

    public void visit(ThisNode node) {

    }

    public void visit(TypeNode node) throws SemanticError {
        if (node instanceof MethodTypeNode)
            visit((MethodTypeNode) node);
        else
            visit((VariableTypeNode) node);
    }

    public void visit(MethodTypeNode node) {
    }

    public void visit(VariableTypeNode node) throws SemanticError {
        if (node instanceof ArrayTypeNode)
            visit((ArrayTypeNode) node);
        else
            visit((NonArrayTypeNode) node);
    }

    public void visit(ArrayTypeNode node) throws SemanticError {
        visit(node.innerTypeNode);
        if (node.size != null)
            visit(node.size);
    }

    public void visit(NonArrayTypeNode node) throws SemanticError {
        if (node instanceof PrimitiveTypeNode)
            visit((PrimitiveTypeNode) node);
        else
            visit((ClassTypeNode) node);
    }

    public void visit(PrimitiveTypeNode node) {
    }

    public void visit(ClassTypeNode node) throws SemanticError {
    }
}