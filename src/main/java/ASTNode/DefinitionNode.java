package ASTNode;
import FrontEnd.ASTVisitor;

abstract public class DefinitionNode extends ASTNode
{
    public String name;

    public String getName()
    {
        return name;
    }
}
