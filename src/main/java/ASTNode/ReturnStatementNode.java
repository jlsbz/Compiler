package ASTNode;

import FrontEnd.ASTVisitor;

public class ReturnStatementNode extends StatementNode
{
    public ExpressionNode exp;

    public ReturnStatementNode(int line)
    {
        this.exp = null;
        this.line = line;
    }

    public ReturnStatementNode(ExpressionNode exp, int line)
    {
        this.exp = exp;
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
