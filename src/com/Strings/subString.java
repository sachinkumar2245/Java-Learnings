package com.Strings;

import java.util.Scanner;

public class subString {

    static void subStriing(String str){
        int n = str.length();
        for (int i = 0; i < n ; i++) {
//            System.out.println(str.charAt(i));
            for (int j = i; j <n ; j++) {
                System.out.print(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        subStriing(str);
    }
}
