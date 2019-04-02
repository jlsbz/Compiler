package ASTVisitor;

import ASTnode.*;
import Error.*;

public class ClassTypeResolver extends ASTVisitor{

    Scope toplevelScope;

    public void resolveClassType(ProgramNode prog) throws Exception {
        toplevelScope = prog.scope;
        visit(prog);
    }

    @Override
    void visit(ClassTypeNode node) throws SemanticError {
        String className = node.referenceClassName;
        ClassDefinitionNode classDefinition =
                toplevelScope.classDefinitionMap.get(className);
        if (classDefinition == null)
            throw new SemanticError(node.line, "no such class");
        node.referenceClass = classDefinition;
    }
}
