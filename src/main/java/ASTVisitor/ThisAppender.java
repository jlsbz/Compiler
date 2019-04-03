package ASTVisitor;

import ASTnode.*;
import Error.*;

public class ThisAppender extends ASTVisitor {

    public void appendThis(ProgramNode prog) throws Exception {
        visit(prog);
    }

    @Override
    void visit(MethodDefinitionNode node) throws SemanticError {
        if (!(node.parent instanceof ClassDefinitionNode)) return;
        ClassDefinitionNode classNode = (ClassDefinitionNode) node.parent;
        ExpressionDefinitionNode thisVar = new ExpressionDefinitionNode();
        thisVar.parent = node;
        thisVar.variableName = "this";
        thisVar.scope = node.scope;
        thisVar.scope.define(thisVar);
        thisVar.variableType = new ClassTypeNode(classNode.className);
        node.formalArgumentList.add(0, thisVar);
    }
}
