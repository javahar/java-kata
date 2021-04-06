package com.focused.practice.org.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMisc {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(12);
        numList.add(90);
        numList.add(14);
        numList.add(8);
        numList.add(31);

        List<Integer> modifiedNumList = numList.stream().filter(e -> e!=90).collect(Collectors.toList());

        modifiedNumList.forEach(System.out::println);

    }
}
