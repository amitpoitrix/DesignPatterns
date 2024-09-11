package AbstractFactoryPattern.Implementation2;

import AbstractFactoryPattern.Implementation2.Factory.IGUIFactory;
import AbstractFactoryPattern.Implementation2.Product.Button.IButton;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.ICheckbox;

public class Application {
    private final IButton iButton;
    private final ICheckbox iCheckbox;

    public Application(IGUIFactory factory) {
        iButton = factory.createButton();
        iCheckbox = factory.createCheckbox();
    }

    public void letsPaint() {
        iButton.paint();
        iCheckbox.paint();
    }
}
