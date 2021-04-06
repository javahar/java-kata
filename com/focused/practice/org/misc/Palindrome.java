package com.focused.practice.org.misc;

public class Palindrome {

    public static void main(String[] args) {
        int n = 11;
        int b = n;

        StringBuilder sb = new StringBuilder();


        while(b > 0){
            sb.append(b%10);
            b = b/10;
        }

        if(sb.toString().equals(String.valueOf(n))) System.out.println("palindrome");
        else System.out.println("not palindrome");

    }
}
