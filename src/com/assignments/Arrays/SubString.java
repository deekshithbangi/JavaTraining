package com.assignments.Arrays;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 strings");

        String str1,str2;
        str1 = input.next();
        str2 = input.next();
        System.out.println(isSubString(str1,str2));
    }

    private static boolean isSubString(String str1, String str2) {
        boolean subString = false;
        for (int i = 0; i < str1.length(); i++) {
            if (i + str2.length() - 1 < str1.length()) {
                if (str1.substring(i, i + str2.length()).equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
