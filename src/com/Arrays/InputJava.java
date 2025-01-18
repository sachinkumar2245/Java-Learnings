package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n]; //this denotes the length of the array

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "ith index");
            arr[i] = in.nextInt();

        }
        System.out.println( Arrays.toString( arr));
    }
}
