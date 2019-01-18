public class Person{
	private String fornavn;
	private String etternavn;
	private int alder;


	// contstructor
	public Person(String fornavn, String etternavn, int alder){
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.alder = alder;
	}
	// get metoder
	public String getFornavn(){
		return fornavn;
	}
	public String getEtternavn(){
		return etternavn;
	}
	public int getAlder(){
		return alder;
	}

	// Set metoder
	public void setFornavn(String nyttFornavn){
		this.fornavn = nyttFornavn;
	}
	public void setEtternavn(String nyttEtternavn){
		this.etternavn = nyttEtternavn;
	}
	public void setAlder(int nyAlder){
		this.alder = nyAlder;
	}


	public void printPersonInfo(){
		System.out.println(this.fornavn + " " + this.etternavn + " " + this.alder);
	}

}