package com.Strings;

import java.util.Scanner;

public class reverseStr {

    static void reverseString(String str){
        int n = str.length();
        String str2 ="";
        for (int i =0; i < n; i++) {
            str2 = str.charAt(i) + str2;
        }
        System.out.println(str2.toLowerCase());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        reverseString(str);
    }
}
