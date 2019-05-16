package ASTNode;
import FrontEnd.ASTVisitor;

public class IfStatementNode extends StatementNode
{
<<<<<<< HEAD
    private ExpressionNode condition;
    private StatementNode thenStmt, elseStmt;

    public IfStatementNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt, Location config)
    {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
        this.loc = config;
    }
=======
    public ExpressionNode condition;
    public StatementNode thenStmt;
    public StatementNode elseStmt;

    public IfStatementNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt, int line)
    {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
        this.line = line;
    }
    public IfStatementNode(int line)
    {
        this.condition = null;
        this.thenStmt = null;
        this.elseStmt = null;
        this.line = line;
    }

>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦

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
