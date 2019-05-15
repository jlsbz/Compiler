package ASTNode;

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

}
