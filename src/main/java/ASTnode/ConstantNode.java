package ASTnode;

import static Print.Print.*;

public class ConstantNode extends PrimaryExpressionNode {

    public String constantStr;

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        printSpaceAndStr(tab, "constantStr: " + constantStr);
    }

}
