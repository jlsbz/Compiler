package ASTNode;
import FrontEnd.ASTVisitor;

public class PrefixExpressionNode extends ExpressionNode
{
    public enum prefixOp {
        INC, DEC, POS, NEG, LOGIC_NOT, BITWISE_NOT
    }

    public prefixOp op;
    public ExpressionNode exp;

    public PrefixExpressionNode(int line)
    {
        this.op = null;
        this.exp = null;
        this.line = line;
    }

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

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        exp.printInformation(line + 1);
    }

}
