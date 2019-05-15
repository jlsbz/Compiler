package ASTNode;
import FrontEnd.ASTVisitor;

public class BreakStatementNode extends StatementNode
{
    public BreakStatementNode(int line)
    {
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
