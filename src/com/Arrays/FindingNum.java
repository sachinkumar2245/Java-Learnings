package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingNum {
    public static void main(String[] args) {
        int[] arr = ArrayInput(); // this arr assigns the value of input to arr
        System.out.println("The largest integer in the array is "+LargestInt(arr));
    }

    static int LargestInt(int[] arr){ //this is arr is taking input as an array

        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int[] ArrayInput(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter element at " + i + "ith index");
            arr[i] = in.nextInt();

        }

        return arr; //input scope arr

    }

}
