package com.focused.practice.org.misc;


public class RecursiveSkipSum {

    public static int sum(int [] arr, int size){
        if (size == 0 || size == 1)
            return arr[size];
        else
            if (size%2!=0) {
                size--;
            }
            return arr[size - 1] + sum(arr, size- 1);
    }


    public static void main(String[] args) {
        int arr [] = {12, 6, 9 , 19, 21, 32,17,18};

        System.out.println(sum(arr, 5));
        // System.out.println(Arrays.copyOfRange(arr,1,arr.length).length);
         //TODO get this to work using recursion
    }
}
