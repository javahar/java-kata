package com.focused.practice.org.two.pointers;

public class Pair_With_Target_Sum {
     /*
     * Given an array of sorted numbers and a target sum,
     * find a pair in the array whose sum is equal to the given target.
     *
     * [1 , 4, 6, 8, 9 , 10 , 12 , 14, 18]
     *  |                               |
     * step1 : sum is greater --- so move the right pointer
     * [1 , 4, 6, 8, 9 , 10 , 12 , 14, 18]
     *  |                           |
     * still greater
     * [1 , 4, 6, 8, 9 , 10 , 12 , 14, 18]
     *  |                     |
     *
     * less move the right pointer
     * [1 , 4, 6, 8, 9 , 10 , 12 , 14, 18]
     *      |                  |
     * more
     *
     * less move the right pointer
     * [1 , 4, 6, 8, 9 , 10 , 12 , 14, 18]
     *      |             |
     *
     * equal  -- return
     * targetSum = 14
     * */

   public static void findTheRightPair(int targetSum, int [] arr){
       int leftIndex  = 0;
       int rightIndex = arr.length-1;

       while (leftIndex < rightIndex){
           if(arr[leftIndex] + arr[rightIndex] > targetSum){
               rightIndex--;
           }
           else if( arr[leftIndex] + arr[rightIndex] < targetSum){
               leftIndex++;
           }
           else{
               System.out.println("the pair are " +  arr[leftIndex] + " " + arr[rightIndex]);
               break;
           }
       }
   }

    public static void main(String[] args) {
       int [] arr = { 1 , 3, 4, 5, 7, 10 , 13 , 15, 18};

       findTheRightPair(14, arr);

    }
}
