package com.focused.practice.org.misc;

import java.util.Arrays;

public class RecursiveSum {

    public static int sum(int [] arr){
        if(arr.length == 0)
            return 0;

        return arr[0] + sum(Arrays.copyOfRange(arr, 1 , arr.length));
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,5,8,9,12,34,90};
         System.out.println(sum(arr));
         int sum =0;
         for(int num : arr){
             sum += num;
         }

        System.out.println("calculated sum " + sum );
         }
}
