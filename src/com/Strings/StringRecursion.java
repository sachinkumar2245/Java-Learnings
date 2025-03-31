package com.Strings;

public class StringRecursion {
    public static void main(String[] args) {
        String s  = "ababab";
        System.out.println(removeX("axbxcx"));
    }

    static String replaceChar(String s, char a, char b){
        if(s.length() == 0){
            return s;
        }

        String smallOutput = replaceChar(s.substring(1), a, b);

        if(s.charAt(0) ==a ){
            return b + smallOutput;
        }else {
            return s.charAt(0) + smallOutput;
        }
    }

    static String removeX( String s) {
        if (s.isEmpty()) {
            return s;
        }
        ;

//        String smallOutput = removeX(s.substring(1));
        if (s.charAt(0) == 'x' || s.charAt(0) == 'X') {
            return removeX(s.substring(1));
        } else {
            return s.charAt(0) + removeX(s.substring(1));
        }
    }
}
