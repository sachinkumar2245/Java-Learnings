package com.TimeComplexity;

import java.util.Arrays;

public class code2 {
    public static void main(String[] args) {
        int[] list = {17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] list2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        boolean ans = intersectionOfArrays(list, list2);
        System.out.println(ans);

    }
    static boolean intersectionOfArrays(int [] arr, int[] arr2){
        int x = arr.length;
        int y = arr2.length;
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i] == arr2[j]){
                    return true;
                }
            }
        }
        return false;

    }

}

