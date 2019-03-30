package ASTnode;

import static Print.Print.*;

import java.util.*;


public class ClassDefinitionNode extends ASTNode {

    public String className;
    public List<ExpressionDefinitionNode> memberVariableList;
    public List<MethodDefinitionNode> memberMethodList;
    public List<MethodDefinitionNode> memberConstructionMethodList;

    public ClassDefinitionNode() {
        memberVariableList = new LinkedList<ExpressionDefinitionNode>();
        memberMethodList = new LinkedList<MethodDefinitionNode>();
        memberConstructionMethodList = new LinkedList<MethodDefinitionNode>();
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        printSpaceAndStr(tab, "name: " + className);
        for (ExpressionDefinitionNode item : memberVariableList)
            item.printInformation(tab + 1);
        for (MethodDefinitionNode item : memberMethodList)
            item.printInformation(tab + 1);
        for (MethodDefinitionNode item : memberConstructionMethodList)
            item.printInformation(tab + 1);
    }
}
