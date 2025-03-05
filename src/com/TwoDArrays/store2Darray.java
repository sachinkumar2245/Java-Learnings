package com.TwoDArrays;

import java.util.Arrays;

public class store2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12,2}};
        // the above arr stores the reference of references of the arrays
        // the individual arrays could have different length
        System.out.println(Arrays.deepToString(arr));

    }
}
