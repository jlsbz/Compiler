package ASTNode;

import FrontEnd.ASTVisitor;

public class AssignExpressionNode extends ExpressionNode
{
    public ExpressionNode lhs, rhs;

    public AssignExpressionNode(int line)
    {
        this.lhs = null;
        this.rhs = null;
        this.line = line;
    }

    public AssignExpressionNode(ExpressionNode lhs, ExpressionNode rhs, int line)
    {
        this.lhs = lhs;
        this.rhs = rhs;
        this.line = line;
    }

    public ExpressionNode getLhs()
    {
        return lhs;
    }

    public ExpressionNode getRhs()
    {
        return rhs;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof AssignExpressionNode)) return false;
        return lhs.equals(((AssignExpressionNode) obj).getLhs()) && rhs.equals(((AssignExpressionNode) obj).getRhs());
    }
}
