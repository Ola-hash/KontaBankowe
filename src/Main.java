public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Konto konto = new KontoOszczedzaj(1234, 2.0);
        Konto konto1 = new KontoOszczedzaj(124, 3.00);
        Konto konto2 = new KontoOszczedzaj(125, 3.00);
        Konto konto3 = new KontoOszczedzaj(125, 3.00);
        konto.wplac(2500);
        konto.wyplac(1000);
        konto1.wplac(1000.0);
        konto3.wplac(100.0);
        bank.zalozKonto(konto);
        bank.zalozKonto(konto1);
        bank.zalozKonto(konto2);
        bank.zalozKonto(konto3);
        bank.wyswietlWszytkieKonta();

    }
}

