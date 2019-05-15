package ASTNode;

import FrontEnd.ASTVisitor;

import java.util.*;

public class NewExpressionNode extends ExpressionNode
{
    public TypeNode newType;
    public LinkedList<ExpressionNode> exprList;
    public int dimNum;

    public NewExpressionNode(int line)
    {
        this.newType = null;
        this.exprList = null;
        this.dimNum = 0;
        this.line = line;
    }


    public NewExpressionNode(TypeNode type, LinkedList<ExpressionNode> exprList, int dimNum, int line)
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
