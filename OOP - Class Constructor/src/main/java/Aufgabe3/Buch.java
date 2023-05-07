package Aufgabe3;

public class Buch {
    String titel;
    String isbn;
    double preis;
    Autor autor;

    public Buch(String titel, String isbn, Autor autor) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;

    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", isbn='" + isbn + '\'' +
                ", preis=" + preis +
                ", autor=" + autor +
                '}';
    }
}
