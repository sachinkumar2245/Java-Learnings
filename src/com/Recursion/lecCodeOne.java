package com.Recursion;

public class lecCodeOne {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        System.out.println(fact(5));
//        System.out.println(sumNaturalNumbers(1000));
//        System.out.println(exponentPower(3,4));
//        System.out.println(countDigits(123456789));
          printNumber(10);
    }

// simple recursive way to evaluate sum of n natural numbers
    static int sumNaturalNumbers(int n){
        if (n==0){
            return 0;
        }
        int smallOutput = sumNaturalNumbers(n-1);
        int Output = n + smallOutput;
        return Output;
    }


    // simple recursive way to evaluate the factorial of a number
    static int fact(int n ){
        if (n==0){
            return 1;
        }
        int smallOutput = fact(n-1);
        int output = n * smallOutput;
        return output;
    }

    //code to get value when raised to  power of a number

    static int exponentPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int ans = x * exponentPower(x, n-1);
        return ans;
    }

    //code to count digits

    static int countDigits(int x){
//        int count = 0;
//        if (x==0){return 1;
//
//        }else{
//            while(x>0){
//                count++;
//                x = x/10;
//            }
//        }

        if (x <10){
            return 1;
        }



        return 1 + countDigits(x/10);
    }

    // code for N natural numbers
    static void printNumber(int x){
        if (x<1){
            return;
        }
        printNumber(x-1);
        System.out.println(x);
    }
}
