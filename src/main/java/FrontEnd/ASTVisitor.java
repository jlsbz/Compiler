package FrontEnd;
import ASTNode.*;

public interface ASTVisitor
{
    void visit(ProgramNode node);
    void visit(FunctionDefinitionNode node);
    void visit(ClassDefinitionNode node);
    void visit(VariableDefinitionNode node);
    void visit(BlockStatementNode node);
    void visit(ExpressionStatementNode node);
    void visit(IfStatementNode node);
    void visit(WhileStatementNode node);
    void visit(ForStatementNode node);
    void visit(ContinueStatementNode node);
    void visit(BreakStatementNode node);
    void visit(ReturnStatementNode node);
    void visit(SuffixExpressionNode node);
    void visit(FunctionCallExpressionNode node);
    void visit(ArrayExpressionNode node);
    void visit(MethodExpressionNode node);
    void visit(PrefixExpressionNode node);
    void visit(NewExpressionNode node);
    void visit(BinaryExpressionNode node);
    void visit(AssignExpressionNode node);
    void visit(IdExpressionNode node);
    void visit(ThisExpressionNode node);
    void visit(NumExpressionNode node);
    void visit(StringExpressionNode node);
    void visit(BoolExpressionNode node);
    void visit(NullExpressionNode node);
    void visit(TypeNode node);
}
