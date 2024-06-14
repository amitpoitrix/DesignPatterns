package FactoryPattern;

import FactoryPattern.Product.Circle;
import FactoryPattern.Product.Rectangle;
import FactoryPattern.Product.Shape;
import FactoryPattern.Product.Square;

import java.util.Objects;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(Objects.equals(shapeType, "circle")) {
            return new Circle();
        } else if(Objects.equals(shapeType, "rectangle")) {
            return new Rectangle();
        } else if(Objects.equals(shapeType, "square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
