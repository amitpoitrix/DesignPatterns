package AbstractFactoryPattern.Implementation1;

import AbstractFactoryPattern.Implementation1.Factory.AbstractFactory;
import AbstractFactoryPattern.Implementation1.Factory.ColorFactory;
import AbstractFactoryPattern.Implementation1.Factory.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if(factoryType.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }

        return null;
    }
}
