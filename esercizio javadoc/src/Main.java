/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Create a new WordGames object
        WorldGames wordGames = new WorldGames();

        // Test add Hello World
        String helloWorld = wordGames.addHelloWord("World");
        System.out.println("Add Hello World: " + helloWorld);

        // Test nome Completo
        String nomeCompleto = wordGames.getFullName("Marcello", "Gerardi");
        System.out.println("nome completo: " + nomeCompleto);
    }
}






