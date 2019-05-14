default rel

global _Z5printPc
global _Z7printlnPc
global _Z9getStringv
global _Z6getIntv
global _Z8toStringi
global __string_length
global _Z27__member___string_substringPcii
global _Z26__member___string_parseIntPc
global _Z21__member___string_ordPci
global __builtin_string_concat
global __string_compare
global _Z8printInti
global _Z10printlnInti
global __builtin_string_equal
global __builtin_string_unequal
global __builtin_string_less
global __builtin_string_less_equal
global main

extern getchar
extern strlen
extern scanf
extern putchar
extern strcmp
extern __sprintf_chk
extern __stack_chk_fail
extern memcpy
extern malloc
extern __isoc99_scanf
extern puts
extern __printf_chk
extern _GLOBAL_OFFSET_TABLE_


SECTION .text

__print:
        lea     rdx, [rdi+8H]
        mov     rsi, L_011
        mov     edi, 1
        xor     eax, eax
        jmp     __printf_chk

ALIGN   16

__println:
        add     rdi, 8
        jmp     puts

ALIGN   8

__getString:
        push    rbp
        push    rbx
        mov     rsi, __buffer.3340
        mov     rdi, L_011
        xor     eax, eax
        sub     rsp, 8
        call    __isoc99_scanf
        mov     rcx, __buffer.3340
        mov     rbx, rcx

L_001:  mov     edx, dword [rbx]
        add     rbx, 4
        lea     eax, [rdx-1010101H]
        not     edx
        and     eax, edx
        and     eax, 80808080H
        jz      L_001
        mov     edx, eax
        shr     edx, 16
        test    eax, 8080H
        cmove   eax, edx
        lea     rdx, [rbx+2H]
        mov     esi, eax
        cmove   rbx, rdx
        add     sil, al
        sbb     rbx, 3
        sub     rbx, rcx
        lea     edi, [rbx+8H]
        movsxd  rdi, edi
        call    malloc
        mov     rbp, rax
        lea     rdx, [rbx+1H]
        movsxd  rax, ebx
        lea     rdi, [rbp+8H]
        mov     rsi, __buffer.3340
        mov     qword [rbp], rax
        call    memcpy
        add     rsp, 8
        mov     rax, rbp
        pop     rbx
        pop     rbp
        ret

_Z6getIntv:
        sub     rsp, 24
        mov     rdi, L_012
        mov     rax, qword [fs:abs 28H]
        mov     qword [rsp+8H], rax
        xor     eax, eax
        mov     rsi, rsp
        call    __isoc99_scanf
        mov     rdx, qword [rsp+8H]
        xor     rdx, qword [fs:abs 28H]
        mov     rax, qword [rsp]
        jnz     L_002
        add     rsp, 24
        ret

L_002:  call    __stack_chk_fail

ALIGN   16

__toString:
        push    rbp
        push    rbx
        mov     rbp, rdi
        mov     edi, 32
        sub     rsp, 8
        call    malloc
        mov     rcx, L_012
        lea     rdi, [rax+8H]
        mov     rbx, rax
        mov     r8, rbp
        mov     edx, 24
        mov     esi, 1
        xor     eax, eax
        call    __sprintf_chk
        cdqe
        mov     qword [rbx], rax
        add     rsp, 8
        mov     rax, rbx
        pop     rbx
        pop     rbp
        ret

ALIGN   16

__string_length:
        mov     rax, qword [rdi]
        ret

ALIGN   16

__string_substring:
        push    r14
        push    r13
        mov     r14, rsi
        push    r12
        push    rbp
        mov     r12, rdi
        push    rbx
        mov     ebx, edx
        sub     ebx, esi
        lea     edi, [rbx+0AH]
        lea     ebp, [rbx+1H]
        movsxd  rdi, edi
        call    malloc
        test    ebp, ebp
        mov     r13, rax
        movsxd  rax, ebp
        mov     qword [r13], rax
        jle     L_003
        mov     edx, ebx
        lea     rdi, [r13+8H]
        lea     rsi, [r12+r14+8H]
        add     rdx, 1
        call    memcpy

