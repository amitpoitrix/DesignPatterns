package AbstractFactoryPattern.Implementation1.Product.ShapeProduct;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("This is the Shape of Circle");
    }
}
