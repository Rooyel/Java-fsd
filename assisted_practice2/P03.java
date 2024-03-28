package practice_project.assisted_practice2;

class MethodExample {
    // Method with no parameters and no return type
    static void printHello() {
        System.out.println("Hello");
    }

    // Method with parameters and return type
    static int add(int a, int b) {
        return a + b;
    }

    // Method with parameter but no return type
    static void printMessage(String message) {
        System.out.println(message);
    }

    // Method with return type but no parameter
    static int[] getArray() {
        return new int[]{1, 2, 3, 4, 5};
    }

    // Method with variable arguments
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}

public class P03 {
    public static void main(String[] args) {
        // Calling a method with no parameters and no return type
        MethodExample.printHello();

        // Calling a method with parameters and return type
        int result = MethodExample.add(5, 3);
        System.out.println("Result of addition: " + result);

        // Calling a method with parameter but no return type
        MethodExample.printMessage("This is a message");

        // Calling a method with return type but no parameter
        int[] array = MethodExample.getArray();
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calling a method with variable arguments
        int sum1 = MethodExample.sum(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3: " + sum1);

        int sum2 = MethodExample.sum(1, 2, 3, 4, 5);
        System.out.println("Sum of 1, 2, 3, 4, and 5: " + sum2);
    }
}
