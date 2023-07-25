import java.io.*;

public class Tester {
    public static void main(String[] args) {
File file = new File("C:\\Users\\39366\\IdeaProjects\\streams\\src\\file.txt");

try {
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    br.lines().forEach(System.out::println);
                }
            } else { System.err.println("Il file non esiste.");
            }
            } catch (IOException e) {
            System.err.println("Errore di I/O: " + e.getMessage());
            } finally {
            System.out.println("Lettura del file terminata.");
            }
      }
}


