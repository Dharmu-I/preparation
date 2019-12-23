package com.preparation.LinkedList;

import static com.preparation.LinkedList.SingleLinkedList.createLinkedList;
import static com.preparation.LinkedList.SingleLinkedList.display;

public class FindNthNodeInReverseOrder {

    public static void findNthNodeReverse(Node head, Integer nthNode){

        Node temp = head;
        Node forward = head;

        int i = 1;

        while (nthNode >= i){
            temp = temp.next;
            i = i+1;
        }

        while (temp != null){
            temp = temp.next;
            forward = forward.next;
        }

        System.out.println("Nth node : "+forward.value);
    }

    public static void main(String[] args) {
        Integer[] elements = {0,1,2,3,4,5,6,7,8,9};
        Node head = new Node(elements[0]);
        createLinkedList(elements,head);
        display(head);
        findNthNodeReverse(head,5);
    }
}
