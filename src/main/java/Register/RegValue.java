package Register;

import IR.IRVisitor;

public abstract class RegValue
{
    public abstract void accept(IRVisitor irVisitor);
    public abstract RegValue copy();
}
