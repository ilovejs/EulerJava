package com.company;

/* Largest palindrome product
A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.ArrayList;
import java.util.Comparator;

public final class p004 implements EulerSolution {

    public static void main(String[] args) {

        System.out.println(new p004().run());
//        System.out.println(new p004().is_palindromic("900099"));
    }


    public String run() {
        String product_s;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                product_s = Integer.toString(i * j);
                if (is_palindromic(product_s)) {
                    list.add(i * j);
                }
            }
        }
        list.sort(Comparator.comparingInt(o -> o));
        int result = list.get(list.size() - 1);
        System.out.println(result);

        return Integer.toString(result);
    }

    private boolean is_palindromic(String origin){

        int len = origin.length();

        if (len == 0 || len == 1) return true;

        if (origin.charAt(0) != origin.charAt(len - 1))
            return false;
        // [begin, end)
        String s = origin.substring(1, len - 1);
//        System.out.println(s);

        return is_palindromic(s);
    }
}