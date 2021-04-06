package com.focused.practice.org.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        String arr = "dsabef";

        char [] charArr = arr.toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<charArr.length; i++){
            sb.append(charArr[i]);
        }
        System.out.println(sb.toString());
    }
}
