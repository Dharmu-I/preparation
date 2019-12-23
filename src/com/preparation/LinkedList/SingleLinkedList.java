package com.preparation.LinkedList;

import java.util.List;

class Node{

    Node(int value){
        this.value = value;
    }

    int value;

    Node next;
}

public class SingleLinkedList {

    public static Node addElementFirst(Node head,int value){
        Node node = new Node(value);
        node.next = head;
        return node;
    }

    public static void createLinkedList(Integer[] list, Node head){
        int i = 1;
        while (i < list.length){
            head.next = new Node(list[i]);
            head = head.next;
            i = i + 1;
        }
    }

    public static void display(Node head){
        while (head != null){
            System.out.println(head.value+"\t");
            head = head.next;
        }
    }

    public static void addElementEnd(int value, Node head){
        while (head != null && head.next != null){
            head = head.next;
        }

        head.next = new Node(value);
    }

    public static void addElementInMiddle(int value, Node head, int search_Value){
        while (head.value != search_Value){
            head = head.next;
        }
       Node node = new Node(value);
        node.next = head.next;
        head.next = node;
    }

    public static void main(String[] args) {
        Integer[] linkedListValue = {1,2,3,4,5,6};
        Node head = new Node(linkedListValue[0]);
        createLinkedList(linkedListValue,head);
        display(head);
        System.out.println();
        head = addElementFirst(head,0);
        display(head);
        System.out.println();
        addElementEnd(8,head);
        display(head);
        System.out.println();
        addElementInMiddle(7,head,6);
        display(head);
    }
}
