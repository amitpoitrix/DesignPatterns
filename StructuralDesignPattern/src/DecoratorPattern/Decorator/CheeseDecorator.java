package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IPizza;

// Concrete Decorators: This class extend the PizzaDecorator and add specific toppings.
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(IPizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5; // cost of cheese topping
    }
}
