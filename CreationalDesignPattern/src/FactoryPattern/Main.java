package FactoryPattern;

import FactoryPattern.Product.IShape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern");

        ShapeFactory shapeFactory = new ShapeFactory();
        IShape IShape1 = shapeFactory.getShape("circle");
        IShape1.draw();

        IShape IShape2 = shapeFactory.getShape("square");
        IShape2.draw();
    }
}
