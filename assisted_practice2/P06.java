package practice_project.assisted_practice2;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Handling ArithmeticException
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println("Array element at index 3: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Example 3: Handling NumberFormatException
        System.out.print("Enter a number: ");
        try {
            String input = scanner.next();
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // Example 4: Finally block
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        // Example 5: Rethrowing an exception
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        scanner.close();
    }

    // Method that throws an exception
    static void someMethod() throws Exception {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in someMethod: " + e.getMessage());
            throw e; // Rethrow the caught exception
        }
    }
}
