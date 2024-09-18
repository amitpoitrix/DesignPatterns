package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IPizza;

// Concrete Decorators: This class extend the PizzaDecorator and add specific toppings.
public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(IPizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0; // cost of mushroom topping
    }
}
