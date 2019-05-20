package ASTNode;

import FrontEnd.ASTVisitor;
import static Util.Print.printStrWithLine;

public abstract class ASTNode
{
    public int line;


    abstract public void accept(ASTVisitor visitor);

    public void printInformation(int line) {
        printStrWithLine(line, this.getClass().getName());
    }
}