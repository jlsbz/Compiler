package ASTNode;
import FrontEnd.ASTVisitor;

public class PrefixExpressionNode extends ExpressionNode
{
    public enum prefixOp {
        INC, DEC, POS, NEG, LOGIC_NOT, BITWISE_NOT
    }

    private prefixOp op;
    public ExpressionNode exp;

    public PrefixExpressionNode(prefixOp op, ExpressionNode exp, int line)
    {
        this.op = op;
        this.exp = exp;
        this.line = line;
    }

    public prefixOp getOp()
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
        if (!(obj instanceof PrefixExpressionNode)) return false;
        return op == ((PrefixExpressionNode) obj).getOp() && exp.equals(((PrefixExpressionNode) obj).exp);
    }
}
