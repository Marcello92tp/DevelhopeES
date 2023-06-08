
package esercizio7;
import java.util.Arrays;
public class main {
        public static void main (String[] args){
    String string1 = "Hello";
    String string2 = "How are you?";
    String substring1 = string1.substring(0,2);
    String substring2 = string2.substring(string2.length() -2);
    char[] charArray = (substring1 + substring2).toCharArray();
    System.out.println(charArray);
}
}

