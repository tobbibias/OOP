import java.util.Scanner;

public class Oppgave {

    public static void main(String[] args) {
        // Oppretter og instansierer et objekt av typen Scanner
        Scanner scanner = new Scanner(System.in);

        // Printer ut til konsollen
        System.out.println("Skriv inn fornavn: ");
        // Leser input fra konsollen
        String fornavn = scanner.nextLine();

        System.out.println("Ditt fornavn er: " + fornavn);
    }

}
