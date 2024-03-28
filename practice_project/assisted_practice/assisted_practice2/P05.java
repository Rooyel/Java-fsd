package practice_project.assisted_practice2;
import java.io.Serializable;
//Custom exception class
class CustomException extends Exception implements Serializable {
    // SerialVersionUID to maintain serial compatibility
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
}

public class P05 {
 // Method declaring checked exception using 'throws'
 static void methodWithCheckedException() throws CustomException {
     throw new CustomException("This is a checked exception");
 }

 // Method declaring unchecked exception using 'throws'
 static void methodWithUncheckedException() {
     throw new ArithmeticException("This is an unchecked exception");
 }

 public static void main(String[] args) {
     try {
         methodWithCheckedException();
     } catch (CustomException e) {
         System.out.println("Caught checked exception: " + e.getMessage());
     } finally {
         System.out.println("Executing finally block for checked exception");
     }

     try {
         methodWithUncheckedException();
     } catch (ArithmeticException e) {
         System.out.println("Caught unchecked exception: " + e.getMessage());
     } finally {
         System.out.println("Executing finally block for unchecked exception");
     }

     // Custom exception using 'throw'
     try {
         throw new CustomException("This is a custom exception using throw");
     } catch (CustomException e) {
         System.out.println("Caught custom exception using throw: " + e.getMessage());
     } finally {
         System.out.println("Executing finally block for custom exception using throw");
     }
 }
}
