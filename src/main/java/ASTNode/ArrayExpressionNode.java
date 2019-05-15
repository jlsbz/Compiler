package ASTNode;
import FrontEnd.ASTVisitor;



public class ArrayExpressionNode extends ExpressionNode
{
    private ExpressionNode arr, sub;

    public ArrayExpressionNode(ExpressionNode arr, ExpressionNode sub, Location loc)
    {
        this.arr = arr;
        this.sub = sub;
        this.loc = loc;
    }

    public ExpressionNode getArr()
    {
        return arr;
    }

    public ExpressionNode getSub()
    {
        return sub;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof ArrayExpressionNode)) return false;
        return arr.equals(((ArrayExpressionNode) obj).getArr()) && sub.equals(((ArrayExpressionNode) obj).getSub());
    }
}
