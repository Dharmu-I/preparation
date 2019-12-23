package com.preparation.design.factory;

/**
 * dharmu.i on 12/03/19
 */

public class ShapeFactory {
    public static Shape drawShape(ShapeType shapeType){

        Shape shape = null;
        switch (shapeType){
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }

        return shape;
    }
}
