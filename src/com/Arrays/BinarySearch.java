package com.Arrays;


public class BinarySearch {

    static int algo(int []  arr, int x){
        int s = 0;
        int e= arr.length - 1;
        while (s<=e){
            int m= (s+e)/2;
            if ( arr[m]>x) {
                e = m-1;

            } else if (arr[m]<x) {
                s=m+1;

            }else {
                return m;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
            int [] arr= {1,3,5,7,9};
        System.out.println(algo(arr,3));
    }
}
