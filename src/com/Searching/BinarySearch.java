package com.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,3,5,7,9};
        System.out.println(binarySearch(arr, 0, arr.length-1, 9));
    }

    // regular binary search approach
    static int bSearchOne(int[] arr, int target){
//        int length = arr.length - 1;

        int start = 0;
        int end = arr.length - 1;
      while (start<= end){
            int mid = (start + end) / 2;
            if (arr[mid] > target){
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid +1;
            }else{
                return mid;
            }

        }
        return -1;
    }
    // recursive approach;
    static int binarySearch(int[] arr, int si, int ei, int tgt){
        if (si > ei){
            return -1;
        }

        int mid = (si + ei)/2;
        if( arr[mid] == tgt){
            return mid;
        }else if(arr[mid] < tgt){
            return binarySearch(arr, mid+1, ei, tgt);
        } else {
            return binarySearch(arr, si, mid-1, tgt);

        }

    }
}
