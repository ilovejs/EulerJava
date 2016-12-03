package com.company;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;

public final class p003 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p003().run());
    }


    public String run() {
        // 64 bits
        long number = 600851475143L;
        long minimum_factor;

        // divided by smallest prime factor towards the biggest.
        //      e.g.    2 x 3 x 3 x 13
        //              1 x 11
        // Principle 1: prime number is always odd.
        // Principle 2: any number can be expressed as a product of primes !
        while(true){

            minimum_factor = min_factor(number);

            if (number == minimum_factor) {
                return Long.toString(minimum_factor);
            }

            System.out.println("n: " + number + " , factor: " + minimum_factor);

            number = number / minimum_factor;
        }
    }

    private long min_factor(long number) {
        // number needs to > 1
        for (long i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}