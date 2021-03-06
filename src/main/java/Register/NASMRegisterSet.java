package Register;

import java.util.*;

public class NASMRegisterSet
{
    public static Collection<PhysicalRegister> allRegs, generalRegs, callerSaveRegs, calleeSaveRegs;
    public static NASMRegister rax, rbx, rcx, rdx, rsi, rdi, rsp, rbp, r8, r9, r10, r11, r12, r13, r14, r15;
    public static List<PhysicalRegister> argRegs;

    // rax/eax 0  return value  func return value
    // rbx 1
    // rcx 2
    // rdx 3
    // rsp 4  top of global stack       stack point
    // rbp 5  current stack             base point
    // rsi 6
    // rdi 7
    // r8-15
    // %rdi，%rsi，%rdx，%rcx，%r8，%r9 用作函数参数，依次对应第1参数，第2参数。。。
    // %r10，%r11 用作数据存储，遵循调用者使用规则，简单说就是使用之前要先保存原值
    // 帧指针%ebp和栈指针%esp，有了这两个指针，我们就可以刻画一个完整的栈帧
    //


    static {
        allRegs = new ArrayList<>();
        generalRegs = new ArrayList<>();
        callerSaveRegs = new ArrayList<>();
        calleeSaveRegs = new ArrayList<>();
        argRegs = new ArrayList<>();

        rax = new NASMRegister("rax", false, true, -1);
        rbx = new NASMRegister("rbx", false, false, -1);
        rdi = new NASMRegister("rdi", false, true, 0);
        rsi = new NASMRegister("rsi", false, true, 1);
        rdx = new NASMRegister("rdx", false, true, 2);
        rcx = new NASMRegister("rcx", false, true, 3);
        rsp = new NASMRegister("rsp", false, true, -1);
        rbp = new NASMRegister("rbp", false, false, -1);
        r8 = new NASMRegister("r8", true, true, 4);
        r9 = new NASMRegister("r9", true, true, 5);
        r10 = new NASMRegister("r10", true, true, -1);
        r11 = new NASMRegister("r11", true, true, -1);
        r12 = new NASMRegister("r12", true, false, -1);
        r13 = new NASMRegister("r13", true, false, -1);
        r14 = new NASMRegister("r14", true, false, -1);
        r15 = new NASMRegister("r15", true, false, -1);
    }
}
