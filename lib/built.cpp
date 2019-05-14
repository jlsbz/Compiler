#include <stdio.h>
#include <string.h>
#include <malloc.h>

char* __builtin_string_concat(char *str1, char *str2) {

}

int __builtin_string_equal(char *str1, char *str2) {

}

int __builtin_string_unequal(char *str1, char *str2) {
}

int __builtin_string_less(char *str1, char *str2) {
}

int __builtin_string_less_equal(char *str1, char *str2) {
}

void print(char *str) {
    //std::cout<<(str+8);
    printf("%s", str + 8);
}

void println(char *str) {
    puts(str + 8);
}

void printInt(int num) {

}

void printlnInt(int num) {

}

char* getString() {

}

int getInt() {

}

char* toString(int num) {

}

char* __member___string_substring(char *str, int l, int r) {

}

int __member___string_parseInt(char *str) {
}

int __member___string_ord(char *str, int idx) {

}
