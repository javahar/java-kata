package com.focused.practice.org.recursion;

public class FindMaxNumber {

    public static int findMax(int [] nums, int size){

        if(size == 2)
            return Math.max(nums[0], nums[1]);

       return Math.max(nums[size],findMax(nums, size-1));
    }

    public static void main(String[] args) {
        int nums [] = {12 ,4, 7, 10 , 571, 90, 87, 120, 23, 533};
        System.out.println(findMax(nums, nums.length-1));
    }
}
