package com.focused.practice.org;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float roundOff = 22/7;
        DecimalFormat decimalFormat = new DecimalFormat("##.###");

        System.out.println( decimalFormat.format(roundOff) );
    }
}
