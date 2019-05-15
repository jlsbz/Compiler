package ASTNode;
import FrontEnd.ASTVisitor;

public class IfStatementNode extends StatementNode
{
    private ExpressionNode condition;
    private StatementNode thenStmt, elseStmt;

    public IfStatementNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt, int line)
    {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
        this.line = line;
    }

    public ExpressionNode getCondition()
    {
        return condition;
    }

    public StatementNode getThenStmt()
    {
        return thenStmt;
    }

    public StatementNode getElseStmt()
    {
        return elseStmt;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
