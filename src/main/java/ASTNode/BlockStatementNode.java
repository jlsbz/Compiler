package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.Scope;

import java.util.List;

public class BlockStatementNode extends StatementNode
{
    private List<ASTNode> stmtsAndVarDecls;
    private Scope scope;
    private boolean isInit = false;


    public BlockStatementNode(List<ASTNode> stmtsAndVarDecls, int line)
    {
        this.stmtsAndVarDecls = stmtsAndVarDecls;
        this.line = line;
    }

    public List<ASTNode> getStmtsAndVarDecls()
    {
        return stmtsAndVarDecls;
    }

    public void setScope(Scope parent)
    {
        if (!isInit) {
            scope = new Scope(parent, false);
            isInit = true;
        }
    }

    public Scope getScope()
    {
        return scope;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
