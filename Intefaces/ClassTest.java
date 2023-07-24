package Intefaces;

public class ClassTest {
    public static void main(String[] args) {
        Student student = new Student("Massimo", "Ciancimino", 2459, 2);
        Professor professor = new Professor("Filippo", "Martini", 1171, "Java");
        Assistant assistant = new Assistant("Roberta", "Biaggio", 2305, true);


        System.out.println("Student Details:");
        student.goToCollege();

        System.out.println("\nProfessor Details:");
        professor.goToCollege();

        System.out.println("\nAssistant Details:");
        assistant.goToCollege();

        System.out.println("\nStudent Study:");
        student.studyAtHome();

        System.out.println("\nProfessor Teaching:");
        professor.teachToOtherPeople();

        System.out.println("\nAssistant Study:");
        assistant.studyAtHome();

        System.out.println("\nAssistant Teaching:");
        assistant.teachToOtherPeople();
    }
}
