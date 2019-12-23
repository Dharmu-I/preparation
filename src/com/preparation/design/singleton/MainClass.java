package com.preparation.design.singleton;

/**
 * dharmu.i on 13/03/19
 */

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClassInstance();
        singletonClass.display();
    }
}
