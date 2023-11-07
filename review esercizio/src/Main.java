
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di 4 studenti e 2 professori usando i diversi costruttori
        Studente studente1 = new Studente("ID1", "Marco", "Rossi");
        Studente studente2 = new Studente("ID2", "Giulia", "Bianchi");
        Studente studente3 = new Studente("ID3", "Luca", "Verdi");
        Studente studente4 = new Studente("ID4", "Anna", "Gialli");

        Professore professore1 = new Professore("PID1", "Prof", "Insegnante", "Matematica");
        Professore professore2 = new Professore("PID2", "Prof", "Docente");

        // Test del metodo assegnaVoto() con parametri a scelta
        professore1.assegnaVoto(studente1, 25);
        professore1.assegnaVoto(studente2, 18);
        professore2.assegnaVoto(studente3, 30);
        professore2.assegnaVoto(studente4, 15);

        // Metti gli studenti e i professori in un array
        Studente[] studenti = {studente1, studente2, studente3, studente4};
        Professore[] professori = {professore1, professore2};

        // Stampa i nomi e cognomi di tutti gli studenti eccellenti
        System.out.println("Studenti Eccellenti:");
        for (Studente studente : studenti) {
            if (studente.isExcellent()) {
                System.out.println(studente.getFirstName() + " " + studente.getLastName());
            }
        }

        // Trova lo studente con la media dei voti più alta
        Studente miglioreStudente = trovaMiglioreStudente(studenti);
        System.out.println("\nMiglior Studente:");
        System.out.println(miglioreStudente.getFirstName() + " " + miglioreStudente.getLastName());
    }

    // Metodo per trovare lo studente con la media dei voti più alta
    private static Studente trovaMiglioreStudente(Studente[] studenti) {
        Studente miglioreStudente = null;
        double mediaVotiMigliore = 0.0;

        for (Studente studente : studenti) {
            double mediaVoti = studente.calculateGradeAverage();
            if (mediaVoti > mediaVotiMigliore) {
                mediaVotiMigliore = mediaVoti;
                miglioreStudente = studente;
            }
        }

        return miglioreStudente;
    }
}