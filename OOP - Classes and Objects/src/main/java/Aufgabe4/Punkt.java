package Aufgabe4;

public class Punkt {
   private  double xKoordinate;
   private  double yKoordinate;

   public Punkt(){

   }

    public Punkt(double xKoordinate, double yKoordinate) {
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
    }

    public double abstandDesPunktesZumUrsprung(){
      return  Math.sqrt(xKoordinate*xKoordinate + yKoordinate*yKoordinate);
    }
    public Punkt spiegelungAnXAchse(){
        return new Punkt(this.xKoordinate,-this.yKoordinate);
    }
    public Punkt spiegelungAnYAchse(){
        return new Punkt(-this.xKoordinate, this.yKoordinate);
    }
    public Punkt spiegelungAmUsrsprung(){
        return new Punkt(-this.xKoordinate, -this.yKoordinate);
    }
    public double abstandEinesPunktesZuEinemAnderen(Punkt andererPunkt){
        double xDiff = this.xKoordinate - andererPunkt.xKoordinate;
        double yDiff = this.yKoordinate - andererPunkt.yKoordinate;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "xKoordinate=" + xKoordinate +
                ", yKoordinate=" + yKoordinate +
                '}';
    }
}
