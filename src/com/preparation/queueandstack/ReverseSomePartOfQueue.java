package com.preparation.queueandstack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSomePartOfQueue {


    private static void reverseSomeSetOfNumbers(Queue<Integer> values, int i) {
        System.out.println("Start : "+values.toString());
        Queue<Integer> leftOutNumbers = new LinkedList<>();
        Stack<Integer> integerStack = new Stack<>();
        while (!values.isEmpty()){
            if (i != 0){
                integerStack.push(values.remove());
                i = i-1;
            }else {
                leftOutNumbers.add(values.remove());
            }
        }

        while (!leftOutNumbers.isEmpty() || !integerStack.empty()){
            while (!leftOutNumbers.isEmpty() && integerStack.isEmpty()){
                System.out.println(leftOutNumbers.peek());
                values.add(leftOutNumbers.remove());
            }
            while (!integerStack.isEmpty()){
                values.add(integerStack.pop());
            }
        }

        System.out.println("End : "+values.toString());
    }


    public static void main(String[] args) {
        Queue<Integer> values = new LinkedList<>();
        values.add(10);values.add(20);values.add(30);values.add(40);values.add(50);
        values.add(60);values.add(70);values.add(80);values.add(90);values.add(100);
        reverseSomeSetOfNumbers(values,4);
    }

}
