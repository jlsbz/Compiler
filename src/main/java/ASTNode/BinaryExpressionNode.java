package ASTNode;

import FrontEnd.ASTVisitor;

public class BinaryExpressionNode extends ExpressionNode
{
    public enum binaryOp{
        MUL, DIV, MOD, ADD, SUB, SHL, SHR, LESS, GREATER, LESS_EQUAL, GREATER_EQUAL, EQUAL, UNEQUAL,
        BITWISE_AND, BITWISE_XOR, BITWISE_OR, LOGIC_AND, LOGIC_OR
    }

<<<<<<< HEAD
    private binaryOp op;
    private ExpressionNode lhs, rhs;
=======
    public binaryOp op;
    public ExpressionNode lhs, rhs;
<<<<<<< HEAD
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
=======
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦

    public BinaryExpressionNode(binaryOp op, ExpressionNode lhs, ExpressionNode rhs, Location config)
    {
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
        this.loc = config;
    }

    public binaryOp getOp()
    {
        return op;
    }

    public ExpressionNode getLhs()
    {
        return lhs;
    }

    public ExpressionNode getRhs()
    {
        return rhs;
    }

    public void setLhs(ExpressionNode lhs)
    {
        this.lhs = lhs;
    }

    public void setRhs(ExpressionNode rhs)
    {
        this.rhs = rhs;
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
<<<<<<< HEAD
        return op == ((BinaryExpressionNode) obj).getOp() && lhs.equals(((BinaryExpressionNode) obj).getLhs()) && rhs.equals(((BinaryExpressionNode) obj).getRhs());
=======
        return op == ((BinaryExpressionNode) obj).op && lhs.equals(((BinaryExpressionNode) obj).lhs) && rhs.equals(((BinaryExpressionNode) obj).rhs);
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
    }
}
