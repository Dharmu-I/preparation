package com.preparation.others;

/**
 * @author dharmu.i on 2019-07-30
 * this class does a some function which is related to Sunita
 */
public class Sunita {

    private int a = 2;
    private int b = 3;
    private static int c = 4;
    private static int d = 6;

    private void nonStaticAddNumber(){
        System.out.println("Sum of numbers : "+(a+b));
    }

    private int staticAddNumber(){
        System.out.println("Sum of static numbers "+(c+d));
        return 0;
    }

    public static void main(String args[]){
        Sunita obj1 = new Sunita();
        obj1.nonStaticAddNumber();
        obj1.staticAddNumber();
        System.out.println("End");
    }
}
