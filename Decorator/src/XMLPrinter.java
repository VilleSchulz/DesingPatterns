public class XMLPrinter extends PrinterDecorator {


    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        super.print("<text>" + text + "</text>");
    }
}
