package ASTNode;

import FrontEnd.ASTVisitor;

public class ReturnStatementNode extends StatementNode
{
    public ExpressionNode exp;

    public ReturnStatementNode(ExpressionNode exp, Location config)
    {
        this.exp = exp;
        this.loc = config;
    }

    //public ExpressionNode getExp(){return exp;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
