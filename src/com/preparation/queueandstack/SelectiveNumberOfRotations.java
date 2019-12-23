package com.preparation.queueandstack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SelectiveNumberOfRotations {


    private static void selectiveNumberOfRotation(Queue<Integer> values, int i) {
        System.out.println("Start : "+values.toString());
        Queue<Integer> dummyQueue = new LinkedList<>();
        Queue<Integer> dummyQueue2 = new LinkedList<>();

        while (!values.isEmpty()){
            if (values.size() == i){
                while (!values.isEmpty()){
                    dummyQueue2.add(values.remove());
                }
            }else {
                dummyQueue.add(values.remove());
            }
        }

        while (!dummyQueue.isEmpty() || !dummyQueue2.isEmpty()){
            if (dummyQueue2.isEmpty()) {
                values.add(dummyQueue.remove());
            }else {
                values.add(dummyQueue2.remove());
            }
        }

        System.out.println("End : "+values.toString());
    }

    public static void selectiveNumberOfRotationMethod2(Queue<Integer> values, int i){
        System.out.println("Start : "+values.toString());
        int size = values.size()-i;
        while (size != 0){
            values.add(values.remove());
            size = size-1;
        }
        System.out.println("End : "+values.toString());
    }

    public static void main(String[] args) {
        Queue<Integer> values = new LinkedList<>();
        values.add(1);values.add(2);values.add(3);values.add(4);values.add(5);
        values.add(6);values.add(7);values.add(8);values.add(9);

        Queue<Integer> values2 = new LinkedList<>();
        values2.add(10);values2.add(20);values2.add(30);values2.add(40);values2.add(50);
        values2.add(60);values2.add(70);values2.add(80);values2.add(90);

        selectiveNumberOfRotation(values,4);
        selectiveNumberOfRotationMethod2(values2,4);
    }

}
