package ASTNode;
import FrontEnd.ASTVisitor;
import Scope.VarEntity;

public class IdExpressionNode extends ExpressionNode
{
    public String name;
    public VarEntity entity = null;
    public boolean isChecked = false;
    public boolean needMemOp;

    public IdExpressionNode(int line)
    {
        this.name = null;
        this.line = line;
    }

    public IdExpressionNode(String name, int line)
    {
        this.name = name;
        this.line = line;
    }

    public String getName()
    {
        return name;
    }

    public void setEntity(VarEntity entity)
    {
        this.entity = entity;
    }

    public boolean isChecked()
    {
        return isChecked;
    }

    public void setChecked(boolean isChecked)
    {
        this.isChecked = isChecked;
    }

    public boolean isNeedMemOp()
    {
        return needMemOp;
    }

    public void setNeedMemOp(boolean needMemOp)
    {
        this.needMemOp = needMemOp;
    }

    public VarEntity getEntity()
    {
        return entity;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof IdExpressionNode)) return false;
        return name.equals(((IdExpressionNode) obj).getName());
    }
}
