package Util;

import java.util.*;


public class Print {

    public static void printStr(String str) {
        System.out.println(str);
    }

    public static void printSpaceAndStr(int tab, String str) {
        for (int i = 0; i < tab; ++i) System.out.print("    ");
        System.out.println(str);
    }

    public static void printDashAndStr(int tab, String str) {
        for (int i = 0; i < tab; ++i) System.out.print("----");
        System.out.println(str);
    }

}