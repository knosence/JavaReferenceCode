/*
Given a singly linked list, write a function
 to find the nth-to-last element of the list.

 eg.
 list = 1 -> 2 -> 3 -> 4 -> 5

 n = 1, output = 4
 n = 2, output = 3
 n = 3, output = 2
 etc.

 */

package com.referenceCode;

public class NthToLastLinkedListElements {

    public static Node nthToLast(Node node, int n) {
        Node curr = node;
        Node follower = node;

        for (int i = 0; i < n; i++) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }

        /*
        using .next to check if curr can move a step over
        so that we can prevent the follower pointer from
        continuing to the next node from it.
         */

        while (curr.next != null) {
            curr = curr.next;
            follower = follower.next;
        }
        return follower;
    }

    public static void main(String[] args) {

    }

    private static class Node {
        private int value;
        private Node next;
    }

}

/*
1. Create the node class with an integer called value and a
    node called next.
2. Create a for loop to get the curr pointer into position
    by moving to the nth node.
3. Create a while loop that moves the curr and follower pointers
    together until curr reaches null.
4. Return follower.
 */