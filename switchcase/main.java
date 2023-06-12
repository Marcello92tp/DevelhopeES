package switchcase;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Inserisci un numero tra 1 e 10: ");
            Scanner scanner = new Scanner(System.in);
            int numeri= scanner.nextInt();

            switch (numeri){
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("due");
                    break;
                case 3:
                    System.out.println("tre");
                    break;
                case 4:
                    System.out.println("quattro");
                    break;
                case 5:
                    System.out.println("cinque");
                    break;
                case 6:
                    System.out.println("sei");
                    break;
                case 7:
                    System.out.println("sette");
                    break;
                case 8:
                    System.out.println("otto");
                    break;
                case 9:
                    System.out.println("nove");
                    break;
                case 10:
                    System.out.println("dieci");
                    break;
                default:
                    System.out.println("Non posso darti il nome. Riprova.");
                    break;
            }
        }
    }
}