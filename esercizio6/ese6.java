public class ese6 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        if (string1.length() > 1 && string2.length() > 1) {
            char c1 = string1.charAt(0);
            char c2 = string2.charAt(1);
            char c3 = string2.charAt(string2.length() - 2);
            char c4 = string2.charAt(string2.length() - 1);

            char[] charArray = {c1, c2, c3, c4};

            System.out.println(charArray);
        } else System.out.println("The string is less than 2 characters");
    }
}


