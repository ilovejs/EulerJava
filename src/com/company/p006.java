package com.company;

/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the 'sum of the squares' of the first one hundred natural numbers and the 'square of the sum'.
 */


public final class p006 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p006().run());
    }


    public String run() {
        long sum_of_sq = 0;
        long sq_of_sum;

        for(int i = 1; i <= 100; i++){
            sum_of_sq += i*i;
        }

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        sq_of_sum = sum * sum;
        return Long.toString(sq_of_sum - sum_of_sq);
    }



}