package ASTNode;

import FrontEnd.ASTVisitor;
import Scope.Scope;

<<<<<<< HEAD
=======
import java.util.LinkedList;
<<<<<<< HEAD
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
=======
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
import java.util.List;

public class BlockStatementNode extends StatementNode
{
    private List<ASTNode> stmtsAndVarDecls;
    private Scope scope;
    private boolean isInit = false;


    public BlockStatementNode(List<ASTNode> stmtsAndVarDecls, Location config)
    {
        this.stmtsAndVarDecls = stmtsAndVarDecls;
        this.loc = config;
    }

<<<<<<< HEAD
=======
    public BlockStatementNode(int line)
    {
        stmtsAndVarDecls = new LinkedList<ASTNode>();
        this.line = line;
    }


<<<<<<< HEAD
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
=======
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
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
