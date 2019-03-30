package ASTnode;

import static ASTnode.PrimitiveTypeNode.PriType.*;

public class VariableTypeNode extends TypeNode {

public boolean isPrimitiveType(PrimitiveTypeNode.PriType type) {
        if (!(this instanceof PrimitiveTypeNode)) return false;
        if (((PrimitiveTypeNode) this).type.equals(type)) return true;
        else return false;
        }

public boolean equalTo(VariableTypeNode node) {
        if (this instanceof PrimitiveTypeNode) return ((PrimitiveTypeNode)node).equalTo(node);
        else if (this instanceof ClassTypeNode) return ((ClassTypeNode)node).equalTo(node);
        else return ((ArrayTypeNode)node).equalTo(node);
        }
        }
