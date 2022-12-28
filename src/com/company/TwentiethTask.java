package com.company;

import java.math.BigInteger;

public class TwentiethTask {

    /**
     * URL: https://projecteuler.net/problem=20
     *
     * n! means n × (n − 1) × ... × 3 × 2 × 1
     *
     * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
     * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
     *
     * Find the sum of the digits in the number 100!
     *
     */
    public static void main(String[] args) {
        BigInteger number = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        char[] chars = (number.toString()).toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result + Character.getNumericValue(chars[i]);
        }
        System.out.println(result);
    }
}
