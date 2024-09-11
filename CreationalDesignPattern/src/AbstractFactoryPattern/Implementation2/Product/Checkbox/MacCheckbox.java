package AbstractFactoryPattern.Implementation2.Product.Checkbox;

public class MacCheckbox implements ICheckbox{
    @Override
    public void paint() {
        System.out.println("This is MAC Style Checkbox");
    }
}
