package ASTNode;

import FrontEnd.ASTVisitor;

public class VariableDefinitionNode extends DefinitionNode
{
    public TypeNode type;
    public ExpressionNode exp;

    public VariableDefinitionNode(TypeNode type, String name, ExpressionNode exp, Location config)
    {
        this.type = type;
        this.name = name;
        this.exp = exp;
        this.loc = config;
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
