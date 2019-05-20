package ASTNode;

import static Util.Print.*;
import FrontEnd.ASTVisitor;

public class NullExpressionNode extends ExpressionNode
{
    public NullExpressionNode(int line)
    {
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
        return obj instanceof NullExpressionNode;
    }

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        printStrWtihSpace(line, "null");
    }

}
