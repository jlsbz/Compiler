package ASTnode;

import static Print.Print.*;

import java.util.*;

public class MethodDefinitionNode extends ASTNode {

    public VariableTypeNode returnType;
    public String methodName;
    public List<ExpressionDefinitionNode> formalArgumentList;
    public BlockNode block;

    public MethodDefinitionNode() {
        formalArgumentList = new LinkedList<ExpressionDefinitionNode>();
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        if (returnType != null) returnType.printInformation(tab + 1);
        printSpaceAndStr(tab, "methodName: " + methodName);
        for (ExpressionDefinitionNode item : formalArgumentList)
            item.printInformation(tab + 1);
        block.printInformation(tab + 1);
    }
}
