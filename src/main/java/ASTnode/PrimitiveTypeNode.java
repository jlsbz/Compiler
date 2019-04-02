package ASTnode;

public class PrimitiveTypeNode extends NonArrayTypeNode {

    public enum PriType {
        BOOL, INT, VOID, NULL//, STRING
    }


    public PriType type;


    public PrimitiveTypeNode(String str) {
        if (str.equals("bool")) this.type = PriType.BOOL;
        if (str.equals("int")) this.type = PriType.INT;
     //   if (str.equals("string")) this.type = PriType.STRING;
        if (str.equals("void")) this.type = PriType.VOID;
        if (str.equals("null")) this.type = PriType.NULL;
    }

    @Override
    public String getTypeName() {                   //typenode
        switch (type) {
            case INT:
                return "int";
            case BOOL:
                return "bool";
            //case STRING: return "string";
            case VOID:
                return "void";
            case NULL:
                return "null";
            default:
                return "";
        }
    }

    @Override
    public boolean equalTo(VariableTypeNode node) {

        switch (type) {
            case INT:
                return node.isPrimitiveType(PriType.INT);
            case BOOL:
                return node.isPrimitiveType(PriType.BOOL);
            //case STRING:return node.isPrimitiveType(PriType.STRING);
            case VOID:
                return node.isPrimitiveType(PriType.VOID);
            case NULL:
                if (node instanceof ArrayTypeNode) return true;
                if (node instanceof ClassTypeNode)
                    if (!((ClassTypeNode) node).referenceClassName.equals("string"))
                        return true;
                return false;
            default:
                return false;
        }
    }


}