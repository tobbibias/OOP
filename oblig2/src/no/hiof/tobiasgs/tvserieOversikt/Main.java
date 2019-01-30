package no.hiof.tobiasgs.tvserieOversikt;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // oppgave 4 teste classene. jeg lager en ny tvserie "Punisher" Med en kort beskrivelse. saa lager jeg en episode og legger den til punisher med leggTillEpisode() metoden.
        Tvserie punisher = new Tvserie("Punisher", "Punisher er en snill-slem man som banker om slem-slem menn.", LocalDate.parse("2017-11-17"));
        Episode episode01 = new Episode("3 AM", 1, 1, 51);
        punisher.leggTilEpisode(episode01);

        System.out.println("Oppgave 4 \n" + punisher.getTittel() + " Handler om: " + punisher.getBeskrivelse() + " og ble utgitt" + punisher.getUtgivelseDato());

        //oppgave 5 override toString metoden. her har jeg overridet toString metoden til aa gi en mer strukturert og relevant informasjon om tvserie objektet og episode objektet.

        System.out.println("to string for tvserier: " + punisher.toString());
        System.out.println("to string for episoder: " + punisher.getEpisodeArray().get(0).toString());

        // Oppgave 6 forlokke som lager 5 sesonger med 20 episoder bruker en override construktor som kun tar navn , episode nummer og tittel.
                for(int i = 1; i < 6; i++){
                    Random rnd = new Random();
                    for(int j = 1; j < 21; j++){
                        // la til tilfeldig spilletid med Random.nextint()  funger  slik nextInt(max-min)+min = tilfeldig tall mellom max og min.
                        Episode  generatedEpisode = new Episode("episode:"+j,i,j,rnd.nextInt(10) + 20);
                        punisher.leggTilEpisode(generatedEpisode);

                    }
                }

        // skriver ut all info om episodene i gitt sesong i parameter.punisher.getEpisoderISesong(4);
        System.out.println("oppgave 6:");
        for (Episode episoden: punisher.getEpisoderISesong(4)){
            System.out.println(episoden.toString());
        }

        // oppgave 8
        System.out.println( " \n :::::::Oppgave 8::::::: \n \n Gjennomsnittlig spilletid:" + punisher.getGjennomSnitteligSpilletid() + ".");

        // oppgave 10
        System.out.println(" \n ::::::::::::oppgave 10 teste implemtnasjonen av oppgave 9 som var å forhindre at en episode med sesong mer en 1 hoyere en antall sesonger bli lagt till i tvsereien.::::::::");
        Episode oppgave10 = new Episode("dette bør bli feil",10,1);
        punisher.leggTilEpisode(oppgave10);


        System.out.println("tester om sesong variabelene oppdtaterer seg når sesong 6 legges til");
        Episode oppgave102 = new Episode("dette bør gå",6,1);
        System.out.println(punisher.getAntallSesonger());



    }

}
