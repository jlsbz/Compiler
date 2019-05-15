package ASTNode;
import FrontEnd.ASTVisitor;

public class ThisExpressionNode extends ExpressionNode
{
    public ThisExpressionNode(int line)
    {
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        return true;
    }
}
