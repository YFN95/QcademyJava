package Aufgabe2;

import java.util.Arrays;

public class Firma {
    private String name;
    private String adresse;
    private int anzahlDerRaeumeZurVermietung;
    private int maximaleAnzahlDerRaeume;
    private Raum[] raeume;
    private int anzahlDerGebuchtenRaeume;

    public Firma(String name, String adresse, int anzahlDerRaeumeZurVermietung, int maximaleAnzahlDerRaeume) {
        this.name = name;
        this.adresse = adresse;
        this.anzahlDerRaeumeZurVermietung = anzahlDerRaeumeZurVermietung;
        this.maximaleAnzahlDerRaeume = maximaleAnzahlDerRaeume;
        this.raeume = new Raum[maximaleAnzahlDerRaeume];
        this.anzahlDerGebuchtenRaeume = 0;
    }



    public void fuegeRaumHinzu(int plaetze,int raumNummer) {
        if (anzahlDerRaeumeZurVermietung == 0) {
            System.out.println("Es können keine Räume mehr vermietet werden");
            return;
        }

        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] == null) {
                Raum raum = new Raum(raumNummer, plaetze);
                raeume[i] = raum;
                anzahlDerRaeumeZurVermietung--;
                break;
            }
        }

    }


    public int sucheRaum(int plaetze) {
        for (int i = 0; i < this.raeume.length; i++) {
            if (this.raeume[i] != null && this.raeume[i].getAnzahlDerSitzplaetze() == plaetze ) {
                System.out.print("Ein Raum mit "+plaetze+ " plaetzen hat die Raumnummer: ");
                return raeume[i].getraumNummer();
            }
        }
        System.out.print("Ein Raum mit dieser Anzahl an plätzen existiert nicht, daher geben wir folgendes aus: ");
        return -1;
    }

    public int anzahlFrei() {
        int anzahlFreieRaeume = 0;
        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] != null && raeume[i].getGebucht() == false) {
                anzahlFreieRaeume++;
            }
        }
        return anzahlFreieRaeume;
    }
  public void raumBuchen(int raumNummer) {
      int index = raumNummer - 1;
      if (index >= 0 && index < raeume.length && raeume[index] != null) {

              raeume[index].setGebucht();
              anzahlDerGebuchtenRaeume++;
          } else {
              System.out.println("Der Raum ist bereits gebucht oder existiert nicht.");
          }
      }

    public int getAnzahlDerGebuchtenRaeume() {
        System.out.print("Anzahl der gebuchten Räume beträgt: ");
        return anzahlDerGebuchtenRaeume;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", anzahlDerRaeumeZurVermietung=" + anzahlDerRaeumeZurVermietung +
                ", maximaleAnzahlDerRaeume=" + maximaleAnzahlDerRaeume +
                ", raeume=" + Arrays.toString(raeume) +
                ", anzahlDerGebuchtenRaeume=" + anzahlDerGebuchtenRaeume +
                '}';
    }
}