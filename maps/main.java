package maps;

import java.util.HashMap;
//Define a testing class with a main() method where you:
//
//        create an HashMap that maps the numbers from 1 to 5 with their respective English names
//        create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
//        merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
//        print the modified firstHashMap
//        print on screen the value of the keys 5, 6, 7, 8 and 9
//        if there's no mapping for a specific key, print No associated value
public class main {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Tree");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        HashMap<Integer, String> numbers1 = new HashMap<Integer, String>();

        numbers1.put(1, "Uno");
        numbers1.put(3, "Tre");
        numbers1.put(5, "Cinque");
        numbers1.put(7, "Sette");
        numbers1.put(9, "Nove");
        for (Integer key : numbers1.keySet()) {
            numbers.put(key, numbers1.get(key));
        }
        System.out.println("Key 5: " + numbers.getOrDefault(5, "senza valore associato."));
        System.out.println("Key 6: " + numbers.getOrDefault(6, "senza valore associato."));
        System.out.println("Key 7: " + numbers.getOrDefault(7, "senza valore associato."));
        System.out.println("Key 8: " + numbers.getOrDefault(8, "senza valore associato."));
        System.out.println("Key 9: " + numbers.getOrDefault(9, "senza valore associato."));

    }
}
