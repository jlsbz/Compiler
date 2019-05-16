package ASTNode;

import static Util.Print.*;
import FrontEnd.ASTVisitor;

public class StringExpressionNode extends ExpressionNode
{
    public String str;

    public StringExpressionNode(int line)
    {
        this.str = null;
        this.line = line;
    }

    public StringExpressionNode(String str, int line)
    {
        this.str = str;
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof StringExpressionNode)) return false;
        return str == ((StringExpressionNode) obj).str;
    }

    @Override public void printInformation(int line) {
        super.printInformation(line);
        printStr(str);
    }

}
