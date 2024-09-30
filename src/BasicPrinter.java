class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Impression en cours...");
    }

    @Override
    public void scan() {
        // Problème : cette imprimante ne peut pas scanner
        throw new UnsupportedOperationException("Cette imprimante ne peut pas numériser.");
    }

    @Override
    public void fax() {
        // Problème : cette imprimante ne peut pas envoyer de fax
        throw new UnsupportedOperationException("Cette imprimante ne peut pas envoyer de fax.");
    }
}