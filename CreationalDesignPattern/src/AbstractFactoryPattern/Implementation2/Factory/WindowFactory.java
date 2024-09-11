package AbstractFactoryPattern.Implementation2.Factory;

import AbstractFactoryPattern.Implementation2.Product.Button.IButton;
import AbstractFactoryPattern.Implementation2.Product.Button.WindowButton;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.ICheckbox;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.WindowCheckbox;

public class WindowFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        return new WindowButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowCheckbox();
    }
}
