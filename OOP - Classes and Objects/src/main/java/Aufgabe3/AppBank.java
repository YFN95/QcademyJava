package Aufgabe3;

public class AppBank {
    public static void main(String[] args) {
        BankKonto bankKonto1 = new BankKonto("Mustermann", "Hans", "DE5638373947349", 25750.65, 6000);
        System.out.println(bankKonto1.toString());
        bankKonto1.auszahlung(2540);
        bankKonto1.zeigeKontostand();
        System.out.println(bankKonto1.toString());
    }


}
