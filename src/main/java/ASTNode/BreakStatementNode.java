package ASTNode;
import FrontEnd.ASTVisitor;

import static Util.Print.printSpaceAndStr;

public class BreakStatementNode extends StatementNode
{
    public BreakStatementNode(int line)
    {
        this.line = line;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public void printInformation(int line) {
        super.printInformation(line);
        printSpaceAndStr(line, "break");
    }
}