L_003:  add     ebp, 8
        mov     rax, r13
        movsxd  rbp, ebp
        pop     rbx
        mov     byte [r13+rbp], 0
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        ret

ALIGN   8

__string_parseInt:
        movsx   eax, byte [rdi+8H]
        cmp     al, 45
        jz      L_006
        lea     edx, [rax-30H]
        cmp     dl, 9
        ja      L_007
        lea     rcx, [rdi+8H]
        xor     edi, edi

L_004:  xor     edx, edx

ALIGN   16

L_005:  lea     edx, [rdx+rdx*4]
        add     rcx, 1
        lea     edx, [rax+rdx*2-30H]
        movsx   eax, byte [rcx]
        lea     esi, [rax-30H]
        cmp     sil, 9
        jbe     L_005
        movsxd  rcx, edx
        neg     edx
        test    edi, edi
        movsxd  rax, edx
        cmove   rax, rcx
        ret

ALIGN   16

L_006:  movsx   eax, byte [rdi+9H]
        lea     rcx, [rdi+9H]
        lea     edx, [rax-30H]
        cmp     dl, 9
        ja      L_007
        mov     edi, 1
        jmp     L_004

ALIGN   16

L_007:  xor     eax, eax
        ret

ALIGN   16

__string_ord:
        movsx   rax, byte [rdi+rsi+8H]
        ret

ALIGN   16

__string_concat:
        push    r14
        push    r13
        mov     r14, rdi
        push    r12
        push    rbp
        mov     r13, rsi
        push    rbx
        mov     rbx, qword [rdi]
        mov     r12, qword [rsi]
        lea     rdi, [rbx+r12+9H]
        call    malloc
        mov     rbp, rax
        lea     rax, [rbx+r12]
        test    rbx, rbx
        mov     qword [rbp], rax
        jle     L_010
        lea     rdi, [rbp+8H]
        lea     rsi, [r14+8H]
        mov     rdx, rbx
        add     ebx, 8
        call    memcpy
        movsxd  rax, ebx
L_008:  test    r12, r12
        jle     L_009
        movsxd  rdi, ebx
        lea     rsi, [r13+8H]
        mov     rdx, r12
        add     rdi, rbp
        call    memcpy
        lea     eax, [rbx+r12]
        cdqe
L_009:  mov     byte [rbp+rax], 0
        mov     rax, rbp
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        ret

L_010:  mov     eax, 8
        mov     ebx, 8
        jmp     L_008

ALIGN   8

__string_compare:
        sub     rsp, 8
        add     rsi, 8
        add     rdi, 8
        call    strcmp
        add     rsp, 8
        cdqe
        ret

SECTION .data

SECTION .bss    align=32

__buffer.3340:
        resb    1048576

SECTION .text.startup

SECTION .rodata.str1.1

L_011:
        db 25H, 73H, 00H

L_012:
        db 25H, 6CH, 64H, 00H

_Z5printPc:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rax
        mov     edi, L_043
        mov     eax, 0
        call    printf
        nop
        leave
        ret

_Z8printInti:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 80
        mov     dword [rbp-44H], edi


        mov     rax, qword [fs:abs 28H]
        mov     qword [rbp-8H], rax
        xor     eax, eax
        cmp     dword [rbp-44H], 0
        jnz     L_013
        mov     edi, 48
        call    putchar
L_013:  cmp     dword [rbp-44H], 0
        jns     L_014
        neg     dword [rbp-44H]
        mov     edi, 45
        call    putchar
L_014:  mov     dword [rbp-38H], 0
L_015:  cmp     dword [rbp-44H], 0
        jle     L_016
        mov     esi, dword [rbp-38H]
        lea     eax, [rsi+1H]
        mov     dword [rbp-38H], eax
        mov     ecx, dword [rbp-44H]
        mov     edx, 1717986919
        mov     eax, ecx
        imul    edx
        sar     edx, 2
        mov     eax, ecx
        sar     eax, 31
        sub     edx, eax
        mov     eax, edx
        shl     eax, 2
        add     eax, edx
        add     eax, eax
        sub     ecx, eax
        mov     edx, ecx
        movsxd  rax, esi
        mov     dword [rbp+rax*4-30H], edx
        mov     ecx, dword [rbp-44H]
        mov     edx, 1717986919
        mov     eax, ecx
        imul    edx
        sar     edx, 2
        mov     eax, ecx
        sar     eax, 31
        sub     edx, eax
        mov     eax, edx
        mov     dword [rbp-44H], eax
        jmp     L_015

