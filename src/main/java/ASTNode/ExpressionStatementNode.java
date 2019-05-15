package ASTNode;

import FrontEnd.ASTVisitor;

public class ExpressionStatementNode extends StatementNode
{
    public ExpressionNode exp;

    public ExpressionStatementNode(ExpressionNode exp, int line)
    {
        this.exp = exp;
        this.line = line;
    }

    //public ExpressionNode getExp(){return expr;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
