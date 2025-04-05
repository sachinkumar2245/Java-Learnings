package com.Searching;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,9,4,9,5,0,1,7,2,8};
        mergeSortArraySplit(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeAlgoUsingRecursion(int[] arr, int[] arrtwo, int i, int j, int k, int[] arr3) {
        if (i >= arr.length && j >= arrtwo.length) {
            return;
        }

        if (i >= arr.length) {
            arr3[k] = arrtwo[j];
            mergeAlgoUsingRecursion(arr, arrtwo, i, j + 1, k + 1, arr3);
        } else if (j >= arrtwo.length) {
            arr3[k] = arr[i];
            mergeAlgoUsingRecursion(arr, arrtwo, i + 1, j, k + 1, arr3);
        } else if (arr[i] <= arrtwo[j]) {
            arr3[k] = arr[i];
            mergeAlgoUsingRecursion(arr, arrtwo, i + 1, j, k + 1, arr3);
        } else {
            arr3[k] = arrtwo[j];
            mergeAlgoUsingRecursion(arr, arrtwo, i, j + 1, k + 1, arr3);
        }


    }

    static void mergeSortArraySplit(int[] arr){
        int n = arr.length;

        if (n <=1) return;;

        int[] arr2  = new int[n/2];
        int m= n- arr2.length;
        int[] arr3 = new int[m];

        for (int i = 0; i < n/2; i++) {
            arr2[i] = arr[i];
        }

        for (int i = n/2; i< n; i++) {
            arr3[i-n/2] = arr[i];
        }

        mergeSortArraySplit(arr2);
        mergeSortArraySplit(arr3);
        merge(arr2, arr3, arr);

    }

    static void merge(int[] arr, int[] arr2, int[] merged){
        int m = arr.length;
        int n = arr2.length;

        int i = 0;
        int j=0;
        int k =0;
        while (i<m && j<n){
            if (arr[i]<= arr2[j]){
                merged[k]=arr[i];
                i++;
                k++;
            }else{
                merged[k]=arr2[j];
                j++;
                k++;
            }


        }
        while (i<m){
            merged[k]=arr[i];
            i++;
            k++;
        }
        while (j<n){
            merged[k]=arr2[j];
            j++;
            k++;
        }
    }


}
