import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String studentID;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    // Costruttore che inizializza la lista dei voti come vuota
    public Studente(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    // Getter e setter per gli attributi
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    // Metodo per calcolare la media dei voti dello studente
    public double calculateGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0; // Se la lista dei voti è vuota, la media è 0.0
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    // Metodo per verificare se lo studente è eccellente
    public boolean isExcellent() {
        return calculateGradeAverage() >= 28;
    }
}