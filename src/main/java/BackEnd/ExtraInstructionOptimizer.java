package BackEnd;

import IR.*;

public class ExtraInstructionOptimizer {
    private IRRoot ir;

    public ExtraInstructionOptimizer(IRRoot ir) {
        this.ir = ir;
    }

    public void run() {
        for (IRFunction func : ir.getFunctions().values()) {
            for (BasicBlock bb : func.getReversePostOrder()) {
                for (Instruction inst = bb.getHead(), lastInst = null; inst != null; inst = inst.getNext()) {
                    boolean remove = false;
                    if (inst instanceof Move) {
                        Move moveInst = (Move) inst;
                        if (moveInst.getLhs() == moveInst.getRhs()) remove = true;
                        else if (lastInst instanceof Move &&
                                moveInst.getLhs() == ((Move) lastInst).getRhs() &&
                                moveInst.getRhs() == ((Move) lastInst).getLhs()) remove = true;
                    } else if (inst instanceof Load) {
                        if (lastInst instanceof Store &&
                                ((Store) lastInst).getValue() == ((Load) inst).getDestination() &&
                                ((Store) lastInst).getAddress() == ((Load) inst).getAddress() &&
                                ((Store) lastInst).getAddrOffset() == ((Load) inst).getAddrOffset() &&
                                ((Store) lastInst).getSize() == ((Load) inst).getSize()) remove = true;
                    } else if (inst instanceof Store) {
                        if (lastInst instanceof Load &&
                                ((Load) lastInst).getDestination() == ((Store) inst).getValue() &&
                                ((Load) lastInst).getAddress() == ((Store) inst).getAddress() &&
                                ((Load) lastInst).getAddrOffset() == ((Store) inst).getAddrOffset() &&
                                ((Load) lastInst).getSize() == ((Store) inst).getSize()) remove = true;
                    }
                    if (remove) inst.remove();
                    else lastInst = inst;
                }
            }
        }
    }
}