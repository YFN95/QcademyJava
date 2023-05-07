package Aufgabe2;

public class Raum {
    private int raumNummer;
    private int anzahlDerSitzplaetze;
    private boolean gebucht;

    public Raum(int raumNummer, int anzahlDerSitzplaetze) {
        this.raumNummer = raumNummer;
        this.anzahlDerSitzplaetze = anzahlDerSitzplaetze;
        this.gebucht = false;
    }

    public int getraumNummer() {
        return raumNummer;
    }

    public int getAnzahlDerSitzplaetze() {
        return anzahlDerSitzplaetze;
    }

    public boolean getGebucht() {
        return gebucht;
    }

    public void setGebucht() {
        this.gebucht = true;
    }

    @Override
    public String toString() {
        return "Raum{" +
                "raumNummer=" + raumNummer +
                ", anzahlDerSitzplaetze=" + anzahlDerSitzplaetze +
                ", gebucht=" + gebucht +
                '}';
    }
}

