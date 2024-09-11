package FactoryPattern.Product;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
