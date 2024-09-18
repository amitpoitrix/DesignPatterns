package DecoratorPattern.Component;

// Concrete Component: This class implements the Pizza interface and provides the basic implementation for a plain pizza.
public class PlainPizza implements IPizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double cost() {
        return 8.0; // Pizza base price
    }
}
