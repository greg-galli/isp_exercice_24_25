class MultiFunctionPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Impression en cours...");
    }

    @Override
    public void scan() {
        System.out.println("Numérisation en cours...");
    }

    @Override
    public void fax() {
        System.out.println("Envoi de fax en cours...");
    }
}