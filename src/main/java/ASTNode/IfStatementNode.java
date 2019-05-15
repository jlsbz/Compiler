package ASTNode;
import FrontEnd.ASTVisitor;

public class IfStatementNode extends StatementNode
{
    private ExpressionNode condition;
    private StatementNode thenStmt, elseStmt;

    public IfStatementNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt, Location config)
    {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
        this.loc = config;
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
