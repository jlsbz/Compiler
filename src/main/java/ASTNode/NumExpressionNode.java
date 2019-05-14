package ASTNode;
import FrontEnd.ASTVisitor;

public class NumExpressionNode extends ExpressionNode
{
    public int value;

    public NumExpressionNode(int value, Location config)
    {
        this.value = value;
        this.loc = config;
    }

    //public int getValue(){return value;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof NumExpressionNode)) return false;
        return value == ((NumExpressionNode) obj).value;
    }
}
