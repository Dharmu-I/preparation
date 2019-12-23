package com.preparation.tricky;

import java.util.Arrays;
import java.util.List;

public class TwoDimensionalMoveCalculator {

    public static void distanceCompute(List<Integer> xCoordinates, List<Integer> yCoordinates){
        Integer distance = 0;
        int i = 0;
        while(xCoordinates.size()-1 > i){

            Integer x1=xCoordinates.get(i);
            Integer x2=xCoordinates.get(i+1);
            Integer y1=yCoordinates.get(i);
            Integer y2=yCoordinates.get(i+1);

            while(x2!=x1 || y2!=y1){
                System.out.println(" "+x1+" "+y1+" "+x2+" "+y2);
                if(x2==x1){
                    distance = distance+Math.abs((y2-y1));
                    y2=y1;
                }else if(y2 == y1){
                    distance = distance+Math.abs((x2-x1));
                    x2=x1;
                }else{
                    distance = distance+1;
                    if (x1<x2) {
                        x1 = x1 + 1;
                    }else {
                        x1 = x1 - 1;
                    }
                    if (y1 < y2) {
                        y1 = y1 + 1;
                    }else {
                        y1 = y1 - 1;
                    }
                }
            }

            i = i+1;
        }

        System.out.println("Distance : "+distance);
    }


    public static void main(String[] args) {
        List<Integer> xCoordinates = Arrays.asList(0,4, -2,-4);
        List<Integer> yCoordinates = Arrays.asList(0,1, -3,1);
        distanceCompute(xCoordinates,yCoordinates);
    }
}
