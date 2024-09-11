package AbstractFactoryPattern.Implementation2.Product.Checkbox;

public class WindowCheckbox implements ICheckbox{
    @Override
    public void paint() {
        System.out.println("This is Window Style Checkbox");
    }
}
