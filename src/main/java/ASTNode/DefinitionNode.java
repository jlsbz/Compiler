package ASTNode;
import FrontEnd.ASTVisitor;

abstract public class DefinitionNode extends ASTNode
{
    protected String name;

    public String getName()
    {
        return name;
    }
}
