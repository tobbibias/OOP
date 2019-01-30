package no.hiof.tobiasgs.figurarv;

public class Sirkel extends Figur{
    private double radius;

    public Sirkel(double radius){
         this.radius = radius;
     }

    @Override
    public double areal() {
        return Math.PI * radius * radius;
        // eller Math.PI * Math.pow(radius,2);
    }

    @Override
    public double omkrets() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Dette er en sirkel med radius " + radius;
    }

    public double beregnDiameter(){
        return radius + radius;
    }
}
