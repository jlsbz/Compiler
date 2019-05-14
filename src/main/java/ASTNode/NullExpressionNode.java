package ASTNode;

import FrontEnd.ASTVisitor;

public class NullExpressionNode extends ExpressionNode
{
    public NullExpressionNode(Location config)
    {
        this.loc = config;
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
