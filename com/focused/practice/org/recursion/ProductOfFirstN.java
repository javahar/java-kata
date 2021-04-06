package com.focused.practice.org.recursion;

public class ProductOfFirstN {

    public static void main(String[] args) {
        System.out.println(product(5));
    }

    private static int product(int num) {
        if(num ==1 ) return 1;

        return num * product(num-1);
    }
}
