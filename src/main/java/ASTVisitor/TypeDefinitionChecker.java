package ASTVisitor;

import ASTnode.*;
import Error.*;

import java.util.*;

// void type
// cycling definition

public class TypeDefinitionChecker extends ASTVisitor {

    HashMap<String, Integer> indgreeMap;
    HashMap<String, LinkedList<String>> edgeMap;

    public TypeDefinitionChecker() {
        indgreeMap = new HashMap<String, Integer>();
        edgeMap = new HashMap<String, LinkedList<String>>();
    }

    public void checkTypeDefinition(ProgramNode prog) throws SemanticError {
        visit(prog);
//        topsort();
    }

    void topsort() throws SemanticError {
        LinkedList<String> que = new LinkedList<String>();
        int cnt = 0;
        for (String key : indgreeMap.keySet())
            if (indgreeMap.get(key).equals(0)) {
                que.add(key);
                ++cnt;
            }
        while (!que.isEmpty()) {
            String u = que.getLast();
            que.removeLast();
            for (String v : edgeMap.get(u)) {
                int t = indgreeMap.get(v) - 1;
                indgreeMap.remove(v);
                if (t == 0) {
                    que.add(v);
                    ++cnt;
                } else indgreeMap.put(v, t);
            }
        }
        if (cnt < edgeMap.size()) throw new SemanticError("cycling class definition");
    }

    boolean isVoid(VariableTypeNode variableType) {
        if (variableType instanceof PrimitiveTypeNode)
            if (((PrimitiveTypeNode) variableType).type
                    .equals(PrimitiveTypeNode.PriType.VOID))
                return true;
        return false;
    }

    boolean isVoidArray(VariableTypeNode variableType) {
        if (variableType instanceof ArrayTypeNode)
            if (isVoid(((ArrayTypeNode) variableType).innerTypeNode))
                return true;
        return false;
    }

    @Override
    public void visit(MethodDefinitionNode node) throws SemanticError {
        if (isVoidArray(node.returnType))
            throw new SemanticError(node.line, "return an array of void");
        super.visit(node);
    }

    @Override
    public void visit(ExpressionDefinitionNode node) throws SemanticError {
        if (isVoid(node.variableType) || isVoidArray(node.variableType))
            throw new SemanticError(node.line, "define a variable of void type");
        super.visit(node);
    }

    @Override
    public void visit(NewExpressionNode node) throws SemanticError {
        if (isVoid(node.variableType) || isVoidArray(node.variableType))
            throw new SemanticError(node.line, "new operator on void type");
        super.visit(node);
    }

    @Override
    public void visit(ProgramNode node) throws SemanticError {
        for (ClassDefinitionNode item : node.classDefinitionList) {
            indgreeMap.put(item.className, 0);
            edgeMap.put(item.className, new LinkedList<String>());
        }
        super.visit(node);
    }

    @Override
    public void visit(ClassDefinitionNode node) throws SemanticError {
        for (ExpressionDefinitionNode item : node.memberVariableList) {
            VariableTypeNode tmp = item.variableType;
            if (tmp instanceof ArrayTypeNode) tmp = ((ArrayTypeNode) tmp).innerTypeNode;
            if (tmp instanceof ClassTypeNode) {
                String className = tmp.getTypeName();
                indgreeMap.put(className, indgreeMap.get(className) + 1);
                edgeMap.get(node.className).add(className);
            }
        }
    }
}
