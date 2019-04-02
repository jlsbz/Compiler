package ASTVisitor;

import ASTnode.*;
import Scope.*;
import Error.*;

import java.util.*;

public class ScopeTreeBuilder extends ASTVisitor {

    public LinkedList<Scope> scopeStack;

    public ScopeTreeBuilder() {
        this.scopeStack = new LinkedList<Scope>();
    }

    public Scope buildScopeTree(ProgramNode prog) throws Exception {
        visit(prog);
        if (scopeStack.size() != 1) throw new Exception("size of scopeStack is not 1");
        return (Scope) scopeStack.getFirst();
    }

    public Scope currentScope() {
        return scopeStack.getLast();
    }

    public void pushScope(Scope scope) throws SemanticError {
        scope.parent = currentScope();
        scope.parent.childrenList.add(scope);
//        scope.nameSet = (HashSet<String>) scope.parent.nameSet.clone();
        scopeStack.addLast(scope);
    }

    public Scope popScope() {
        return (Scope) scopeStack.removeLast();
    }

    @Override
    public void visit(ProgramNode node) throws SemanticError {
        Scope toplevelScope = new Scope();
        for (ClassDefinitionNode item : node.classDefinitionList) {
            toplevelScope.define(item);
           // System.out.println(item.className+'\n');
        }
        for (MethodDefinitionNode item : node.methodDefinitionList) {
            toplevelScope.define(item);
            //System.out.println(item.methodName+'\n');
        }


        MethodDefinitionNode main = toplevelScope.methodDefinitionMap.get("main");
        if (main == null)
            throw new SemanticError("no method name \"main\"");
         else if (!main.returnType.getTypeName().equals("int"))
            throw new SemanticError("return type of \"main\" must be \"int\"");
        else if (!main.formalArgumentList.isEmpty())
            throw new SemanticError("\"main\" can not have parameters");
        toplevelScope.astNode = node;
        scopeStack.addLast(toplevelScope);
        super.visit(node);
        node.scope = toplevelScope;
    }

    @Override
    public void visit(ClassDefinitionNode node) throws SemanticError {
        Scope scope = new Scope();
        pushScope(scope);
        for (MethodDefinitionNode item : node.memberMethodList)
            scope.define(item);
        for (MethodDefinitionNode item : node.memberConstructionMethodList)
            scope.define(item);
        scope.astNode = node;
        super.visit(node);
        node.scope = popScope();
    }

    @Override
    public void visit(MethodDefinitionNode node) throws SemanticError {
        Scope scope = new Scope();
        pushScope(scope);
        scope.astNode = node;
        super.visit(node);
        node.scope = popScope();
    }

    @Override
    public void visit(BlockNode node) throws SemanticError {
        Scope scope = new Scope();
        pushScope(scope);
        scope.astNode = node;
        super.visit(node);
        node.scope = popScope();
    }

    @Override
    public void visit(ExpressionDefinitionNode node) throws SemanticError {
        super.visit(node);
        currentScope().define(node);
    }

    @Override
    public void visit(MemberAccessExpressionNode node) throws SemanticError {
        visit(node.caller);
        try {
            visit(node.member);
        } catch (SemanticError exception) {
        }
    }

    @Override
    public void visit(ReferenceNode node) throws SemanticError {
        ASTNode definitionNode;
        try {
            definitionNode = currentScope().get(node.referenceName);
        } catch (SemanticError exception) {
            throw new SemanticError(node.line, exception.getMessage());
        }
        if (definitionNode instanceof ClassDefinitionNode)
            node.referenceType = ReferenceNode.ReferenceType.CLASS;
        else if (definitionNode instanceof MethodDefinitionNode)
            node.referenceType = ReferenceNode.ReferenceType.METHOD;
        else if (definitionNode instanceof ExpressionDefinitionNode)
            node.referenceType = ReferenceNode.ReferenceType.VARIABLE;
        node.definitionNode = definitionNode;
    }
}