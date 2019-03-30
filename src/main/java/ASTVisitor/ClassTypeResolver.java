package ASTVisitor;

import ASTnode.*;
import Error.*;
import Scope.*;

public class ClassTypeResolver extends ASTVisitor{

    ToplevelScope toplevelScope;

    public void resolveClassType(ProgramNode prog) throws SemanticError {
        toplevelScope = (ToplevelScope)(prog.scope);
        visit(prog);
    }

    @Override
    public void visit(ClassTypeNode node) throws SemanticError {
        String className = node.referenceClassName;
        ClassDefinitionNode classDefinition = toplevelScope.classDefinitionMap.get(className);
        if (classDefinition == null) throw new SemanticError(node.line, "no such class");
        node.referenceClass = classDefinition;
    }
}
