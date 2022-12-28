package com.company;

public class SixthTask {
    /**
     * URL: https://projecteuler.net/problem=6
     *
     * The sum of the squares of the first ten natural numbers is,
     *
     * The square of the sum of the first ten natural numbers is,
     *
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
     *
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public static void main(String[] args) {
        int sqrtsum = 0;
        int sumsqrt = 0;
        for (int i = 0; i < 101; i++) {
            sqrtsum = sqrtsum + (int)Math.pow(i,2);
            sumsqrt = sumsqrt+i;
        }
        sumsqrt = (int)Math.pow(sumsqrt,2);
        System.out.println(sumsqrt -sqrtsum);

    }
}
