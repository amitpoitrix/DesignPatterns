package FactoryPattern.Product;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("This is a Square");
    }
}
