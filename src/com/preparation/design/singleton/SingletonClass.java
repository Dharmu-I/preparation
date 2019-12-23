package com.preparation.design.singleton;

/**
 * dharmu.i on 13/03/19
 */

public class SingletonClass {
    private static SingletonClass singletonClass = null;

    private SingletonClass(){

    }

    public static synchronized SingletonClass getSingletonClassInstance(){
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }

    public void display(){
        System.out.println("Single class content display");
    }
}
