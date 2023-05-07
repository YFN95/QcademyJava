package Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    List<Buch> buchListe;

    public Bibliothek(){
        buchListe = new ArrayList<Buch>();
    }
    public void buchHinzufuegen(Buch buch){
        buchListe.add(buch);
    }
    public void buchAusleihen(Buch buch){
        if (buchListe.contains(buch)){
            buchListe.remove(buch);
            System.out.println("Das Buch: "+buch.titel +" wurde nun erfolgreich ausgeliehen");
        } else {
            System.out.println("Das Buch gibt es nicht in dieser Bibliothek");
        }

    }
    public void buchZurueckgeben(Buch buch){
        buchListe.add(buch);
        System.out.println("Sie haben das Buch: "+buch.titel +" erfolgreich zurückgegeben");
    }
    public void buchLoeschen(Buch buch){
        buchListe.remove(buch);
        System.out.println("Das Buch: "+buch.titel +" wurde erfolgreich gelöscht aus der Bibliothek");
    }
}
