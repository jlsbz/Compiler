package ASTnode;

import java.util.*;

public class ProgramNode extends ASTNode {

    public List<ClassDefinitionNode> classDefinitionList;
    public List<MethodDefinitionNode> methodDefinitionList;
    public List<ExpressionDefinitionNode> variableDefinitionList;
    public List<ASTNode> childrenList;

    public ProgramNode() {
        classDefinitionList = new LinkedList<ClassDefinitionNode>();
        methodDefinitionList = new LinkedList<MethodDefinitionNode>();
        variableDefinitionList = new LinkedList<ExpressionDefinitionNode>();
        childrenList = new LinkedList<ASTNode>();
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        for (ASTNode item : childrenList)
            item.printInformation(tab + 1);
    }
}
