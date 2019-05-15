package ASTNode;

import FrontEnd.ASTVisitor;

public class BinaryExpressionNode extends ExpressionNode
{
    public enum binaryOp{
        MUL, DIV, MOD, ADD, SUB, SHL, SHR, LESS, GREATER, LESS_EQUAL, GREATER_EQUAL, EQUAL, UNEQUAL,
        BITWISE_AND, BITWISE_XOR, BITWISE_OR, LOGIC_AND, LOGIC_OR
    }

    public binaryOp op;
    public ExpressionNode lhs, rhs;

    public BinaryExpressionNode(int line)
    {
        this.op = null;
        this.lhs = null;
        this.rhs = null;
        this.line = line;
    }


    public BinaryExpressionNode(binaryOp op, ExpressionNode lhs, ExpressionNode rhs, int line)
    {
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
        this.line = line;
    }

    //public binaryOp getOp()
    //{
    //    return op;
    //}

    //public ExpressionNode getLhs()
    //{
    //    return lhs;
    //}

    //public ExpressionNode getRhs()
    //{
    //    return rhs;
    //}

    //public void setLhs(ExpressionNode lhs)
    //{
    //    this.lhs = lhs;
    //}

    //public void setRhs(ExpressionNode rhs)
    //{
    //    this.rhs = rhs;
    //}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof BinaryExpressionNode)) return false;
        return op == ((BinaryExpressionNode) obj).op && lhs.equals(((BinaryExpressionNode) obj).lhs) && rhs.equals(((BinaryExpressionNode) obj).rhs);
    }
}
