package com.company;

public class SecondTask {
    /**
     *URL: https://projecteuler.net/problem=2
     *
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     */
    public static void main(String[] args) {
        int[] arr = new int[35];
        arr[0] = 1;
        arr[1] = 2;
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i]= arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < 4000000) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}