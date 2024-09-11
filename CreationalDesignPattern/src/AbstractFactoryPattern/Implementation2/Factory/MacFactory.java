package AbstractFactoryPattern.Implementation2.Factory;

import AbstractFactoryPattern.Implementation2.Product.Button.IButton;
import AbstractFactoryPattern.Implementation2.Product.Button.MacButton;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.ICheckbox;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.MacCheckbox;

public class MacFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
