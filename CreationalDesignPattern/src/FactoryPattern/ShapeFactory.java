package FactoryPattern;

import FactoryPattern.Product.Circle;
import FactoryPattern.Product.Rectangle;
import FactoryPattern.Product.Shape;
import FactoryPattern.Product.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
