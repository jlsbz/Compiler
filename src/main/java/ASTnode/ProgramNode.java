package ASTNode;
import FrontEnd.ASTVisitor;

import Scope.Scope;

import java.util.*;

public class ProgramNode extends ASTNode
{
    private List<DefinitionNode> def;
    private Scope scope;

    public ProgramNode(List<DefinitionNode> def, Location config)
    {
        this.def = def;
        this.loc = config;
    }

    public List<DefinitionNode> getDecls()
    {
        return def;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
