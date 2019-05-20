package ASTNode;

import static Util.Print.*;
import FrontEnd.ASTVisitor;
import Type.Type;

public class TypeNode extends ASTNode
{
    public Type type;

    public TypeNode(int line)
    {
        this.type = null;
        this.line = line;
    }


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

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        printStrWtihSpace(line, "type: " + type.getType());
    }
}
