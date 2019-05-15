package ASTNode;
import FrontEnd.ASTVisitor;

public class ThisExpressionNode extends ExpressionNode
{
    public ThisExpressionNode(Location config)
    {
        this.loc = config;
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
