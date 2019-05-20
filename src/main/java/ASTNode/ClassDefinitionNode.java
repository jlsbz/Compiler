package ASTNode;

import FrontEnd.ASTVisitor;
import static Util.Print.printStrWtihSpace;
import java.util.*;

public class ClassDefinitionNode extends DefinitionNode
{
    public List<VariableDefinitionNode> varMember;
    public List<FunctionDefinitionNode> funcMember;

    public ClassDefinitionNode(String name, List<VariableDefinitionNode> varMember, List<FunctionDefinitionNode> funcMember, int line)
    {
        this.name = name;
        this.varMember = varMember;
        this.funcMember = funcMember;
        this.line = line;
    }

    public ClassDefinitionNode(int line)
    {
        this.line = line;
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


    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        printStrWtihSpace(line, "name: " + name);
        for (VariableDefinitionNode item : varMember)
            item.printInformation(line + 1);
        for (FunctionDefinitionNode item : funcMember)
            item.printInformation(line + 1);
    }


}
