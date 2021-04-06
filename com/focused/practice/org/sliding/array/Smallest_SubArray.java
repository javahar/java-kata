package com.focused.practice.org.sliding.array;

public class Smallest_SubArray {

    /*
    *  [12 , 43 , 3 , 7 , 5 , 1 , 8 , 10]
    *
    * length of contiguous sub array that can give the value of 12
    *
    *
    * */
    public static int smallestSum(int value, int [] arr){
         int currentSum =0;
         int currentWindowIndex = 0;

         for(int windowEnd =0; windowEnd < arr.length ; windowEnd++){
             currentSum +=arr[windowEnd];

             if (currentSum == value) return windowEnd - currentWindowIndex+1;
             else if (currentSum > value) {
                 currentSum -= arr[currentWindowIndex];
                 currentWindowIndex++;
             }
         }
        return 0 ;
    }

    public static void main(String[] args) {
        int [] arr =  { 1, 34, 5, 12, 67,23,7,8,14};
        // maximum sum of a subArray
        int smallestSum = 29;

        System.out.println(smallestSum(smallestSum, arr));


    }
}
