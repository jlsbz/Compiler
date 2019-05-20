package FrontEnd;

import IR.*;
import Register.VirtualRegister;

public class BinaryOpTransformer
{
    private IRRoot irRoot;

    public BinaryOpTransformer(IRRoot irRoot)
    {
        this.irRoot = irRoot;
    }

    public void run()
    {
        for (IRFunction irFunction : irRoot.getFunctions().values())
            for (BasicBlock bb : irFunction.getReversePostOrder())
                for (Instruction inst = bb.getHead(), nextInst; inst != null; inst = nextInst) {
                    nextInst = inst.getNext();
                    if (!(inst instanceof Binary)) continue;
                    Binary binary = (Binary) inst;
                    if (binary.getDestination() == binary.getLhs()) continue;
                    if (binary.getDestination() == binary.getRhs()) {
                        if (binary.isExchangeable()) {
                            binary.setRhs(binary.getLhs());
                            binary.setLhs(binary.getDestination());
                        }
                        else {
                            VirtualRegister vr = new VirtualRegister("rhsBack");
                            binary.prepend(new Move(binary.getParentBB(), vr, binary.getRhs()));
                            binary.prepend(new Move(binary.getParentBB(), binary.getDestination(), binary.getLhs()));
                            binary.setLhs(binary.getDestination());
                            binary.setRhs(vr);
                        }
                    }
                    else if (!binary.isDivMod()) {
                        binary.prepend(new Move(binary.getParentBB(), binary.getDestination(), binary.getLhs()));
                        binary.setLhs(binary.getDestination());
                    }
                }
    }
}

