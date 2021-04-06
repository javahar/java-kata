package com.focused.practice.org.recursion;

public class PrintArrayElements {

    public static void printArrElements(int [] args, int size) {
        if(size!=-1){
            printArrElements(args, size-1);
            System.out.println(args[size]);
        }
    }
    public static void main(String[] args) {
        int nums [] = {12, 4, 5, 7, 18 , 20};

        printArrElements(nums, nums.length-1);
    }
}
