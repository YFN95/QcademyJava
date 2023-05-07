package Aufgabe4;

import java.util.Scanner;

import java.util.Scanner;

public class AppBuch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bibliothek bibliothek = new Bibliothek();
        boolean programmAktiv = true;
        Buch buch = null;
        while (programmAktiv) {

            System.out.println("Bitte wählen Sie eine Option aus:");
            System.out.println("0. Buch erzeugen");
            System.out.println("1. Buch hinzufügen");
            System.out.println("2. Buch ausleihen");
            System.out.println("3. Buch zurückgeben");
            System.out.println("4. Buch löschen");
            System.out.println("5. Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if(option ==0){
                System.out.print("Gibt den Titel deines gewünschten Buches ein: ");
                String titel = scanner.nextLine();
                System.out.print("Gib die ISBN-Nummer zu deinem gewünschten Buch ein: ");
                String isbn = scanner.nextLine();
                System.out.print("Gib den Autor zu deinem gewünschten Buch an: ");
                String autorName = scanner.nextLine();
                Autor autor = new Autor(autorName);
                 buch = new Buch(titel, isbn, autor);
                System.out.println(buch.toString() +" wurde erzeugt");
            }

            if (option ==1) {
                if(buch != null) {
                    bibliothek.buchHinzufuegen(buch);
                    System.out.println(buch.toString() + " wurde hinzugefügt.");
                }else
                    System.out.println("Es wurde noch kein Buch erzeugt, bitte erzeugen Sie erst eins");
            }
                else if(option ==2) {

                    if(buch != null){
                        bibliothek.buchAusleihen(buch);
                    } else
                        System.out.println("Es wurde noch kein Buch erzeugt, bitte erzeugen Sie erst eins");

                }
                else if (option ==3) {
                if(buch != null){
                    bibliothek.buchZurueckgeben(buch);
                }else
                    System.out.println("Es wurde noch kein Buch erzeugt, bitte erzeugen Sie erst eins");

            }
                else if(option==4) {
                    if(buch != null){
                        bibliothek.buchLoeschen(buch);
                    }else
                        System.out.println("Es wurde noch kein Buch erzeugt, bitte erzeugen Sie erst eins");

                }
                else if (option ==5) {
                programmAktiv = false;
            }

        }
        System.out.println("Programm wird beendet...");
    }
}
