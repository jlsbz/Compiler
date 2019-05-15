package ASTNode;


import FrontEnd.ASTVisitor;
import Type.Type;

public class TypeNode extends ASTNode
{
    private Type type;

    public TypeNode(Type type, int line)
    {
        this.type = type;
        this.line = line;
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
