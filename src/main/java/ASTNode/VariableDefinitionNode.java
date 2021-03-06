package ASTNode;

import FrontEnd.ASTVisitor;

public class VariableDefinitionNode extends DefinitionNode
{
    public TypeNode type;
    public ExpressionNode exp;

    public VariableDefinitionNode(TypeNode type, String name, ExpressionNode exp, int line)
    {
        this.type = type;
        this.name = name;
        this.exp = exp;
        this.line = line;
    }

    public VariableDefinitionNode(int line)
    {
        this.line = line;
        this.type = null;
        this.exp = null;
        this.name = null;
    }

    public TypeNode getType()
    {
        return type;
    }

    public ExpressionNode getExp()
    {
        return exp;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
