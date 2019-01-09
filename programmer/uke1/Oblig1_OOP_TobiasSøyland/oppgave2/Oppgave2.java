import java.util.Scanner;

public class Oppgave2{

    public static void main(String[] args) {
        // Oppretter og instansierer et objekt av typen Scanner
        Scanner scanner = new Scanner(System.in);

        // Printer ut til konsollen
        System.out.println("Skriv inn fornavn: ");
        // Leser input fra konsollen
        String fornavn = scanner.nextLine();

       // Printer ut til konsollen
        System.out.println("Skriv inn etternavn: ");
        // Leser input fra konsollen
        String etternavn = scanner.nextLine();

       // Printer ut til konsollen
        System.out.println("Skriv inn alder: ");
        // Leser input fra konsollen
        int alder = scanner.nextLine();


        System.out.println("Ditt fornavn er: " + fornavn + " " + etternavn + "/n" + "Din alder er: " + alder);
        
    }

}


// a) siden classe navnet er byttet maa ogsaa navnet paa filen endres til oppgave2.