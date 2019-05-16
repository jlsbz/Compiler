package ASTNode;
import FrontEnd.ASTVisitor;

public class BoolExpressionNode extends ConstantExpressionNode
{
    public boolean value;

    public BoolExpressionNode(boolean value, int line)
    {
        this.value = value;
        this.line = line;
    }

    //public boolean getValue(){return value;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof BoolExpressionNode)) return false;
        return value == ((BoolExpressionNode) obj).value;
    }
}
