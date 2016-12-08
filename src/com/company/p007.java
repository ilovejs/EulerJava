package com.company;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public final class p007 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p007().run());
    }


    public String run() {
        int prime_cnt = 0;
        int number = 2;
        int nth_prime = 10001;

        while(prime_cnt < nth_prime){
            if (is_prime(number)) {
                prime_cnt += 1;
            }
            number += 1;
        }
        return Integer.toString(number - 1);
//        test
//        return Boolean.toString(is_prime(14));
    }

    private boolean is_prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            // 2%4 = 2, 4%2 = 0 (infinitely take 4 out of 2, take 2 out of 4 then 0 left)
            if(n % i == 0) return false;
        }
        return true;
    }
}