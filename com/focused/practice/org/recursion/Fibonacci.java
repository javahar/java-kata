package com.focused.practice.org.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fibb(n));
    }

    private static int fibb(int n) {
        System.out.println(n-1);
        if(n == 0) return 1;
        if (n == 1) return 1;


        return  fibb(n-1) + fibb(n-2);
    }
}
