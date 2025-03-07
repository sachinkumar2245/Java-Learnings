package com.Recursion;

//its lecture code to check if the array is sorted or not!

import java.util.Arrays;

public class checkIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arrCopy = new int[arr.length -1];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy));
    }

}
