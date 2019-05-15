package ASTNode;
import FrontEnd.ASTVisitor;
import Scope.VarEntity;

public class IdExpressionNode extends ExpressionNode
{
    private String name;
    private VarEntity entity = null;
    private boolean isChecked = false;
    private boolean needMemOp;

    public IdExpressionNode(String name, Location config)
    {
        this.name = name;
        this.loc = config;
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
