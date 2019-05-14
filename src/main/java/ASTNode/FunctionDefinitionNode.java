package ASTNode;

import FrontEnd.ASTVisitor;
import java.util.*;

public class FunctionDefinitionNode extends DefinitionNode
{
    private boolean isConstruct;
    private TypeNode returnType;
    private List<VariableDefinitionNode> parameterList;
    private BlockStatementNode body;

    public FunctionDefinitionNode(TypeNode returnType, String name, List<VariableDefinitionNode> parameterList, BlockStatementNode body, Location config)
    {
        this.returnType = returnType;
        this.isConstruct = returnType == null;
        this.name = name;
        this.parameterList = parameterList;
        this.body = body;
        this.loc = config;
    }

    public boolean getIsConstruct()
    {
        return isConstruct;
    }

    public TypeNode getReturnType()
    {
        return returnType;
    }

    public List<VariableDefinitionNode> getParameterList()
    {
        return parameterList;
    }

    public BlockStatementNode getBody()
    {
        return body;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
