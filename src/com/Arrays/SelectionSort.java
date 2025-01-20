package com.Arrays;

import java.util.Arrays;

public class SelectionSort {

    static void sortAlgo(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            //Insert element at the ith position
            int min = Integer.MAX_VALUE;
            int minIndex= -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min){
                    min = arr[j];
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]= temp;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int [] arr = {42542,74534,6735,43534,36953};
        sortAlgo(arr);
    }
}
