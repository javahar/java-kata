package com.focused.practice.org.sliding.array;

/*Sliding window helps eliminate nested loops effectively enhancing the performance
* of the program. The main point to remember and understand is to run the loop only once
*
* Just like in binary search we use 2 pointers to traverse the array, here also we are using
* 2 pointers 1) that loops 2)that slides the window.
*
* sliding the window means subtracting the 1st element and adding the next element.
*
*  */

public class Maximum_Sum_Of_SubArray {

    public static int maximumSum( int size , int [] arr){
        int maxSum =0;
        int currentSum = 0;
        int currentWindow = 0;

        for(int window=0; window< arr.length; window ++){
               currentSum += arr[window];

               if(window > size-1 ){
                   currentSum -= arr[currentWindow];
                   if(currentSum > maxSum) maxSum = currentSum;
                   currentWindow++;
               }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int [] arr =  { 1, 34, 5, 12, 67,23,7,8,14};
        // maximum sum of a subArray
        int size = 3;

        System.out.println(Maximum_Sum_Of_SubArray.maximumSum(size, arr));

    }
}
