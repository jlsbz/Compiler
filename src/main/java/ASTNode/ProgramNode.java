package ASTNode;
import FrontEnd.ASTVisitor;

import Scope.Scope;

import java.util.*;

public class ProgramNode extends ASTNode
{
    public List<DefinitionNode> def;
    public Scope scope;

    public ProgramNode(List<DefinitionNode> def, int line)
    {
        this.def = def;
        this.line = line;
    }

    public ProgramNode()
    {}


    public List<DefinitionNode> getDecls()
    {
        return def;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(line);
        for (DefinitionNode item : def)
            item.printInformation(line + 1);
    }

}
