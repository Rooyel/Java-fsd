package practice_project.assisted_practice2;

	public class P04 {
	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            int result = numerator / denominator;
	            System.out.println("Result: " + result); // This line will not be executed if an exception occurs
	        } catch (ArithmeticException e) {
	            // This block will handle ArithmeticException if it occurs
	            System.out.println("Error: Division by zero");
	        }

	        // Code continues to execute after the try-catch block
	        System.out.println("Program continues...");
	    }
	}
