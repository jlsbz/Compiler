package ASTNode;

import FrontEnd.ASTVisitor;


public class ForStatementNode extends StatementNode {
    public ExpressionNode init, cond, update;
    public StatementNode stmt;

    public ForStatementNode(ExpressionNode init, ExpressionNode cond, ExpressionNode update, StatementNode stmt, Location config) {
        this.init = init;
        this.cond = cond;
        this.update = update;
        this.stmt = stmt;
        this.loc = config;
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
