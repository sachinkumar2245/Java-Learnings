package com.Arrays;

public class PrintAllPairs {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,9};
        printpairs(arr);
    }

    static void printpairs(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) System.out.print("(" + arr[i] + "," + arr[j] + ") ");
        }
    }
}
