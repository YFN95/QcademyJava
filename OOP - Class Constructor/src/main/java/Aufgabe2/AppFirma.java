package Aufgabe2;

public class AppFirma {
    public static void main(String[] args) {
        Firma firma = new Firma("FirmaHessen", "Musterstraße 23", 4, 10);
        // hier füge ich 5 Räume hinzu, allerdings habe ich oben im Objekt als maximale anzahl der Räume zu vermieten 4 angegeben
        // deswegen bekomme ich die Ausgabe "Es können keine Räume mehr vermietet werden".
        firma.fuegeRaumHinzu(50,1);
        firma.fuegeRaumHinzu(80,2);
        firma.fuegeRaumHinzu(100,3);
        firma.fuegeRaumHinzu(120,4);
        firma.fuegeRaumHinzu(150,5);
        System.out.println(firma.toString());
        // hier buche ich den Raum 2 und mit firma.toString kann man dann sehen,dass der Raum 2 gebucht ist
        firma.raumBuchen(2);
        System.out.println(firma.toString());
        // Get Methode um die Anzahl der gebuchten Räume sich auzugeben
        System.out.println(firma.getAnzahlDerGebuchtenRaeume());
        // Hier ist die Methode sucheRaum, sie gibt  die Raumnummer zurück von einem Raum mit den eingegeben Sitzplätzen
        System.out.println(firma.sucheRaum(150));


        // die Methode gibt die Anzahl der freien Räume aus
        int freieRaeume = firma.anzahlFrei();
        System.out.println("Anzahl freier Räume: " + freieRaeume);
    }
}
