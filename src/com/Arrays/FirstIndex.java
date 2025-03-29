package com.Arrays;

public class FirstIndex {
    public static void main(String[] args) {

    }

    static int firstIndex(int a[], int x){
        if (a.length ==0 ){
            return -1;
        }

        if(a[0] ==x){
            return 0;
        }
        int smallArray[] = new int[a.length-1];
        for (int i = 0; i < a.length; i++) {
            smallArray[i -1] = a[i];

        };

        int fi = firstIndex(smallArray, x);
        if (fi == -1){
            return -1;
        }else{
            return fi++;
        }
    }

    static int firstIndexBetterApproach(int[] arr, int $target, int startIndex){
        if (startIndex == arr.length){
            return -1;
        };
        if (arr[startIndex] ==$target){
            return startIndex;
        }

        int ans = firstIndexBetterApproach(arr, $target, startIndex+1);
        return ans;
    }
}
