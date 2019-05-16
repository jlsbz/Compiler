package Register;

import IR.IRVisitor;

public abstract class Register extends RegValue
{
    public abstract void accept(IRVisitor irVisitor);
}
