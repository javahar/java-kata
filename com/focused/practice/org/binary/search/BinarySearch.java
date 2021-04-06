package com.focused.practice.org.binary.search;

public class BinarySearch {

    public static int search(int[] arr, int key) {

        int startIndex = 0;
        int endIndex = 0;
        if(arr.length%2 ==0){
            endIndex = (arr.length)/2;
        }
        else endIndex = ((arr.length)/2) + 1;


        while(endIndex-startIndex >0){
            System.out.println((startIndex + endIndex)/2);
            if(arr[(startIndex + endIndex)/2] > key){
                endIndex = (startIndex + endIndex)/2;
            }
            else if(arr[(startIndex + endIndex)/2] < key){
                startIndex = (startIndex + endIndex)/2;
            }
            else return (startIndex + endIndex)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.search(new int[] { 4, 6, 10 }, 10));
        System.out.println(BinarySearch.search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
        System.out.println(BinarySearch.search(new int[] { 10, 6, 4 }, 10));
        System.out.println(BinarySearch.search(new int[] { 10, 6, 4 }, 4));
    }
}
