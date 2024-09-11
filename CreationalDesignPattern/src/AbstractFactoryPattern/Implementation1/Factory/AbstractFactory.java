package AbstractFactoryPattern.Implementation1.Factory;

import AbstractFactoryPattern.Implementation1.Product.ColorProduct.Color;
import AbstractFactoryPattern.Implementation1.Product.ShapeProduct.Shape;

public interface AbstractFactory {
    public Shape getShape(String shapeType);
    public Color getColor(String colorType);
}
