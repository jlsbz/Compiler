package ASTNode;
import FrontEnd.ASTVisitor;



public class ArrayExpressionNode extends ExpressionNode
{
    public ExpressionNode arr, sub;

    public ArrayExpressionNode(int line)
    {
        this.arr = null;
        this.sub = null;
        this.line = line;
    }

    public ArrayExpressionNode(ExpressionNode arr, ExpressionNode sub, int line)
    {
        this.arr = arr;
        this.sub = sub;
        this.line = line;
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
