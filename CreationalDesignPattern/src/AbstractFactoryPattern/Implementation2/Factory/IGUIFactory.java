package AbstractFactoryPattern.Implementation2.Factory;

import AbstractFactoryPattern.Implementation2.Product.Button.IButton;
import AbstractFactoryPattern.Implementation2.Product.Checkbox.ICheckbox;

public interface IGUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
