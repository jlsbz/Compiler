package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.FuncEntity;


import java.util.*;

public class FunctionCallExpressionNode extends ExpressionNode {
    public ExpressionNode exp;
    public LinkedList<ExpressionNode> paraList;
    public FuncEntity funcEntity;

    public FunctionCallExpressionNode(int line) {
        this.exp = null;
        this.paraList = new LinkedList<ExpressionNode>();
        this.line = line;
    }

    public FunctionCallExpressionNode(ExpressionNode exp, LinkedList<ExpressionNode> paraList, int line) {
        this.exp = exp;
        this.paraList = paraList;
        this.line = line;
    }


    public LinkedList<ExpressionNode> getParaList() {
        return paraList;
    }

    public void setFuncEntity(FuncEntity funcEntity) {
        this.funcEntity = funcEntity;
    }

    public FuncEntity getFuncEntity() {
        return funcEntity;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionCallExpressionNode)) return false;
        for (int i = 0; i < paraList.size(); ++i) {
            if (!paraList.get(i).equals(((FunctionCallExpressionNode) obj).getParaList().get(i))) return false;
        }
        return exp.equals(((FunctionCallExpressionNode) obj).exp)
                && funcEntity.getClassName().equals(((FunctionCallExpressionNode) obj).getFuncEntity().getClassName())
                && funcEntity.getName() == ((FunctionCallExpressionNode) obj).getFuncEntity().getName();
    }

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        if (exp != null) exp.printInformation(line + 1);
        for(ExpressionNode item: paraList)
        {
            item.printInformation(line + 1);
        }
    }

}
