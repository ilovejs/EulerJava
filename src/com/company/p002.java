package com.company;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
小于4百万fibonacci数字中，偶数的和
 */

public final class p002 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p002().run());
    }

    public String run() {
        int sum = 0;
        int low = 1;
        int high = 1;
        int fib;

        for (int i = 1; i < 2000000; i++) {
            fib = low + high;
            if (fib >= 4000000) break;

            if (fib % 2 == 0) {
                sum += fib;
            }

            low = high;
            high = fib;
            System.out.println(fib);
        }
        return "Sum: " + Integer.toString(sum);
    }

    // 4m = 4 * 10^6 which needs 7 bits
    // int is 32 bits
}