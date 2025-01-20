package com.Arrays;

import java.util.Arrays;

public class InsSort {

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
          //Insert ith element in sorted position
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr= {4,2,6,7,1,0,9};
        insertionSort(arr);

    }
}
