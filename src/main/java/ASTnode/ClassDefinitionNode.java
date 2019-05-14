package ASTNode;

import FrontEnd.ASTVisitor;

import java.util.*;

public class ClassDefinitionNode extends DefinitionNode
{
    private List<VariableDefinitionNode> varMember;
    private List<FunctionDefinitionNode> funcMember;

    public ClassDefinitionNode(String name, List<VariableDefinitionNode> varMember, List<FunctionDefinitionNode> funcMember, Location config)
    {
        this.name = name;
        this.varMember = varMember;
        this.funcMember = funcMember;
        this.loc = config;
    }

    public List<VariableDefinitionNode> getVarMember()
    {
        return varMember;
    }

    public List<FunctionDefinitionNode> getFuncMember()
    {
        return funcMember;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
