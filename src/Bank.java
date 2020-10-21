import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> kontaBankowe;

    public Bank() {
        kontaBankowe = new ArrayList<>();
    }

    public void zalozKonto(Konto konto) {
        for (Konto numerKonta : kontaBankowe) {
            if (konto.getNumerKonta() == numerKonta.getNumerKonta()) {
                System.out.println("Konto już istnieje");
                return;
            }
        }
        kontaBankowe.add(konto);
    }

    public void usunKonto(int numerkonta) {
        for (Konto konto : kontaBankowe) {
            if (konto.getNumerKonta() == numerkonta) {
                kontaBankowe.remove(konto);
                return;
            }
        }
        System.out.println("Nie ma takiego numeru konta");
    }

    public void wyswietlWszytkieKonta() {
        System.out.println("Konta w banku:");
        for (Konto konto : kontaBankowe) {
            System.out.println(konto);
        }
    }

}
