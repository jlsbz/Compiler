package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.Scope;

import java.util.LinkedList;

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

    public LinkedList<ASTNode> getStmtsAndVarDecls()
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

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        for (ASTNode item : stmtsAndVarDecls) {
            if (item instanceof StatementNode) item.printInformation(line + 1);
            else item.printInformation(line + 1);
        }
    }


}
