package ASTNode;
import FrontEnd.ASTVisitor;

public class ContinueStatementNode extends StatementNode{

    public ContinueStatementNode(Location config)
    {
        this.loc = config;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
