package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputfnt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayInput()));
    }

    static int[] ArrayInput(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter element at " + i + "ith index");
            arr[i] = in.nextInt();

        }

        return arr;

    }
}
