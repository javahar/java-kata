package com.focused.practice.org.merge.intervals;

import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
};

public class MergeIntervals {
      /* The most important trick here is to use iterator so you have
      * access to the next item on the list.
      *
      * The second most important trick is sort the items based on the start times
      * that way its easier to have a check only on the end time to know if the times
      * are overlapping
      * */
    public static List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() < 2)
            return intervals;
        //sort based on the start times
        Collections.sort(intervals, (a, b) -> Integer.max(a.start, b.start));

        List<Interval> mergedIntervals = new LinkedList<>();
        // iterator for the intervals for looping and getting access to the next item
        // on the list
        Iterator<Interval> intervalItr = intervals.iterator();
        int start = intervalItr.next().start;
        int end = intervalItr.next().end;
        // get the start and end times of the first item.
        while(intervalItr.hasNext()){
            Interval interval = intervalItr.next();
            if(interval.start < end) {
                end = Math.max(interval.end , end);
            }
            else {
                mergedIntervals.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }



    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}
