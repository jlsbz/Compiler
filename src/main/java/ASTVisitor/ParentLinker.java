package ASTVisitor;

import ASTnode.*;
import Error.SemanticError;

import java.util.*;

public class ParentLinker extends ASTVisitor {

    LinkedList<ASTNode> stack;

    public ParentLinker() {
        stack = new LinkedList<ASTNode>();
    }

    public void linkParent(ProgramNode prog) throws Exception {
        visit(prog);
    }

    @Override void visit(ProgramNode node) throws Exception {
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ClassDefinitionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
        for (MethodDefinitionNode item : node.memberConstructionMethodList)
            if (!item.methodName.equals(node.className))
                throw new SemanticError(node.line,
                        "construction method name must be the same as class");
    }

    @Override void visit(MethodDefinitionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(BlockNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ReferenceNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ConstantNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ThisNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ExpressionDefinitionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(MemberAccessExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(IndexAccessExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(MethodCallExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(NewExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(UnaryExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(BinaryExpressionNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(IfStatementNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ForStatementNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(WhileStatementNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ReturnStatementNode node) throws Exception {
        node.parent = stack.getLast();
        ASTNode ancestor = node.parent;
        while (!(ancestor instanceof MethodDefinitionNode)) {
            if (ancestor instanceof ProgramNode)
                throw new SemanticError(node.line, "return must be in a method definition");
            ancestor = ancestor.parent;
        }
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(BreakStatementNode node) throws SemanticError {
        node.parent = stack.getLast();
        ASTNode ancestor = node.parent;
        while (!(ancestor instanceof ForStatementNode) &&
                !(ancestor instanceof WhileStatementNode)) {
            if (ancestor instanceof ProgramNode)
                throw new SemanticError(node.line, "break must be in a loop");
            ancestor = ancestor.parent;
        }
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ContinueStatementNode node) throws SemanticError {
        node.parent = stack.getLast();
        ASTNode ancestor = node.parent;
        while (!(ancestor instanceof ForStatementNode) &&
                !(ancestor instanceof WhileStatementNode)) {
            if (ancestor instanceof ProgramNode)
                throw new SemanticError(node.line, "continue must be in a loop");
            ancestor = ancestor.parent;
        }
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(EmptyStatementNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(MethodTypeNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(PrimitiveTypeNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ClassTypeNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override void visit(ArrayTypeNode node) throws Exception {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }
}
