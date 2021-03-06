package ASTNode;
import FrontEnd.ASTVisitor;

public class SuffixExpressionNode extends ExpressionNode
{
    public enum suffixOp{
        INC, DEC
    }

    public suffixOp op;
    public ExpressionNode exp;

    public SuffixExpressionNode(int line)
    {
        this.op = null;
        this.exp = null;
        this.line = line;
    }

    public SuffixExpressionNode(suffixOp op, ExpressionNode exp, int line)
    {
        this.op = op;
        this.exp = exp;
        this.line = line;
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

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        exp.printInformation(line + 1);
    }

}
