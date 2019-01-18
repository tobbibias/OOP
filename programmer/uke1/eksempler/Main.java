public class Main{

	public static void main(String[] args){
		Student olaOlsen = new Student();

		olaOlsen.fornavn = "Ola";
		olaOlsen.etternavn = "Olsen";
		olaOlsen.alder = 21;
		olaOlsen.studentId = "12309128398";

		System.out.println(olaOlsen.fornavn + " " + olaOlsen.etternavn + ".");
	}
}