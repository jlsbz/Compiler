package Util;

import java.util.*;


public class Print {

    public static void printStr(String str) {
        System.out.println(str);
    }

    public static void printStrWtihSpace(int tab, String str) {
        for (int i = 0; i < tab; ++i) System.out.print("    ");
        System.out.println(str);
    }

    public static void printStrWithLine(int tab, String str) {
        for (int i = 0; i < tab; ++i) System.out.print("----");
        System.out.println(str);
    }

}