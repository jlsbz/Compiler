package ASTNode;
import FrontEnd.ASTVisitor;

public class ContinueStatementNode extends StatementNode{

    public ContinueStatementNode(int line)
    {
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
