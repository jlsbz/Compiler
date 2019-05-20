package IR;

import Register.NASMRegisterSet;
import Register.PhysicalRegister;
import Register.StaticData;
import Register.StaticStr;

import java.util.*;

public class IRRoot {
    private Map<String, IRFunction> builtInFunctions = new HashMap<>(), functions = new HashMap<>();
    private List<StaticData> staticDataList = new ArrayList<>();
    private boolean hasDivShiftInst = false;
    private Map<String, StaticStr> staticStrs = new HashMap<>();
    private PhysicalRegister pr;

    public IRRoot() {
        IRFunction irFunction;
        irFunction = new IRFunction("__builtin_string_concat", "__builtin_string_concat");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__builtin_string_equal", "__builtin_string_equal");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__builtin_string_unequal", "__builtin_string_unequal");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__builtin_string_less", "__builtin_string_less");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__builtin_string_less_equal", "__builtin_string_less_equal");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("print", "__print");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("println", "__println");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("getString", "__getString");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("getInt", "__getInt");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("toString", "__toString");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__member_string_substring", "__member___string_substring");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__member_string_parseInt", "__member___string_parseInt");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("__member_string_ord", "__member___string_ord");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("printInt", "__printInt");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);

        irFunction = new IRFunction("printlnInt", "__printlnInt");
        irFunction.getUsedPhysicalGeneralRegs().addAll(NASMRegisterSet.generalRegs);
        builtInAdd(irFunction.getName(), irFunction);
    }

    public void builtInAdd(String str, IRFunction irFunction) {
        builtInFunctions.put(str, irFunction);
    }


    public Map<String, IRFunction> getFunctions() {
        return functions;
    }

    public Map<String, IRFunction> getBuiltInFunctions() {
        return builtInFunctions;
    }

    public List<StaticData> getStaticDataList() {
        return staticDataList;
    }

    public Map<String, StaticStr> getStaticStrs() {
        return staticStrs;
    }

    public void setHasDivShiftInst(boolean hasDivShiftInst) {
        this.hasDivShiftInst = hasDivShiftInst;
    }

    public void updateCalleeSet() {
        Set<IRFunction> recursiveCalleeSet = new HashSet<>();
        for (IRFunction irFunction : functions.values()) irFunction.getRecursiveCalleeSet().clear();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (IRFunction irFunction : functions.values()) {
                recursiveCalleeSet.clear();
                recursiveCalleeSet.addAll(irFunction.getCalleeSet());
                for (IRFunction calleeFunction : irFunction.getCalleeSet())
                    recursiveCalleeSet.addAll(calleeFunction.getRecursiveCalleeSet());
                if (!recursiveCalleeSet.equals(irFunction.getRecursiveCalleeSet())) {
                    irFunction.getRecursiveCalleeSet().clear();
                    irFunction.getRecursiveCalleeSet().addAll(recursiveCalleeSet);
                    flag = true;
                }
            }
        }
    }

    public boolean isHasDivShiftInst() {
        return hasDivShiftInst;
    }

    public void setPr(PhysicalRegister pr) {
        this.pr = pr;
    }

    public PhysicalRegister getPr() {
        return pr;
    }
}
