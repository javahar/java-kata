package com.focused.practice.org.bitwise.xor;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatNumbers {

    /*
     In a non-empty array of integers, every number appears twice except for one,
     find that single number.

     hint : hashmap and XOR

     */
    public static void main(String[] args) {
        // TODO need to understand XOR better to use it in the right situation
       // System.out.println(findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
        System.out.println(findSingleNumber(new int[]{0,1, 2, 4, 5}));
    }

    public static int findSingleNumber(int[] arr) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = arr.length +1;
        int sum =1;
        for(int i =2; i <= n; i++){
            sum = sum ^ i;
        }

        int sum1 = arr[0];
        for(int i=1; i< n -1;i++){
            sum1 = sum1 ^ arr[i];
        }

        return sum ^ sum1;
    }
}
