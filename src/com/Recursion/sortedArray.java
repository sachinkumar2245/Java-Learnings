package com.Recursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,7,6};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
//        int n = arr.length;
        if (arr.length <=1) return true;
        if (arr[0] > arr[1]) {
            return false;
        }

        int[] smallArray = new int[arr.length -1];

        for (int i = 1; i < arr.length; i++) {
            smallArray[i-1] = arr[i];
        }

        boolean isSmallArrSorted = isSorted(smallArray);
        return isSmallArrSorted;
    }
}
