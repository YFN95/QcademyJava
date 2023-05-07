package Aufgabe3;

public class Autor {
    String name;
    String synonym;
    double gage;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSynonym() {
        return synonym;
    }

    public double getGage() {
        return gage;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", synonym='" + synonym + '\'' +
                ", gage=" + gage +
                '}';
    }
}
