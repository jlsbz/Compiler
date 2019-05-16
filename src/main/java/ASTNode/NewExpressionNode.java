package ASTNode;

import FrontEnd.ASTVisitor;

import java.util.*;

public class NewExpressionNode extends ExpressionNode
{
<<<<<<< HEAD
    private TypeNode newType;
    private List<ExpressionNode> exprList;
    private int dimNum;

    public NewExpressionNode(TypeNode type, List<ExpressionNode> exprList, int dimNum, Location config)
=======
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
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
    {
        this.newType = type;
        this.exprList = exprList;
        this.dimNum = dimNum;
<<<<<<< HEAD
        this.loc = config;
=======
        this.line = line;
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
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
