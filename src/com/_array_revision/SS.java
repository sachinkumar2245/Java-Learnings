package com._array_revision;

public class SS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch2(arr, 5));
    }

    //this method is brute force we will use to search the element in the array and return true
    static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    // optimized binary search with a mid element 

    static int binarySearch2(int[] arr, int target) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        while (s<=e) {

            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;

            } else if (arr[mid] > target) {
                e = mid - 1;
            }

        }
        return -1;
    }
}
