package com.focused.practice.org.fast.slow.pointers;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class DetectCycle_GFG {

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true; // found the cycle
        }
        return false;
    }

    public static void main(String[] args) {
         Node node = new Node(2);
         node.next = new Node(3);
         node.next.next = new Node(4);
         node.next.next.next = new Node(9);
         node.next.next.next.next = new Node(3);
        // node.next.next.next.next =null;

        System.out.println("loop exists " + hasCycle(node));

    }

}
