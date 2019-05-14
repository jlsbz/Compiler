package ASTNode;


import FrontEnd.ASTVisitor;
import Type.Type;

public class TypeNode extends ASTNode
{
    private Type type;

    public TypeNode(Type type, Location config)
    {
        this.type = type;
        this.loc = config;
    }

    public Type getType()
    {
        return this.type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
