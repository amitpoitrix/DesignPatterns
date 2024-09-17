package AdapterPattern;

// Adapter Class
public class PrinterAdapter implements IPrinter{
    LegacyPrinter legacyPrinter;

    public PrinterAdapter() {
        legacyPrinter = new LegacyPrinter();
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}
