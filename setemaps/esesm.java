import java.util.*;

public class esesm {


    public static void main(String[] args) {

        Map<String,Integer> months=new LinkedHashMap<String,Integer>();

        months.put("gennaio",1);
        months.put("febbraio",2);
        months.put("marzo",3);
        months.put("aprile",4);
        months.put("maggio",5);
        months.put("giugno",6);
        months.put("luglio",7);
        months.put("agosto",8);
        months.put("settembre",9);
        months.put("ottobre",10);
        months.put("novembre",11);
        months.put("dicembre",12);

        System.out.println(months);


        System.out.println("stampo le chiavi : ");
        for (String g:months.keySet()) {
            System.out.println(g);
        }

        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.println("stampo la lista di interi: " + cardinalMonth);

        Integer[] cardinalMonthArray = new Integer[months.size()];
        months.values().toArray(cardinalMonthArray);
        System.out.println("stampo l array di interi: " + Arrays.toString(cardinalMonthArray));


    }


}
