package com.focused.practice.org.bitwise.xor;

public class FindMissingNumber {

    public static int findMissingNumber(int [] nums){
        int n = nums.length + 1;
        int x =1;
        for(int i=2; i<=n; i++){
            x = x ^ i;
        }
        int x2 = nums[0];
        for(int i = 1; i< n-1; i++)
        {
            x2 = x2 ^ nums[i];
        }
        return x ^ x2;
    }

    public static void main(String[] args) {
        int nums [] = {1,2,3,5,6};
        int result = findMissingNumber(nums);
        System.out.println(result);
    }
}
