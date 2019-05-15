package FrontEnd;

import ASTNode.*;

abstract public class ScopeBuilder implements ASTVisitor
{
    @Override
    public void visit(ProgramNode node) {}

    @Override
    public void visit(FunctionDefinitionNode node) {}

    @Override
    public void visit(ClassDefinitionNode node) {}

    @Override
    public void visit(VariableDefinitionNode node) {}

    @Override
    public void visit(BlockStatementNode node) {}

    @Override
    public void visit(ExpressionStatementNode node) {}

    @Override
    public void visit(IfStatementNode node) {}

    @Override
    public void visit(WhileStatementNode node) {}

    @Override
    public void visit(ForStatementNode node) {}

    @Override
    public void visit(ContinueStatementNode node) {}

    @Override
    public void visit(BreakStatementNode node) {}

    @Override
    public void visit(ReturnStatementNode node) {}

    @Override
    public void visit(SuffixExpressionNode node) {}

    @Override
    public void visit(FunctionCallExpressionNode node) {}

    @Override
    public void visit(ArrayExpressionNode node) {}

    @Override
    public void visit(MethodExpressionNode node) {}

    @Override
    public void visit(PrefixExpressionNode node) {}

    @Override
    public void visit(NewExpressionNode node) {}

    @Override
    public void visit(BinaryExpressionNode node) {}

    @Override
    public void visit(AssignExpressionNode node) {}

    @Override
    public void visit(IdExpressionNode node) {}

    @Override
    public void visit(ThisExpressionNode node) {}

    @Override
    public void visit(NumExpressionNode node) {}

    @Override
    public void visit(StringExpressionNode node) {}

    @Override
    public void visit(BoolExpressionNode node) {}

    @Override
    public void visit(NullExpressionNode node) {}

    @Override
    public void visit(TypeNode node) {}
}
