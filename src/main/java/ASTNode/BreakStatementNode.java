package ASTNode;
import FrontEnd.ASTVisitor;

public class BreakStatementNode extends StatementNode
{
    public BreakStatementNode(Location config)
    {
        this.loc = config;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
