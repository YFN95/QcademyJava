package Aufgabe3;

public class BankKonto {
    private String name;
    private String vorname;
   private  String kontoNummer;
    private double kontoStand;
    private double limit;

    public BankKonto(){

    }

    public BankKonto(String name, String vorname, String kontoNummer, double kontoStand, double limit) {
        this.name = name;
        this.vorname = vorname;
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Bankkonto{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", kontoNummer='" + kontoNummer + '\'' +
                ", kontoStand=" + kontoStand +
                ", limit=" + limit +
                '}';
    }
    public void einzahlung(double summe){

        this.kontoStand += summe;
        System.out.println("Du hast eine Einzahlung von "+summe+ " getätigt");
    }
    public void auszahlung(double summe){
        if(this.kontoStand -summe >= -this.limit){
            this.kontoStand -= summe;
            System.out.println("Du hast eine Auszahlung von "+summe+ " getätigt");
        } else{
            System.out.println("Sie haben das Limit fürs Konto überzogen");
            this.kontoStand -=summe;
        }

    }
    public void zeigeKontostand(){
        System.out.println("Dein aktueller Kontostand lautet: "+this.kontoStand);
    }
}
