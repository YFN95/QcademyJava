package Aufgabe5;

public class AppRadio {
    public static void main(String[] args) {
        Radio radio1 = new Radio( true,13,80);
        Radio radio2 = new Radio();
        System.out.println(radio1.toString());
        radio1.leiser(9);
        System.out.println(radio1.toString());
       radio1.lauter(20);
        System.out.println(radio1.toString());
        radio1.aus();
        radio1.leiser(4);
        System.out.println(radio1.toString());
    }
}
