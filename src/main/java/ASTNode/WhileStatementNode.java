package ASTNode;
import FrontEnd.ASTVisitor;

public class WhileStatementNode extends StatementNode
{
    public ExpressionNode condition;
    public StatementNode stmt;

    public WhileStatementNode(ExpressionNode condition, StatementNode stmt, Location config)
    {
        this.condition = condition;
        this.stmt = stmt;
        this.loc = config;
    }

    public ExpressionNode getCondition()
    {
        return condition;
    }

    public StatementNode getStmt()
    {
        return stmt;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
