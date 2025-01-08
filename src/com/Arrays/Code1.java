package com.Arrays;

import java.util.Scanner;

public class Code1 {

    // Check even-odd function
     static boolean isOdd(){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if (num<0) {
            try {
                throw new Exception("Enter a valid input");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        return num%2!=0;
    }

     //print multiplication table
        static void multiplicationTable(){
            Scanner in = new Scanner(System.in);
            int n= in.nextInt();
            if (n<0) {
                System.out.println("Invalid Input");
                return;
            };
            for (int i = 1; i <=10; i++) {
                System.out.print((n*i)+" ");
            }
        }

        static int sumOfnNumbers(int num){
//         Scanner in = new Scanner(System.in);
//         int num = in.nextInt();
         if(num<0){
             return 0;
         }

         return num + sumOfnNumbers(num-1);
        }

        // leap year check method

    static boolean leapYear(){
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         if (num<0){
             return false;
         }

         return num % 4==0;
    }

    static int factorial(int num){

         if (num==0){
             return 1;
         }

         return num * factorial(num-1);
    }
    public static void main(String[] args) {
//        System.out.println(isOdd() ? "It's a odd number!!!!!! Hurrah" : "No!!!");
//        multiplicationTable();
//        System.out.println(sumOfnNumbers(5));
//        System.out.println(leapYear() ? "Leap Year" : "Not a leap year");
          System.out.println(factorial(5));
    }
}
