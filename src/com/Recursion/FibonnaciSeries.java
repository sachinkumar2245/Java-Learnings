package com.Recursion;

public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
 // its a brute force solution to find the fibonnaci number and time complexity is 2^n

    static int fib(int x){
        if (x <= 0) return 0;
        if(x ==1) return 1;
//        var output = fib(x-1) +fib(x-2);
        return fib(x-1) +fib(x-2);

    }
}
