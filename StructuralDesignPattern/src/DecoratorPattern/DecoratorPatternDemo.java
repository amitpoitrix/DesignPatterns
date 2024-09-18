package DecoratorPattern;

import DecoratorPattern.Component.IPizza;
import DecoratorPattern.Component.PlainPizza;
import DecoratorPattern.Decorator.CheeseDecorator;
import DecoratorPattern.Decorator.MushroomDecorator;
import DecoratorPattern.Decorator.OliveDecorator;
import DecoratorPattern.Decorator.PepperoniDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        System.out.println("Pizza Shop using Decorator Design Pattern");

        IPizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
