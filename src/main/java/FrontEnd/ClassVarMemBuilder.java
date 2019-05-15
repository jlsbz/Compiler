package FrontEnd;

import ASTNode.*;
import Scope.*;
import Type.ClassType;
import Util.CompilerError;

public class ClassVarMemBuilder extends ScopeBuilder
{
    private Scope globalScope, currentScope;
    private int offset;

    public ClassVarMemBuilder(Scope globalScope)
    {
        this.globalScope = globalScope;
    }

    @Override
    public void visit(ProgramNode node)
    {
        for (DefinitionNode declNode : node.getDefs()){
            if (declNode instanceof ClassDefinitionNode) declNode.accept(this);
        }
    }

    @Override
    public void visit(ClassDefinitionNode node)
    {
        ClassEntity entity = (ClassEntity) globalScope.get(node.line, node.getName(), "@C" + node.getName());
        currentScope = entity.getScope();
        offset = 0;
        for (VariableDefinitionNode varDeclNode : node.getVarMember()) varDeclNode.accept(this);
        entity.setMemorySize(offset);
    }

    @Override
    public void visit(VariableDefinitionNode node)
    {
        if (node.getType().getType() instanceof ClassType) {
            String className = ((ClassType) node.getType().getType()).getName();
            currentScope.get(node.line, className, "@C" + className);
        }
        if (node.getExp() != null) throw new CompilerError(node.line, String.format("Variable \"%s\" should have no initialization", node.getName()));
        VarEntity entity = new VarEntity(node.getName(), node.getType().getType());
        entity.setAddrOffset(offset);
        offset += node.getType().getType().getVarSize();
        currentScope.put(node.line, node.getName(), "@V" + node.getName(), entity);
    }
}
