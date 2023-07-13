public class ESeifelse {

        public static void main(String[] args) {
            String myName = "marcello";
            int nameLength = myName.length();

            if (nameLength % 2 == 0) {
                System.out.println("Il numero delle lettere è pari");
            } else {
                System.out.println("Il numero delle lettere è dispari");
            }
        }
    }