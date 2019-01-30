package no.hiof.tobiasgs.flyoversikt;

public class Transportfly  extends Fly{
    public double maksLast;
    public double bruktLast;


    public Transportfly(String modell, int seter, double maksLast){
        super(modell,seter);
        this.maksLast = maksLast;
    }
    public Transportfly(double maksLast) {
        this.maksLast = maksLast;
    }


    public void leggTilPakke(double hoyde, double bredde, double dybde){
        double storrelse = hoyde * bredde * dybde;

        if((bruktLast + storrelse) <= maksLast){
            bruktLast += storrelse;
        }
        else{
            System.out.println("lager er fullt");
        }
    }

    public double getMaksLast() {
        return maksLast;
    }

    public void setMaksLast(double maksLast) {
        this.maksLast = maksLast;
    }

    public double getBruktLast() {
        return bruktLast;
    }

    public void setBruktLast(double bruktLast) {
        this.bruktLast = bruktLast;
    }

    public String toString(){
        return this.getModell() + " Er et Transportfly og har:" + this.getPassasjerer() + " passasjerer og har brukt: " + this.getBruktLast() + " av " + this.getMaksLast();
    }
}
