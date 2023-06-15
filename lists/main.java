package lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> nomeCitta = Arrays.asList("Trapani", "Pavia", "Milano");
        nomeCitta.set(1, "tegucigalpa");
        System.out.println(nomeCitta);

        ArrayList<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Tiberio");
        kingsOfRome.add("Remo");
        kingsOfRome.add("nerone");
        kingsOfRome.add("Lucio Tarquinio Superbo");
        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}




