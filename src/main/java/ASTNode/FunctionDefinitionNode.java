package ASTNode;

import FrontEnd.ASTVisitor;
import java.util.*;

public class FunctionDefinitionNode extends DefinitionNode
{
    public boolean isConstruct;
    public TypeNode returnType;
    public List<VariableDefinitionNode> parameterList;
    public BlockStatementNode body;

    public FunctionDefinitionNode(TypeNode returnType, String name, List<VariableDefinitionNode> parameterList, BlockStatementNode body, int line)
    {
        this.returnType = returnType;
        this.isConstruct = returnType == null;
        this.name = name;
        this.parameterList = parameterList;
        this.body = body;
        this.line = line;
    }

    public FunctionDefinitionNode(int line)
    {
        this.line = line;
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
