package no.hiof.tobiasgs.flyoversikt;

public class Fly {
    private String modell;
    private int seter;
    private int passasjerer;


    public Fly(){
    }

    public Fly(String modell){
        this.modell = modell;
        seter = 150;
        passasjerer = 0;
    }



    public Fly(String modell, int seter){
        this.modell = modell;
        this.seter = seter;
        passasjerer = 0;
    }

    public void leggTilEnPassasjer(){
        if(passasjerer < seter){
            passasjerer++;
        }
        else{
            System.out.println("Det er ikke mer plass på flyet.");
        }
    }

    public String getModell(){
        return modell;
    }

    public int getSeter() {
        return seter;
    }

    public int getPassasjerer() {
        return passasjerer;
    }

    @Override
    public String toString(){
        return modell + " har antall seter: " + seter;
    }
}
