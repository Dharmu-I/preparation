package com.preparation.pandru;

public class AccessSpecifier {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.run();
        a.pubRun();
        System.out.println(("SUNITA").substring(0,2));
    }
}

class A{
    private void run(){
        System.out.println("In A class run");
    }

    public void pubRun(){
        run();
        System.out.println("Pub run method");
    }
}

class B {
    public void  run(){
        System.out.println("In B class run");
    }
}
