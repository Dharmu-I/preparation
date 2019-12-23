package com.preparation.design.factory;

/**
 * dharmu.i on 12/03/19
 */

public class MainClass {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.drawShape(ShapeType.CIRCLE);
        circle.draw();
        Shape rectangle  = ShapeFactory.drawShape(ShapeType.RECTANGLE);
        rectangle.draw();
        Shape square = ShapeFactory.drawShape(ShapeType.SQUARE);
        square.draw();
        Shape triangle = ShapeFactory.drawShape(ShapeType.TRIANGLE);
        triangle.draw();
    }
}
