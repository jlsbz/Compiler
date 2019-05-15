package ASTNode;

import FrontEnd.ASTVisitor;


public class ForStatementNode extends StatementNode {
    public ExpressionNode init, cond, update;
    public StatementNode stmt;

    public ForStatementNode(int line) {
        this.init = null;
        this.cond = null;
        this.update = null;
        this.stmt = null;
        this.line = line;
    }

    public ForStatementNode(ExpressionNode init, ExpressionNode cond, ExpressionNode update, StatementNode stmt, int line) {
        this.init = init;
        this.cond = cond;
        this.update = update;
        this.stmt = stmt;
        this.line = line;
    }

    public ExpressionNode getInit() {
        return init;
    }

    public ExpressionNode getCond() {
        return cond;
    }

    public ExpressionNode getUpdate() {
        return update;
    }

    public StatementNode getStmt() {
        return stmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
