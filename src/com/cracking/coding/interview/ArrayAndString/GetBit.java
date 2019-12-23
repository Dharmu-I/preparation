package com.cracking.coding.interview.ArrayAndString;

/**
 * @author dharmu.i on 2019-10-10
 */
public class GetBit {

    public static int getBit(int num, int i){
        return ((num << i)) ;
    }

    public static void main(String[] args) {
        System.out.println(" Bit value "+ getBit(2,2));
    }
}
