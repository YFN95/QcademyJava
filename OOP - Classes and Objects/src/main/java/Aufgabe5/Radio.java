package Aufgabe5;

public class Radio {
    private boolean istAn;
   private  int lautstaerke;
   private  double frequenz;

    public Radio() {

    }

    public Radio(boolean istAn, int lautstaerke, double frequenz) {
        this.istAn = istAn;
        if (lautstaerke < 0) {
            this.lautstaerke = 0;
            System.out.println("Die Lautstärke "+lautstaerke+" ist zu niedrig, daher verwenden wir die minimale Lautstärkre von 0");
        } else if (lautstaerke > 10) {
            this.lautstaerke = 10;
            System.out.println("Die Lautstärke "+lautstaerke+" ist zu hoch, daher verwenden wir die maximale Lautstärkre von 10");
        } else {
            this.lautstaerke = lautstaerke;
        }
        this.frequenz = frequenz;
        waehleSender(frequenz);
        //Ist
        //die gewählte Frequenz außerhalb der erlaubten Frequenzbereichs, so soll die
        //Frequenz 99.9 gewählt werden
    }

    public void lauter(int wert) {
        if (this.istAn) {
            this.lautstaerke += wert;
            if (this.lautstaerke > 10) {
                this.lautstaerke = 10;
            }
        }else {
            System.out.println("Das Radio ist ausgeschaltet, daher kannst du es nicht lauter stellen");
        }
    }

    public void leiser(int wert) {
        if (this.istAn) {
            this.lautstaerke -= wert;
            if (this.lautstaerke < 0) {
                this.lautstaerke = 0;
            }
        }else{
            System.out.println("Das Radio ist ausgeschaltet, daher kannst du es nicht leister stellen");
        }
    }

    public void an() {
        this.istAn = true;
        System.out.println("Das radio ist nun angeschaltet");
    }

    public void aus() {
        this.istAn = false;
        System.out.println("das radio ist nun ausgeschaltet");
    }

    @Override
    public String toString() {
        return "Radio an: "+"Freq: " + frequenz + ", " + "Laut= " + lautstaerke;
    }
    public double waehleSender(double frequenz){
        if(frequenz >= 85.0 && frequenz <= 110.0){
            return this.frequenz = frequenz;
        }else{
            return this.frequenz= 99.9;
        }

    }
}
