package com.TwoDArrays;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {

        int [][] arr2d = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8; j++) {
                arr2d[i][j] = j+1;


            }

        }
        // its column wise printing of the 2D array
        for (int j = 0; j< 8; j++) {
            for (int i = 0; i< 8; i++) {
                System.out.print(arr2d[i][j] + " ");

            }
            System.out.println();

        }
    }
}
