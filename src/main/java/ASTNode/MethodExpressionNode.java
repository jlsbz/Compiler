package ASTNode;
import FrontEnd.ASTVisitor;

public class MethodExpressionNode extends ExpressionNode
{
    public ExpressionNode exp;
    public String name;

    public MethodExpressionNode(ExpressionNode exp, String name, Location config)
    {
        this.exp = exp;
        this.name = name;
        this.loc = config;
    }

    //public ExpressionNode getExpr() { return exp; }

    public  String getName()
    {
        return name;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MethodExpressionNode)) return false;
        return exp.equals(((MethodExpressionNode) obj).exp) && name == ((MethodExpressionNode) obj).getName();
    }
}
