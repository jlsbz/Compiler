package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.FuncEntity;


import java.util.*;

public class FunctionCallExpressionNode extends ExpressionNode {
    public ExpressionNode exp;
    private List<ExpressionNode> paraList;
    private FuncEntity funcEntity;

    public FunctionCallExpressionNode(ExpressionNode exp, List<ExpressionNode> paraList, Location config) {
        this.exp = exp;
        this.paraList = paraList;
        this.loc = config;
    }

    //public ExpressionNode getExp() {return exp;}

    public List<ExpressionNode> getParaList() {
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
}
