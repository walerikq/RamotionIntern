package com.company;

public class FifthTask {

    /**
     * URL: https://projecteuler.net/problem=5
     *
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     *
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    break;
                }
                if (j == 20 && i % 20 == 0) {
                    result = i;
                }
            }
            if (result > 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
