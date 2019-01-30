package no.hiof.tobiasgs.tvserieOversikt;
import no.hiof.tobiasgs.tvserieOversikt.Episode;
public class Episode {
    private String tittel;
    private int sesong;
    private int episodeNummer;
    private int spilletid;

    // konstruktor med variablene tittel sesong episode nummer og spilletid.
    public Episode(String tittel, int sesong, int episodeNummer, int spilletid) {
        this.tittel = tittel;
        this.sesong = sesong;
        this.episodeNummer = episodeNummer;
        this.spilletid = spilletid;
    }
    // - spilletid.
    public Episode(String tittel, int sesong, int episodeNummer) {
        this.tittel = tittel;
        this.sesong = sesong;
        this.episodeNummer = episodeNummer;
    }


    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSesong() {
        return sesong;
    }

    public void setSesong(int sesong) {
        this.sesong = sesong;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    @Override
    public String toString() {
        return "tittel :" + tittel + " sesong: " + sesong + " episode:" + episodeNummer + " spilletid i minutter:" + spilletid;
    }
}
