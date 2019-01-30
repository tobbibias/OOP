package no.hiof.tobiasgs.tvserieOversikt;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tvserie {
    private String tittel, beskrivelse;
    private LocalDate utgivelseDato;
    private ArrayList<Episode> episodeArray = new ArrayList<Episode>();
    // oppgave 7 gjennomsnittelig spilletid.
    private float gjennomsnitteligSpilletid;
    private int antallSesonger = 1;

    // construktor , en tom og en med tittel , beskrivelse og utgivelsDato.
    public Tvserie() {
    }

    public Tvserie(String tittel, String beskrivelse, LocalDate utgivelseDato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelseDato = utgivelseDato;
    }
    // get/set metoder
    public String getTittel() {
        return tittel;
    }

    public ArrayList<Episode> getEpisodeArray() {
        return episodeArray;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getUtgivelseDato() {
        return utgivelseDato;
    }

    public double getGjennomSnitteligSpilletid() {
        return gjennomsnitteligSpilletid;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }

    @Override
    public String toString(){
        return "Serien: "+tittel + " Handler om: " + beskrivelse + " Og ble utgitt: " + utgivelseDato + " Antall sesonger:"+antallSesonger + " og har en gjennomsnittlig spilletid på:"+gjennomsnitteligSpilletid;
    }

    // metode som legger til en ny episode i tvserie. bruker .add() for arraylist.
    public void leggTilEpisode(Episode nyEpisode) {
       // en lokke for aa se hva som er siste sesong i tvserien. (oppgave )
        for(int i = 0; i < episodeArray.size(); i++){
            if(antallSesonger <= episodeArray.get(i).getSesong() ){
                antallSesonger++;
            }
        }

        if(nyEpisode.getSesong() <= antallSesonger) {
            episodeArray.add(nyEpisode);
            oppdaterGjennomSnittligSpilletid();
        }else{
            System.out.println("Denne sesongen eksisterer ikke");
        }
    }

    // metode for aa printe ut tostring for alle episode i gitt sesong i parameter.
    public ArrayList<Episode> getEpisoderISesong(int sesong){
        ArrayList<Episode> sesongArray = new ArrayList<Episode>();

        for (Episode episoden: episodeArray){
            if(episoden.getSesong() == sesong){
                sesongArray.add(episoden);
            }
        }

        return sesongArray;
    }

    // oppgave7 en metode som finner spilletiden i alle episodene i en serie og deler det paa antall episodeer for aa faa gjennomsnittlig spilletid.
    private void oppdaterGjennomSnittligSpilletid(){
        int tid = 0;

        for(Episode episoden : episodeArray){
            tid += episoden.getSpilletid();
        }
        gjennomsnitteligSpilletid = tid / episodeArray.size();
    }
}
