package ASTNode;
import FrontEnd.ASTVisitor;

import static Util.Print.printSpaceAndStr;

public class MemberExpressionNode extends ExpressionNode
{
    public ExpressionNode exp;
    public String name;

    public MemberExpressionNode(int line)
    {
        this.exp = null;
        this.name = null;
        this.line = line;
    }

    public MemberExpressionNode(ExpressionNode exp, String name, int line)
    {
        this.exp = exp;
        this.name = name;
        this.line = line;
    }


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
        if (!(obj instanceof MemberExpressionNode)) return false;
        return exp.equals(((MemberExpressionNode) obj).exp) && name == ((MemberExpressionNode) obj).getName();
    }

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        printSpaceAndStr(line, "name: " + name);
    }

}
