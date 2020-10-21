public class KontoOszczedzaj extends Konto {
    private double oprocentowanie;

    public KontoOszczedzaj(int numerKonta, double oprocentowanie) {
        super(numerKonta);
        this.oprocentowanie = oprocentowanie;
    }

    @Override
    public void aktualizuj() {
        stan = stan + (stan * oprocentowanie);
        System.out.println("Stan konta z odsetkami: " + stan);
    }

}
