package no.hiof.tobiasgs.eksempel02;

import no.hiof.tobiasgs.eksempel01.Student;
import no.hiof.tobiasgs.eksempel02.Kurs;

public class Main{

	public static void main(String[] args){
		Kurs mobilProgrammering = new Kurs("MobilProgrammering","ASDIJ123123",10);
		Kurs kvanteFysikk = new Kurs("KvanteFysikk", "KFY1030", 20);

		Student albertEinstein = new Student("Albert", "Einstein");

		albertEinstein.leggTillKurs(mobilProgrammering);
		albertEinstein.leggTillKurs(kvanteFysikk);

		Kurs[] albertSineKurs = albertEinstein.getOppsattKurs();

		System.out.println(albertSineKurs[1].getNavn());

		


	}
}