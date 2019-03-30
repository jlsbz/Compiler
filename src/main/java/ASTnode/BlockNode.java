package ASTnode;

import java.util.*;

public class BlockNode extends ASTNode {

    public List<ASTNode> childList;

    public BlockNode() {
        childList = new LinkedList<ASTNode>();
    }

    @Override
    public void printInformation(int tab) {
        super.printInformation(tab);
        for (ASTNode item : childList) {
            if (item instanceof StatementNode) ((StatementNode) item).printInformation(tab + 1);
            else ((BlockNode) item).printInformation(tab + 1);
        }
    }
}
