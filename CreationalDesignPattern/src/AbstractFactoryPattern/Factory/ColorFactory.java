package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Product.ColorProduct.Blue;
import AbstractFactoryPattern.Product.ColorProduct.Color;
import AbstractFactoryPattern.Product.ColorProduct.Red;
import AbstractFactoryPattern.Product.ShapeProduct.Shape;

public class ColorFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null) {
            return null;
        } else if(colorType.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if(colorType.equalsIgnoreCase("Red")) {
            return new Red();
        }

        return null;
    }
}
