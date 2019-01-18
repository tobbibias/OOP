package no.hiof.tobiasgs.eksempel02;

public class Kurs{


	private String navn;
	private String kode;
	private int studiePoeng;

	public Kurs(String navn, String kode, int studiePoeng){
		this.navn = navn;
		this.kode = kode;
		this.studiePoeng = studiePoeng;
	}

	public String getNavn(){
		return navn;
	}

	public String getKode(){
		return kode;
	}

	public int getStudiePoeng(){
		return studiePoeng;
	}

	public void setNavn(String navn){
		this.navn = navn;
	}

	public void setKode(String kode){
		this.kode = kode;
	}

	public void setStudiePoeng(int studiePoeng){
		this.studiePoeng = studiePoeng;
	}


	public void printKursInfo(){
		System.out.println(
				navn + " Kode:" + kode + " studie poeng:" + studiePoeng
			);
	}

}