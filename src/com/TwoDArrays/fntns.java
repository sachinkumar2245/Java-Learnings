package com.TwoDArrays;

import java.util.Arrays;


public class fntns {

    static int[][] takeInput(){
        int [][] arr2d = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                arr2d[i][j] = j+1;


            }

        }
        return arr2d;
    }

    public static void main(String[] args) {
        int [][] arr= takeInput();
        System.out.println(Arrays.deepToString(arr));

    }
}
