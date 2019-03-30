package ASTnode;

import static ASTnode.PrimitiveTypeNode.PriType.NULL;

public class ClassTypeNode extends NonArrayTypeNode {

    public String referenceClassName;
    public ClassDefinitionNode referenceClass;

    public ClassTypeNode(String str) {
        referenceClassName = str;
    }

    @Override
    public String getTypeName() {
        return referenceClassName;
    }

    @Override
    public boolean equalTo(VariableTypeNode node) {
        if (!referenceClassName.equals("string") && node.isPrimitiveType(NULL)) return true;
        if (!(node instanceof ClassTypeNode)) return false;
        return referenceClassName.equals(((ClassTypeNode) node).referenceClassName);
    }
}