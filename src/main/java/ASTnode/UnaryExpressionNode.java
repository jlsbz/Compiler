package ASTnode;

public class UnaryExpressionNode extends ExpressionStatementNode {

    public enum UnaryOp {
        PREFIX_INC, PREFIX_DEC,POSTFIX_INC, POSTFIX_DEC,
        SUB,
        NEG, NOT,
    }

    public UnaryOp op;
    public ExpressionStatementNode inner;

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        inner.printInformation(tab + 1);
    }
}
