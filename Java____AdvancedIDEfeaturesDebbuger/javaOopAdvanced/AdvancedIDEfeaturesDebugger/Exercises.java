package javaOopAdvanced.AdvancedIDEfeaturesDebugger;

import org.junit.jupiter.api.Assertions;

public class Exercises {
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
    

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh",reverseString(input));
    }

    private static String reverseString(String input) {
        // Fix this code

        String reversed = "String";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }


    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Object Assertions = null;
        Assertions.equals(isPositive(-5));
        Assertions.equals(isPositive(-55));
        Assertions.equals(isPositive(0));
        Assertions.equals(isPositive(5));
        Assertions.equals(isPositive(55));
        Assertions.equals(isPositive(4567));
    }

    private static boolean isPositive(int num) {
        //Fix this code
        return num >= 1;
    }
}
