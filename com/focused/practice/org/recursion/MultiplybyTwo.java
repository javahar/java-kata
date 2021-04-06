package com.focused.practice.org.recursion;

public class MultiplybyTwo {


    public static void multiply(int nums[], int size){
        if(size!=-1){
            multiply(nums, size-1);
            System.out.println(2* nums[size]);
        }
    }

    public static void main(String[] args) {
        int nums [] = {2, 5,7, 9, 12};
        multiply(nums, nums.length-1);
    }
}
