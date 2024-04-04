package practice_project.assisted_practice4;

public class P03 {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 10, 14, 18, 23, 30};
        int target = 14;
        int result = exponentialSearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
