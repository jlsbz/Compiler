package ASTNode;

import FrontEnd.ASTVisitor;
import static Util.Print.printDashAndStr;

public abstract class ASTNode
{
    public int line;


    abstract public void accept(ASTVisitor visitor);

    public void printInformation(int line) {
        printDashAndStr(line, this.getClass().getName());
    }
}