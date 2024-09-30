public class Main {
    public static void main(String[] args) {
        // Imprimante basique
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        basicPrinter.scan();
        basicPrinter.fax();

        // Imprimante multifonction
        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print();
        multiPrinter.scan();
        multiPrinter.fax();
    }
}