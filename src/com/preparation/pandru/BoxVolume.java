package com.preparation.pandru;
class Box{
 int length, width, height;
    Box(){
        length=width=height=2;
        System.out.println("default constructor");
    }

    Box(int n){
        length=width=height=n;
        System.out.println("constructor with one argument");
    }

    Box(int l, int w, int h){
        length=l;
        width=w;
        height=h;
        System.out.println("constructor with three argument");
    }

    int getvolume()
    {
        return length*width*height;
    }

}

class BoxVolume{

    public static void main(String args[])
    {
       Box b1 = new Box();
       System.out.println(b1.getvolume());
       Box b2 = new Box(3);
       System.out.println(b2.getvolume());
       Box b3 = new Box(4,6,7);
       System.out.println(b3.getvolume());
    }

}

