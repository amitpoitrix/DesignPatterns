package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");

        IPrinter iPrinter = new PrinterAdapter();
        iPrinter.print();
    }
}
