package no.hiof.tobiasgs.eksempel01;

import no.hiof.tobiasgs.eksempel02.Kurs;



public class Student{

	private String fornavn;
	private String etternavn;
	private int alder;
	private String studentId, fodselsnummer;
	private Kurs oppsattKurs;

	// her kommer constructor (konstruktøren)

	public Student(String fornavn, String etternavn,int alder, String studentId, String fodselsnummer){
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.alder = alder;
		this.studentId = studentId;
		this.fodselsnummer = fodselsnummer;
	}
	// overloadet konstruktør som kunn tar fornavn og etternavn.
	public Student(String fornavn, String etternavn){
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}

	public Student(){	
	}
	//get metoder//
	public Kurs getOppsattkurs(){
		return oppsattKurs;
	}
	
	public String getFornavn(){
		return fornavn;
	}
	public String getEtternavn(){
		return etternavn;
	}
	public int getAlder(){
		return alder;
	}
	public String getStudentId(){
		return studentId;
	}
	public String getFodselsnummer(){
		return fodselsnummer;
	}


	
	//Sett Medtodene.//

	public void setFornavn(String fornavn){
		this.fornavn = fornavn;
	}
	public void setEtternavn(String etternavn){
		this.etternavn = etternavn;
	}
	public void setAlder(int alder){
		this.alder = alder;
	}
	public void setStudentId(String studentId){
		/* 
			her bruker vi this. for aa ungaa kresj med parameter variabelen og 
			classe variabelen studentID. this.studentID refererer til klasse variabelen 
			mens bare studentID refereer til parameter variabelen.
		*/
		this.studentId = studentId;
	}
	public void setOppsattKurs(Kurs oppsattKurs){
		this.oppsattKurs = oppsattKurs;
	}

	public void printStudentInfo(){
		System.out.println(fornavn + " " + etternavn + "."+ " " + alder + " " + studentId);
	}
}


