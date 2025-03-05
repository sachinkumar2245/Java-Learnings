package com.TimeComplexity;

public class code1 {
    public static void main(String[] args) {
//        func(2);
//        int [] arr = {2,3,7,1,4,9};
//        int [] ans = bubbleSort(arr);
//        System.out.println(Arrays.toString(ans));
          normalSum(1000000);

    }

    static int [] bubbleSort(int[] arr ){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //n-1 rounds
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        return arr;
    }


    static void normalSum(int n){
        int i =0;
        int sum =0;
        while(i<=n ){
            // I'm doing some work lets suppose I'm doing a sum
            sum += i;
            i ++;
            i *= 2;
        }
        System.out.println(sum);
    }



    static void func(int n){
        int sum= 0;
        for (int i = 1; i < n*n; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }

}
