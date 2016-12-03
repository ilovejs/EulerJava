package com.company;

/* Smallest multiple
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is (evenly) divisible by all of the numbers from 1 to 20?
*/

public final class p005 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p005().run());
    }


    public String run() {
        long n = 1;

        while(true){
            if(divisible_1_to_20(n)) {
                return Long.toString(n);
            }
            n += 1;
        }
    }

    private boolean divisible_1_to_20(long n){
        for(int i = 2; i < 21; i++){
            // don't use ==, it's a rejection pattern
            if(n % i != 0)
                return false;
        }
        return true;
    }

}