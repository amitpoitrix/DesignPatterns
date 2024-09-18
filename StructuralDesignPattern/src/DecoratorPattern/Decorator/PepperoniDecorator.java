package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IPizza;

// Concrete Decorators: This class extend the PizzaDecorator and add specific toppings.
public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(IPizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0; // cost of pepperoni topping
    }
}
