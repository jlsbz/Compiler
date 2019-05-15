package ASTNode;
import FrontEnd.ASTVisitor;

public class SuffixExpressionNode extends ExpressionNode
{
    public enum suffixOp{
        INC, DEC
    }

    public suffixOp op;
    public ExpressionNode exp;

    public SuffixExpressionNode(suffixOp op, ExpressionNode exp, Location config)
    {
        this.op = op;
        this.exp = exp;
        this.loc = config;
    }

    public suffixOp getOp()
    {
        return op;
    }

    //public ExpressionNode getExp(){return exp;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof SuffixExpressionNode)) return false;
        return op == ((SuffixExpressionNode) obj).getOp() && exp.equals(((SuffixExpressionNode) obj).exp);
    }
}
