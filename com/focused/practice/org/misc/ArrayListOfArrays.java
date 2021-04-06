package com.focused.practice.org.misc;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfArrays {

    public static void main(String[] args) {
//        List<List<Integer>> sampleNumSet = new ArrayList<>();
//
//        List<Integer> arrList1 = new ArrayList<>();
//        arrList1.add(12);
//        List<Integer> arrList2= new ArrayList<>();
//        arrList2.add(1);
//        arrList2.add(14);
//
//        sampleNumSet.add(arrList1);
//        sampleNumSet.add(arrList2);
//
//        List<Integer> set = new ArrayList<>(sampleNumSet.get(0));
//        set.add(3);
//
//        for(Integer num : set){
//            System.out.println(num);
//        }

        ArrayList<Integer> sampleNumList = new ArrayList<>();
        sampleNumList.add(12);
        sampleNumList.add(2);
        sampleNumList.add(3);
        sampleNumList.add(6);
        sampleNumList.add(90);
        sampleNumList.add(22);

        sampleNumList.subList(2,4);
    }
}
