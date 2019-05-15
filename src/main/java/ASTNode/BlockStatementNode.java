package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.Scope;

import java.util.LinkedList;
import java.util.List;

public class BlockStatementNode extends StatementNode
{
    public LinkedList<ASTNode> stmtsAndVarDecls;
    public Scope scope;
    public boolean isInit = false;


    public BlockStatementNode(LinkedList<ASTNode> stmtsAndVarDecls, int line)
    {
        this.stmtsAndVarDecls = stmtsAndVarDecls;
        this.line = line;
    }

    public BlockStatementNode(int line)
    {
        stmtsAndVarDecls = new LinkedList<ASTNode>();
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
