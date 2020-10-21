public abstract class Konto {
    protected double stan;
    private int numerKonta;

    public Konto(int numerKonta) {
        stan = 0.0;
        this.numerKonta = numerKonta;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            stan = stan + kwota;
        } else {
            System.out.println("Nie można wpłacić kwoty mniejszej od 0");
        }
    }

    public void wyplac(double kwota) {
        if (kwota > 0) {
            stan = stan - kwota;
        } else {
            System.out.println("Nie można wypłacić pieniędzy");
        }
    }

    public double podajStanKonta() {
        return stan;

    }

    public int podajNumerKonta() {
        return numerKonta;
    }

    public abstract void aktualizuj();

    @Override
    public String toString() {
        return "Numer konta: " + numerKonta + ", stan konta " + stan + "zl";
    }

    public double getStan() {
        return stan;
    }

    public int getNumerKonta() {
        return numerKonta;
    }
}
