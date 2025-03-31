package com.Strings;

import java.beans.PropertyEditorManager;

public class ReplacePi {
    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("aabcca"));
    }

    static String changePi(String s){

        if(s.length() <= 1){
            return s;
        };

        if( s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            return " 3.14 " + changePi(s.substring(2));
        }else{
            return s.charAt(0) + changePi(s.substring(1));
        }
    }

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }

        // Recursively process the rest of the string
        String smallOutput = removeConsecutiveDuplicates(s.substring(1));

        // Check if first character matches the first of the reduced string
        if (s.charAt(0) == smallOutput.charAt(0)) {
            return smallOutput; // Ignore the first character as it's a duplicate
        } else {
            return s.charAt(0) + smallOutput; // Keep the first character and append the rest
        }
    }

}
