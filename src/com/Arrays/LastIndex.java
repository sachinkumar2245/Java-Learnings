package com.Arrays;

public class LastIndex {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4};
        int [] arr2 = {3,3,3,5,6};

        System.out.println(lastIndex(arr2, 3, 4));
    }

    static int lastIndex( int[] arr, int x, int last){
        if(last < 0){
            return -1;
        }

        if (arr[last] == x){
            return last;
        }

        int ans = lastIndex(arr, x, last-1);
        return ans;
    }

    static int lastIndexAlternative(int[] arr, int x, int startIndex){
        if (startIndex == arr.length){
            return -1;
        }

        // recursive call

        int indexinRestofArray = lastIndexAlternative(arr, x, startIndex+1);

        if (indexinRestofArray != -1){
            return indexinRestofArray;
        }

        //if x is found later in the array, return that index

        if(arr[startIndex] == x){ // if x is found at current index, return it
            return startIndex;
        }

        return -1;
    }
}
