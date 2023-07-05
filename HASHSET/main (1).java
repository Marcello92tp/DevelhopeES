package HASHSET;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
public class main {
    public static void main(String[] args) {
        HashSet<String> weekDaysSet = new HashSet<>();
        weekDaysSet.add("Lunedi");
        weekDaysSet.add("Martedi");
        weekDaysSet.add("Mercoledi");
        weekDaysSet.add("Giovedi");
        weekDaysSet.add("Venerdi");
        weekDaysSet.add("Sabato");
        weekDaysSet.add("Domenica");

        System.out.println(weekDaysSet);
        HashSet<String> weekDaysSet1 = new LinkedHashSet<>();
               
        giorniSettimanaOrdinati.add("Lunedì");
        giorniSettimanaOrdinati.add("Martedì");
        giorniSettimanaOrdinati.add("Mercoledì");
        giorniSettimanaOrdinati.add("Giovedì");
        giorniSettimanaOrdinati.add("Venerdì");
        giorniSettimanaOrdinati.add("Sabato");
        giorniSettimanaOrdinati.add("Domenica");
        
        System.out.println(weekDaysSet1);
        System.out.println("Il primo set è uguale al secondo?");

        if (weekDaysSet1.equals(weekDaysSet)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}



