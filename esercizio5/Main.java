package esercizio5;

public class Main  {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    exercise4();
}


        private static void exercise1() {
            System.out.println("\nEsercizio 1:");
            String text = "Sono fortissimo.";

            System.out.println("Maiuscolo: " + text.toUpperCase());
            System.out.println("Minuscolo: " + text.toLowerCase());
        }


        private static void exercise2() {
            System.out.println("\nEsercizio 2:");
            String firstName = "Marcello";
            String middleName = "Valentino";
            String lastName = "Gerardi";

            System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase());
        }


        private static void exercise3() {
            System.out.println("\nEsercizio 3:");

            String textFrom2Primitives = "" + 1.5 + true; // Concatenates a double and a boolean as strings
            System.out.println(textFrom2Primitives);
        }


        private static void exercise4() {
            System.out.println("\nEsercizio 4:");
            String endNumbers = "7 8 9";
            String middleNumbers = "       4 5 6";
            String earlyNumbers = "1 2 3";

            String result = earlyNumbers.trim() + " " + middleNumbers.trim() + " " + endNumbers.trim();
            System.out.println(result);
        }
}