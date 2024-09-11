package AbstractFactoryPattern.Implementation1.Factory;

import AbstractFactoryPattern.Implementation1.Product.ColorProduct.Color;
import AbstractFactoryPattern.Implementation1.Product.ShapeProduct.Circle;
import AbstractFactoryPattern.Implementation1.Product.ShapeProduct.Rectangle;
import AbstractFactoryPattern.Implementation1.Product.ShapeProduct.Shape;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        else if(shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
