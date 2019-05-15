package ASTNode;

import FrontEnd.ASTVisitor;

public class ReturnStatementNode extends StatementNode
{
    public ExpressionNode exp;

    public ReturnStatementNode(ExpressionNode exp, int line)
    {
        this.exp = exp;
        this.line = line;
    }

    //public ExpressionNode getExp(){return exp;}

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
