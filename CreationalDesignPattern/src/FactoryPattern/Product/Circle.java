package FactoryPattern.Product;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
