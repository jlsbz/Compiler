package ASTNode;

import FrontEnd.ASTVisitor;

import java.util.*;

public class NewExpressionNode extends ExpressionNode
{
    public TypeNode newType;
    public LinkedList<ExpressionNode> expList;
    public int dimNum;

    public NewExpressionNode(int line)
    {
        this.newType = null;
        this.expList = null;
        //this.dimNum = 0;
        this.line = line;
    }


    public NewExpressionNode(TypeNode type, LinkedList<ExpressionNode> exprList, int dimNum, int line)
    {
        this.newType = type;
        this.expList = exprList;
        //this.dimNum = dimNum;
        this.line = line;
    }

    public TypeNode getNewType()
    {
        return newType;
    }

    public List<ExpressionNode> getExpList()
    {
        return expList;
    }


    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }


    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        if (newType != null) newType.printInformation(line + 1);
        for (ExpressionNode item : expList)
            item.printInformation(line + 1);
    }
}
