package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IPizza;

// Abstract Decorator: This class implements the Pizza interface and holds a reference to a Pizza object. It delegates operations to the wrapped pizza object.
public abstract class PizzaDecorator implements IPizza {
    protected IPizza decoratedPizza;

    public PizzaDecorator(IPizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}
