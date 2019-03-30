package ASTnode;

import Scope.*;
import static Print.Print.printDashAndStr;

public abstract class ASTNode {
    public int line;
    public ASTNode parent;
    public Scope scope;

    public void printInformation(int tab) {
        printDashAndStr(tab, this.getClass().getName());
    }

}