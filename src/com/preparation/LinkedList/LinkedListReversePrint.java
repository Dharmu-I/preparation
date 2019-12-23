package com.preparation.LinkedList;

import static com.preparation.LinkedList.SingleLinkedList.createLinkedList;

public class LinkedListReversePrint {

    public static int value = 10;

    public static void reverseDisplay(Node head){
        if (head != null) {
            reverseDisplay(head.next);
            if (value == 5) {
                System.out.println("Head value " + head.value + " value : " + value);
            }
            value = value-1;
        }
    }

    public static void main(String[] args) {
        Integer[] elements = {0,1,2,3,4,5,6,7,8,9};
        Node head = new Node(elements[0]);
        createLinkedList(elements,head);
        reverseDisplay(head);
    }
}
