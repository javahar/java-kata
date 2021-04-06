package com.focused.practice.org.fast.slow.pointers;


class LinkedListCycle {

    public static int cycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int startCounter = 0;
        int endCounter = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(startCounter > 0)
                endCounter++;
            if (slow == fast) {
                if (endCounter > 0) break;
                    startCounter++;
                // found the cycle
            }
        }
        return endCounter;
    }
}

public class Length_of_cycle_LL {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        System.out.println("LinkedList has cycle: " + LinkedListCycle.cycleLength(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.cycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.cycleLength(head));
    }
}
