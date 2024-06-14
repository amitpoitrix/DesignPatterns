package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Product.ColorProduct.Color;
import AbstractFactoryPattern.Product.ShapeProduct.Shape;

public interface AbstractFactory {
    public Shape getShape(String shapeType);
    public Color getColor(String colorType);
}
