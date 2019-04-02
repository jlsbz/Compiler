package ASTVisitor;

import ASTnode.*;
import Error.*;

import static Print.Print.*;

import java.util.*;

public class Scope {

    public Scope parent;
    public ASTNode astNode;
    public HashMap<String, ClassDefinitionNode> classDefinitionMap;
    public HashMap<String, MethodDefinitionNode> methodDefinitionMap;
    public HashMap<String, ExpressionDefinitionNode> variableDefinitionMap;
    public HashSet<String> nameSet;
    public LinkedList<Scope> childrenList;

    public Scope() {
        classDefinitionMap = new HashMap<String, ClassDefinitionNode>();
        methodDefinitionMap = new HashMap<String, MethodDefinitionNode>();
        variableDefinitionMap = new HashMap<String, ExpressionDefinitionNode>();
        nameSet = new HashSet<String>();
        childrenList = new LinkedList<Scope>();
    }



    public void define(ClassDefinitionNode node) throws SemanticError {
        if (nameSet.contains(node.className))
            throw new SemanticError(node.line, "duplicated name");
        else nameSet.add(node.className);
        if (classDefinitionMap.get(node.className) == null)
            classDefinitionMap.put(node.className, node);
        else throw new SemanticError(node.line, "duplicated class definition");
    }

    public void define(MethodDefinitionNode node) throws SemanticError {
        if (nameSet.contains(node.methodName))
            throw new SemanticError(node.line, "duplicated name");
        else nameSet.add(node.methodName);
        if (methodDefinitionMap.get(node.methodName) == null)
            methodDefinitionMap.put(node.methodName, node);
        else throw new SemanticError(node.line, "duplicated method definition");
    }

    public void define(ExpressionDefinitionNode node) throws SemanticError {
        if (nameSet.contains(node.variableName))
            throw new SemanticError(node.line, "duplicated name");
        else nameSet.add(node.variableName);
        if (variableDefinitionMap.get(node.variableName) == null)
            variableDefinitionMap.put(node.variableName, node);
        else throw new SemanticError(node.line, "duplicated variable definition");
    }

    public ClassDefinitionNode getClass(String name) {
        ClassDefinitionNode res = classDefinitionMap.get(name);
        if (res != null) return res;
        else if (parent != null) return parent.getClass(name);
        else return null;
    }

    public MethodDefinitionNode getMethod(String name) {
        MethodDefinitionNode res = methodDefinitionMap.get(name);
        if (res != null) return res;
        else if (parent != null) return parent.getMethod(name);
        else return null;
    }

    public ExpressionDefinitionNode getVar(String name) {
        ExpressionDefinitionNode res = variableDefinitionMap.get(name);
        if (res != null) return res;
        else if (parent != null) return parent.getVar(name);
        else return null;
    }

    public ASTNode get(String name) throws SemanticError {
        ClassDefinitionNode classDefinitionNode = classDefinitionMap.get(name);
        MethodDefinitionNode methodDefinitionNode = methodDefinitionMap.get(name);
        ExpressionDefinitionNode variableDefinitionNode = variableDefinitionMap.get(name);
        if (classDefinitionNode != null) return classDefinitionNode;
        if (methodDefinitionNode != null) return methodDefinitionNode;
        if (variableDefinitionNode != null) return variableDefinitionNode;
        if (parent != null) return parent.get(name);
        throw new SemanticError("no such entity named \"" + name + "\"");
    }

    public void printInformation(int tab) {
        String name = astNode.getClass().getName();
        if (astNode instanceof ProgramNode) name = "PROGRAM";
        else if (astNode instanceof ClassDefinitionNode) name = "CLASS: " + ((ClassDefinitionNode) astNode).className;
        else if (astNode instanceof MethodDefinitionNode) name = "METHOD: " + ((MethodDefinitionNode) astNode).methodName;
        else if (astNode instanceof BlockNode) name = "BLOCK";
        printDashAndStr(tab, name);
        printSpaceAndStr(tab, "=class definition:");
        for (String key : classDefinitionMap.keySet())
            printSpaceAndStr(tab, " =" + classDefinitionMap.get(key).className);
        printSpaceAndStr(tab, "=method definition:");
        for (String key : methodDefinitionMap.keySet())
            printSpaceAndStr(tab, " =" + methodDefinitionMap.get(key).methodName);
        printSpaceAndStr(tab, "=variable definition:");
        for (String key : variableDefinitionMap.keySet())
            printSpaceAndStr(tab, " =" + variableDefinitionMap.get(key).variableName);
        for (Scope item : childrenList)
            item.printInformation(tab + 1);
    }
}