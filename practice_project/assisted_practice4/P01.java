package practice_project.assisted_practice4;

public class P01 {
    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // If target found, return its index
            }
        }
        return -1; // If target not found, return -1
    }

    public static void main(String[] args) {
        int[] array = { 10, 23, 5, 7, 14, 18, 3 };
        int target = 14;
        int result = linearSearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
