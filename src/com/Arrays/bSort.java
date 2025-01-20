package com.Arrays;

import java.util.Arrays;

public class bSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //n-1 rounds
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,3,6,5,4,2,1,0};
        bubbleSort(arr);
    }
}
