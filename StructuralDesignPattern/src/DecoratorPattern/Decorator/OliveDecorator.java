package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IPizza;

// Concrete Decorators: This class extend the PizzaDecorator and add specific toppings.
public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(IPizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with olive";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75; // cost of olive topping
    }
}
