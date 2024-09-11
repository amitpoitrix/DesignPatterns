package AbstractFactoryPattern.Implementation1.Product.ColorProduct;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("This is Red Color");
    }
}
