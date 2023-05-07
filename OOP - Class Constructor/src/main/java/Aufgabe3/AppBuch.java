package Aufgabe3;

public class AppBuch {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Max Mustermann");
        autor1.setSynonym("M. Mustermann");
        autor1.setGage(5000.0);

        Autor autor2 = new Autor("Susanne Mustermann");
        autor2.setSynonym("S. Mustermann");
        autor2.setGage(6000.0);



        Buch buch1 = new Buch("Java für Anfänger", "978-3-1234-5678-9", autor1);
        buch1.setPreis(19.99);

        Buch buch2 = new Buch("Kochen für Männer", "978-3-5678-1234-5", autor2);
        buch2.setPreis(24.99);


        System.out.println(buch1);
        System.out.println(buch2);

    }
}
