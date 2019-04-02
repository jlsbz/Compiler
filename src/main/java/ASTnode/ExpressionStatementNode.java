package ASTnode;

import static Print.Print.*;

public abstract class ExpressionStatementNode extends StatementNode {

    public VariableTypeNode exprType;
    public boolean leftValue;               //true for right

    ExpressionStatementNode() {
        exprType = null;
        leftValue = false;
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        if (exprType != null) exprType.printInformation(tab + 1);
        if (leftValue == true) printSpaceAndStr(tab, "leftValue: " + leftValue);
    }
}