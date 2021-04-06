package com.focused.practice.org.sliding.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubArray_with_givenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        List<Integer> subArrayList = new ArrayList<>();

        int currentSum =0;
        int currentWindowIndex = 0;
        int value = s;

        for(int windowEnd =0; windowEnd < n ; windowEnd++){
            currentSum +=arr[windowEnd];
            subArrayList.add(arr[windowEnd]);

            if (currentSum == value) {
                return (ArrayList<Integer>)subArrayList.subList(windowEnd , currentWindowIndex+1);
            }
            else if (currentSum > value) {
                currentSum -= arr[currentWindowIndex];
                currentWindowIndex++;
                if (currentSum == value) {
                    return convertToArrayList(subArrayList.subList(currentWindowIndex ,windowEnd));
                }
            }
            subArrayList.add(arr[windowEnd]);

        }


        return new ArrayList<>();

    }

    public static ArrayList<Integer> convertToArrayList(List<Integer> subList ){
        return (ArrayList<Integer>)subList.stream().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,7,5};
        List<Integer> result = subarraySum(nums, 5, 12);

        result.forEach(System.out:: println);
    }

}
