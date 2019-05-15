package Scope;

import ASTNode.*;
import Type.Type;
import Type.ClassType;

public class ClassEntity extends Entity
{
    private Scope scope;
    private int memorySize;

    public ClassEntity(String name, Type type, Scope parent)
    {
        super(name, type);
        scope = new Scope(parent, true);
    }

    public ClassEntity(ClassDefinitionNode node, Scope parent)
    {
        super(node.getName(), new ClassType(node.getName()));
        scope = new Scope(parent, true);
        for (FunctionDefinitionNode funcDeclNode : node.getFuncMember()) {
            String name = funcDeclNode.getName();
            FuncEntity entity = new FuncEntity(funcDeclNode);
            entity.setClassName(node.getName());
            entity.setMember(true);
            scope.put(funcDeclNode.loc, name, "@F" + name, entity);
        }
    }

    public Scope getScope()
    {
        return scope;
    }

    public void setMemorySize(int memorySize)
    {
        this.memorySize = memorySize;
    }

    public int getMemorySize()
    {
        return memorySize;
    }
}
