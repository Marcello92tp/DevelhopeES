import java.time.LocalDate;

public class pippo {
    public static void main(String[] args) {

        int giorniAFDMese = LocalDate.now().lengthOfMonth() - LocalDate.now().getDayOfMonth();
        int giorniAFDAnno = LocalDate.now().lengthOfYear() - LocalDate.now().getDayOfYear();

        System.out.println("giorni rimanenti alla fine del mese: " + giorniAFDMese);
        System.out.println("giorni rimanenti alla fine dell' anno: " + giorniAFDAnno);
    }
}
