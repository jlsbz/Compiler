package ASTNode;

import FrontEnd.ASTVisitor;

import java.util.*;

public class NewExpressionNode extends ExpressionNode
{
    private TypeNode newType;
    private List<ExpressionNode> exprList;
    private int dimNum;

    public NewExpressionNode(TypeNode type, List<ExpressionNode> exprList, int dimNum, int line)
    {
        this.newType = type;
        this.exprList = exprList;
        this.dimNum = dimNum;
        this.line = line;
    }

    public TypeNode getNewType()
    {
        return newType;
    }

    public List<ExpressionNode> getExprList()
    {
        return exprList;
    }

    public int getDimNum() {
        return dimNum;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
