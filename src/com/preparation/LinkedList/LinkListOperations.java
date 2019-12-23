package com.preparation.LinkedList;

import static com.preparation.LinkedList.SingleLinkedList.createLinkedList;
import static com.preparation.LinkedList.SingleLinkedList.display;

public class LinkListOperations {

    public static void evenOrOddLength(Node head){

        boolean flag = false;

        while (head != null){
            if (head.next == null){
                flag = true;
            }
            if (head.next != null) {
                head = head.next.next;
            }
        }

        if (flag){
            System.out.println("Odd linked list");
        }else {
            System.out.println("Even linked list");
        }

    }

    public static void createLoop(Node head,Integer[] listValues){

        int i =1;
        Node loopStart=null;

        while (i < listValues.length){
            Node node = new Node(listValues[i]);
            if (i == 6){
                loopStart = node;
            }
            head.next = node;
            head = head.next;
            i = i +1;
        }

        head.next = loopStart;

    }

    public static void findLoopExist(Node head){

        boolean loop = false;
        Node even = head.next;
        Node odd = head.next.next;

        while (even != null && odd != null){
            if (even == odd){
                loop = true;
                break;
            }
            even = even.next;
            odd = odd.next.next;
        }

        if (loop){
            System.out.println("Loop exist");
        }else {
            System.out.println("No loop");
        }

    }

    public static void startNodeOfTheLoop(Node head){

        Node even = head.next;
        Node odd = head.next.next;

        while (even != null && odd != null){

            if (even == odd){
                break;
            }
            even = even.next;
            odd = odd.next.next;
        }



        while (even != null && head != null){

            if (head == even){
                System.out.println("Loop start values : "+head.value);
                break;
            }

            even = even.next;
            head = head.next;

        }

    }

    public static void main(String[] args) {
        Integer[] listValues = {0,1,2,3,4,5,6,7,8,9};
        Node head = new Node(listValues[0]);
        createLinkedList(listValues,head);
        display(head);
        evenOrOddLength(head);
        createLoop(head,listValues);
        findLoopExist(head);
        startNodeOfTheLoop(head);
    }
}
