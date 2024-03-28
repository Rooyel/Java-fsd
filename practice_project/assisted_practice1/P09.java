package practice_project.assisted_practice1;

public class P09 {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("Elements of the intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        intArray[2] = 10;
        System.out.println("\nAfter modification:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        String[] strArray = {"apple", "banana", "orange"};

        System.out.println("\nElements of the strArray:");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Element at index " + i + ": " + strArray[i]);
        }
    }
}
