package ASTNode;

import FrontEnd.ASTVisitor;

public class BinaryExpressionNode extends ExpressionNode
{
    public enum binaryOp{
        MUL, DIV, MOD, ADD, SUB, SHL, SHR, LESS, GREATER, LESS_EQUAL, GREATER_EQUAL, EQUAL, UNEQUAL,
        BITWISE_AND, BITWISE_XOR, BITWISE_OR, LOGIC_AND, LOGIC_OR
    }

    public binaryOp op;
    public ExpressionNode lhs;
    public ExpressionNode rhs;

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

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        lhs.printInformation(line + 1);
        rhs.printInformation(line + 1);
    }

}
