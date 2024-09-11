package AbstractFactoryPattern.Implementation2.Product.Button;

public class MacButton implements IButton{

    @Override
    public void paint() {
        System.out.println("This is MAC Style button");
    }
}
