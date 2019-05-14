package ASTNode;

import FrontEnd.ASTVisitor;

public class ExpressionStatementNode extends StatementNode
{
    public ExpressionNode exp;

    public ExpressionStatementNode(ExpressionNode exp, Location config)
    {
        this.exp = exp;
        this.loc = config;
    }

    //public ExpressionNode getExp(){return expr;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
