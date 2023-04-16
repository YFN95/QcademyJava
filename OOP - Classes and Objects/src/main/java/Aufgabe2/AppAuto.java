package Aufgabe2;

public class AppAuto {
    public static void main(String[]args){
        Auto auto1 = new Auto();
        Auto auto2 = new Auto( "FH2127G",80000,50,7.4,15);
        auto1.fahren(20);
        auto1.tanken(20);
        System.out.println("Auto1 Kilometertand: "+auto1.getKilometerstnd());
        System.out.println("Auto1 Tankvolumen: "+auto1.getTankVolumen());
        auto2.fahren(20);
        auto2.tanken(20);
        System.out.println("Auto1 Kilometertand: "+auto2.getKilometerstnd());
        System.out.println("Auto1 Tankvolumen: "+auto2.getTankVolumen());
    }
}
