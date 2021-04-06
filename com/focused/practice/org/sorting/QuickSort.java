package com.focused.practice.org.sorting;

/*
* Pick a pivot element
* partition the array such that all the elements greater than pivot
* to one array and elements less than the pivot to another array
*
* keep calling the quick sort on both the arrays and swap the last
* 2 elements.
* */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 3) {
            Collections.sort(list);
            return list;
        }else {
            // pick pivot element
            Integer pivot = list.get(2);

            // partitioning
            List<Integer> more = list.stream().filter(el -> (el > pivot && el!=pivot) )
                    .collect(Collectors.toList());
            List<Integer> less = list.stream().filter(el -> (el <= pivot && el!=pivot))
                    .collect(Collectors.toList());

            // call quicksort recursively and merge the result with pivot element.
            return Stream.of(
                    quicksort(less).stream(),Stream.of(pivot), quicksort(more).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }


        public static void main(String[] args) {
            System.out.println(quicksort(Arrays.asList(10, 8, 90, 31, 21,42,53, 3)));
        }
}
