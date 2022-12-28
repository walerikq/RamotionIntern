package com.company;

public class ThirdTask {
    /**
     * URL: https://projecteuler.net/problem=3
     *
     * The prime factors of 13195 are 5, 7, 13 and 29.
     *
     * What is the largest prime factor of the number 600851475143 ?
     *
     */
    public static void main(String[] args) {
        long num = 600851475143L;
        System.out.println(num);
        long result = (long) Math.sqrt(num);
        for (long i = result; i > 3; i -= 2) {


            if (i % 2 == 0) {
                i++;
                continue;
            }


            System.out.println(i);

            if (isPrime(i) && num % i == 0) {
                System.out.println(i);
                break;
            }

        }

    }

    static boolean isPrime(long n) {
        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }
}
