package ASTNode;

import FrontEnd.ASTVisitor;

public class IfStatementNode extends StatementNode {
    public ExpressionNode condition;
    public StatementNode thenStmt;
    public StatementNode elseStmt;


    public IfStatementNode(int line) {
        this.condition = null;
        this.thenStmt = null;
        this.elseStmt = null;
        this.line = line;
    }

    public IfStatementNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt, int line) {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
        this.line = line;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public StatementNode getThenStmt() {
        return thenStmt;
    }

    public StatementNode getElseStmt() {
        return elseStmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override public void printInformation(int line) {
        super.printInformation(line);
        condition.printInformation(line + 1);
        thenStmt.printInformation(line + 1);
        if (elseStmt != null) elseStmt.printInformation(line + 1);
    }
}
