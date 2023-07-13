package enums;

public class Enum {
    public static void main(String[] args) {
enum Mesi{ JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER}


        for (Mesi m:Mesi.values()) {
            String nomeFineMese=m.name();

            if (nomeFineMese.endsWith("Y"))
            {System.out.println("termina con y");
            }
            else
            {System.out.println("non finisce con y");}

        }
    }
}
