





default rel

global __builtin_string_concat
global __builtin_string_equal
global __builtin_string_unequal
global __builtin_string_less
global __builtin_string_less_equal
global _Z5printPc
global _Z7printlnPc
global _Z8printInti
global _Z10printlnInti
global _Z9getStringv
global _Z6getIntv
global _Z8toStringi
global _Z27__member___string_substringPcii
global _Z26__member___string_parseIntPc
global _Z21__member___string_ordPci

extern puts
extern printf
extern _GLOBAL_OFFSET_TABLE_


SECTION .text   

__builtin_string_concat:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        nop
        pop     rbp
        ret


__builtin_string_equal:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        nop
        pop     rbp
        ret


__builtin_string_unequal:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        nop
        pop     rbp
        ret


__builtin_string_less:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        nop
        pop     rbp
        ret


__builtin_string_less_equal:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     qword [rbp-10H], rsi
        nop
        pop     rbp
        ret


_Z5printPc:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rsi, rax
        lea     rdi, [rel L_001]
        mov     eax, 0
        call    printf
        nop
        leave
        ret


_Z7printlnPc:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     qword [rbp-8H], rdi
        mov     rax, qword [rbp-8H]
        add     rax, 8
        mov     rdi, rax
        call    puts
        nop
        leave
        ret


_Z8printInti:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-4H], edi
        nop
        pop     rbp
        ret


_Z10printlnInti:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-4H], edi
        nop
        pop     rbp
        ret


_Z9getStringv:
        push    rbp
        mov     rbp, rsp
        nop
        pop     rbp
        ret


_Z6getIntv:
        push    rbp
        mov     rbp, rsp
        nop
        pop     rbp
        ret


_Z8toStringi:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-4H], edi
        nop
        pop     rbp
        ret


_Z27__member___string_substringPcii:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     dword [rbp-0CH], esi
        mov     dword [rbp-10H], edx
        nop
        pop     rbp
        ret


_Z26__member___string_parseIntPc:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        nop
        pop     rbp
        ret


_Z21__member___string_ordPci:
        push    rbp
        mov     rbp, rsp
        mov     qword [rbp-8H], rdi
        mov     dword [rbp-0CH], esi
        nop
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


SECTION .rodata 

L_001:
        db 25H, 73H, 00H


