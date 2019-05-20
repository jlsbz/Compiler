package IR;
//jump branch return
import java.util.Map;

public abstract class TransInst extends Instruction
{
    public TransInst(BasicBlock parentBB)
    {
        super(parentBB);
    }

    public abstract void accept(IRVisitor irVisitor);

    @Override
    public abstract Instruction copyRename(Map<Object, Object> renameMap);
}
