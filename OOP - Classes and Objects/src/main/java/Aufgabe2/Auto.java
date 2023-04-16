package Aufgabe2;

public class Auto {
    private String kfzKennzeichen;
   private  double kilometerstnd;
   private  double tankVolumen;
    private double kraftstoffVerbruch;
   private  double kraftstoffMenge;

    public Auto(){

    }

    public Auto(String kfzKennzeichen, double kilometerstnd, double tankVolumen, double kraftstoffVerbruch, double kraftstoffMenge) {
        this.kfzKennzeichen = kfzKennzeichen;
        this.kilometerstnd = kilometerstnd;
        this.tankVolumen = tankVolumen;
        this.kraftstoffVerbruch = kraftstoffVerbruch;
        this.kraftstoffMenge = kraftstoffMenge;
    }

    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }

    public double getKilometerstnd() {
        return kilometerstnd;
    }

    public double getTankVolumen() {
        return tankVolumen;
    }
    public void tanken(int menge){
        this.kraftstoffMenge+=menge;
    }
    public void fahren(int strecke){
        this.kilometerstnd+=strecke;
    }
}
