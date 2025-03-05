package com.TwoDArrays;

import java.util.Scanner;

public class columnSum {

    static int largestCol(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = in.nextInt();
        int [][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the value of " + i+ "th row and "+ j+"th column");
                arr[i][j] = in.nextInt();

            }

        }
        int Max = Integer.MIN_VALUE;
        for (int j = 0; j < cols ; j++) {
            int sum =0;
            for (int i = 0; i < rows; i++) {

                sum = sum + arr[i][j];
            }
            if (sum>Max){
                Max = sum;
            }
        }
        return Max;

    }
    public static void main(String[] args) {
        int largestColSum= largestCol();
        System.out.println(largestColSum);
    }
}
