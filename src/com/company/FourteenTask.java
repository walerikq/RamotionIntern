package com.company;

public class FourteenTask {
    /**
     *
     * URL: https://projecteuler.net/problem=14
     *The following iterative sequence is defined for the set of positive integers:
     *
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     *
     * Using the rule above and starting with 13, we generate the following sequence:
     *
     * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
     *
     * Which starting number, under one million, produces the longest chain?
     *
     * NOTE: Once the chain starts the terms are allowed to go above one million.
     *
     */
    public static void main(String[] args) {

        int res = 0;
        int result = 0;
        for (int i = 100000; i > 1; i--) {


            int chain = 0;

            int num = i;
            System.out.print(num);
            while(true){
                if (num % 2 == 0){
                    num=num/2;
                    System.out.print(" -> ");
                }else if (num % 2 == 1 && num != 1){
                    num=num*3+1;
                    System.out.print(" -> ");
                }else if (num == 1 || num < 0){
                    break;
                }
                System.out.print(num);
                chain++;
            }

            if (chain>res){
                res = chain;
                result = i;
            }
            System.out.println();
        }
        System.out.println(result);
    }
}
