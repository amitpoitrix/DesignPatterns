package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.AbstractFactory;
import AbstractFactoryPattern.Factory.ColorFactory;
import AbstractFactoryPattern.Factory.ShapeFactory;

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