L_016:  mov     eax, dword [rbp-38H]
        sub     eax, 1
        mov     dword [rbp-34H], eax
L_017:  cmp     dword [rbp-34H], 0
        js      L_018
        mov     eax, dword [rbp-34H]
        cdqe
        mov     eax, dword [rbp+rax*4-30H]
        add     eax, 48
        mov     edi, eax
        call    putchar
        sub     dword [rbp-34H], 1
        jmp     L_017

L_018:  nop
        mov     rax, qword [rbp-8H]


        xor     rax, qword [fs:abs 28H]
        jz      L_019
        call    __stack_chk_fail
L_019:  leave
        ret



_Z10printlnInti:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 80
        mov     dword [rbp-44H], edi


        mov     rax, qword [fs:abs 28H]
        mov     qword [rbp-8H], rax
        xor     eax, eax
        cmp     dword [rbp-44H], 0
        jnz     L_020
        mov     edi, 48
        call    putchar
L_020:  cmp     dword [rbp-44H], 0
        jns     L_021
        neg     dword [rbp-44H]
        mov     edi, 45
        call    putchar
L_021:  mov     dword [rbp-38H], 0
L_022:  cmp     dword [rbp-44H], 0
        jle     L_023
        mov     esi, dword [rbp-38H]
        lea     eax, [rsi+1H]
        mov     dword [rbp-38H], eax
        mov     ecx, dword [rbp-44H]
        mov     edx, 1717986919
        mov     eax, ecx
        imul    edx
        sar     edx, 2
        mov     eax, ecx
        sar     eax, 31
        sub     edx, eax
        mov     eax, edx
        shl     eax, 2
        add     eax, edx
        add     eax, eax
        sub     ecx, eax
        mov     edx, ecx
        movsxd  rax, esi
        mov     dword [rbp+rax*4-30H], edx
        mov     ecx, dword [rbp-44H]
        mov     edx, 1717986919
        mov     eax, ecx
        imul    edx
        sar     edx, 2
        mov     eax, ecx
        sar     eax, 31
        sub     edx, eax
        mov     eax, edx
        mov     dword [rbp-44H], eax
        jmp     L_022

L_023:  mov     eax, dword [rbp-38H]
        sub     eax, 1
        mov     dword [rbp-34H], eax
L_024:  cmp     dword [rbp-34H], 0
        js      L_025
        mov     eax, dword [rbp-34H]
        cdqe
        mov     eax, dword [rbp+rax*4-30H]
        add     eax, 48
        mov     edi, eax
        call    putchar
        sub     dword [rbp-34H], 1
        jmp     L_024

L_025:  mov     edi, 10
        call    putchar
        nop
        mov     rax, qword [rbp-8H]


        xor     rax, qword [fs:abs 28H]
        jz      L_026
        call    __stack_chk_fail
L_026:  leave
        ret


__builtin_string_equal:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        mov     rax, qword [rbp-10H]
        lea     rdx, [rax+8H]
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rdx
        mov     rdi, rax
        call    strcmp
        test    eax, eax
        sete    al
        movzx   eax, al
        leave
        ret


__builtin_string_unequal:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        mov     rax, qword [rbp-10H]
        lea     rdx, [rax+8H]
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rdx
        mov     rdi, rax
        call    strcmp
        test    eax, eax
        setne   al
        movzx   eax, al
        leave
        ret


__builtin_string_less:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        mov     rax, qword [rbp-10H]
        lea     rdx, [rax+8H]
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rdx
        mov     rdi, rax
        call    strcmp
        shr     eax, 31
        movzx   eax, al
        leave
        ret


__builtin_string_less_equal:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        mov     rax, qword [rbp-10H]
        lea     rdx, [rax+8H]
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rdx
        mov     rdi, rax
        call    strcmp
        test    eax, eax
        setle   al
        movzx   eax, al
        leave
        ret