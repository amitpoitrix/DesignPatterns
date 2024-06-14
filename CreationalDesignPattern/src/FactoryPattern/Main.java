package FactoryPattern;

import FactoryPattern.Product.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();
    }
}
