package Aufgabe3;

public class AppBank {
    public static void main(String[] args) {
        BankKonto bankKonto1 = new BankKonto("Mustermann", "Hans", "DE5638373947349", 1000, 500);
        System.out.println(bankKonto1.toString());
        bankKonto1.auszahlung(1400);
        bankKonto1.zeigeKontostand();
        System.out.println(bankKonto1.toString());
    }


}
