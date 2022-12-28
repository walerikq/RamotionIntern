package com.company;

import java.math.BigDecimal;

public class SixteenthTask {
    /**
     * URL: https://projecteuler.net/problem=16
     *
     * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     *
     * What is the sum of the digits of the number 21000?
     */
    public static void main(String[] args) {
        double number = Math.pow(2, 1000);
        BigDecimal decimal = new BigDecimal(number);
        char[] chars = (decimal.toString()).toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result + Character.getNumericValue(chars[i]);
        }
        System.out.println(result);
    }
}
