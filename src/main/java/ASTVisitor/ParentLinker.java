package ASTVisitor;

import ASTnode.*;
import Error.SemanticError;

import java.util.*;

public class ParentLinker extends ASTVisitor {

    LinkedList<ASTNode> stack;

    public ParentLinker() {
        stack = new LinkedList<>();
    }

    public void linkParent(ProgramNode prog) throws SemanticError {
        visit(prog);
    }

    @Override
    public void visit(ProgramNode node) throws SemanticError {
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ClassDefinitionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
        for (MethodDefinitionNode item : node.memberConstructionMethodList)
            if (!item.methodName.equals(node.className))
                throw new SemanticError(node.line,
                        "construction method name must be the same as class");
    }

    @Override
    public void visit(MethodDefinitionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(BlockNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ReferenceNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ConstantNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ThisNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ExpressionDefinitionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(MemberAccessExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(IndexAccessExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(MethodCallExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(NewExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(UnaryExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(BinaryExpressionNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(IfStatementNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ForStatementNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(WhileStatementNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ReturnStatementNode node) throws SemanticError {
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

    @Override
    public void visit(BreakStatementNode node) throws SemanticError {
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

    @Override
    public void visit(ContinueStatementNode node) throws SemanticError {
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

    @Override
    public void visit(EmptyStatementNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(MethodTypeNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(PrimitiveTypeNode node) {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ClassTypeNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }

    @Override
    public void visit(ArrayTypeNode node) throws SemanticError {
        node.parent = stack.getLast();
        stack.addLast(node);
        super.visit(node);
        stack.removeLast();
    }
}
