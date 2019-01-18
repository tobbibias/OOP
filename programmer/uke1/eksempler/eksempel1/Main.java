public class Main{

	public static void main(String[] args){
		Student thomasEdison = new Student("Thomas","Edison","123123","123123123");
		thomasEdison.setAlder(71);
		thomasEdison.printStudentInfo();


		// ny student.
		student nikolaTesla = new Student("Nikola","Tesla");
		nikolaTesla.printStudentInfo();

	}
}