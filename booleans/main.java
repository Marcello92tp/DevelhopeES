package booleans;

public class main {
    public static void main(String[] args) {
        boolean f = true;
        boolean t = false;

        boolean result1 = 2 <= 2 && !true;
        boolean result2 = !false && 3 > 2;
        boolean result3 = !(!t || f);
        boolean result4 = 6 > 6 ^ !(true && true);


        System.out.println("Risultato A =" + " " + result1);
        System.out.println("Risultato B =" + " " + result2);
        System.out.println("Risultato C =" + " " + result3);
        System.out.println("Risultato D =" + " " + result4);
    }
}



