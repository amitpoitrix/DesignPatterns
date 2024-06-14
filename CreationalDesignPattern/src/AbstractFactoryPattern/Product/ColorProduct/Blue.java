package AbstractFactoryPattern.Product.ColorProduct;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("This is Blue Color");
    }
}
