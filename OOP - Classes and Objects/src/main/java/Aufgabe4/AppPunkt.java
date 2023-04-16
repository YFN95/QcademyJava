package Aufgabe4;

public class AppPunkt {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(3,5);
        Punkt punkt2 = new Punkt(7,9);
        System.out.println(punkt1.abstandEinesPunktesZuEinemAnderen(punkt2));
    }
}
