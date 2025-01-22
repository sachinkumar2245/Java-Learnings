package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class MergeArr {

    static  int[] mergeSortedArrays(int[] arr1, int [] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m+n];
        int i = 0;
        int j=0;
        int k =0;
        while (i<m && j<n){
            if (arr1[i]<= arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }


        }
        while (i<m){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<n){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int [] arr2={0,3,5,7};
        int [] arr3 = mergeSortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
        Scanner in = new Scanner(System.in);

    }
}
