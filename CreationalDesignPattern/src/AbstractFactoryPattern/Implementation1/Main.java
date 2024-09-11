package AbstractFactoryPattern.Implementation1;

import AbstractFactoryPattern.Implementation1.Factory.AbstractFactory;
import AbstractFactoryPattern.Implementation1.Product.ColorProduct.Color;
import AbstractFactoryPattern.Implementation1.Product.ShapeProduct.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Design Pattern");

        AbstractFactory factory = new FactoryProducer().getFactory("color");
        Color color = factory.getColor("red");
        color.fill();

        AbstractFactory factory1 = new FactoryProducer().getFactory("shape");
        Shape shape = factory1.getShape("circle");
        shape.draw();
    }
}
