package AbstractFactoryPattern.Implementation2;

import AbstractFactoryPattern.Implementation2.Factory.IGUIFactory;
import AbstractFactoryPattern.Implementation2.Factory.MacFactory;
import AbstractFactoryPattern.Implementation2.Factory.WindowFactory;

public class AbstractFactoryDemo {
    private static Application configureApplication() {
        Application app;
        IGUIFactory factory;

        String osname = System.getProperty("os.name").toLowerCase();

        System.out.println(osname);

        if(osname.equals("mac os x")) {
            factory = new MacFactory();
        } else {
            factory = new WindowFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.letsPaint();
    }
}
