package practice_project.assisted_practice1;

public class P01 {
    public static void main(String[] args) {
        int numInt = 100;
        long numLong = numInt;
        float numFloat = numInt;
        double numDouble = numFloat;

        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("int to long: " + numLong);
        System.out.println("int to float: " + numFloat);
        System.out.println("float to double: " + numDouble);

        double numDouble2 = 123.456;
        float numFloat2 = (float) numDouble2;
        long numLong2 = (long) numDouble2;
        int numInt2 = (int) numLong2;

        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("double to float: " + numFloat2);
        System.out.println("double to long: " + numLong2);
        System.out.println("long to int: " + numInt2);
    }
}
