package com.Recursion;

public class questionSumArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(sum(arr));
//        System.out.println(sum2(arr, 0));
        System.out.println(isPresent(9, arr, 0));
    }

    static int sum(int [] arr){
        if (arr.length == 1){
            return arr[0];
        };
        int[] smallarr = new int [arr.length -1 ];
        for (int i = 1; i < arr.length; i++) { // Copy elements from index 1 to new array
            smallarr[i - 1] = arr[i];
        }
        int add = arr[0] + sum(smallarr);

         return add;
    }

    static int sum2(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: No more elements left
        }
        return arr[index] + sum2(arr,  index+1); // Add current element and recurse
    }

    static boolean isPresent(int target, int[] arr, int index){
        if(arr.length == 0 || index == arr.length ) return false;
        if(arr[index] == target) return true;
        return isPresent(target, arr, index+1);
    }


}
