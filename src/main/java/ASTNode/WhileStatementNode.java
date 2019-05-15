package ASTNode;
import FrontEnd.ASTVisitor;

public class WhileStatementNode extends StatementNode
{
    public ExpressionNode condition;
    public StatementNode stmt;

    public WhileStatementNode(int line)
    {
        this.condition = null;
        this.stmt = null;
        this.line = line;
    }

    public WhileStatementNode(ExpressionNode condition, StatementNode stmt, int line)
    {
        this.condition = condition;
        this.stmt = stmt;
        this.line = line;
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
