package com.company;

public class SevenTask {

    /**
     * URL: https://projecteuler.net/problem=7
     *
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     *
     * What is the 10 001st prime number?
     */
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                num++;
            }
            if (num == 10001) {
                System.out.println(i);
                break;
            }
        }
    }
}
