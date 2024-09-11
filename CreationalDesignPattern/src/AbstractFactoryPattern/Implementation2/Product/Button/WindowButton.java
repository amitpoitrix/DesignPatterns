package AbstractFactoryPattern.Implementation2.Product.Button;

public class WindowButton implements IButton{
    @Override
    public void paint() {
        System.out.println("This is window style button");
    }
}
