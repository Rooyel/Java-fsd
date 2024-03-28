package practice_project.assisted_practice2;

//Define the base interface
interface Base {
 default void display() {
     System.out.println("Base interface");
 }
}

//Define interfaces A and B, both inheriting from Base
interface A extends Base {
 // Override default method to provide specific implementation
 @Override
 default void display() {
     System.out.println("Interface A");
 }
}

interface B extends Base {
 // Override default method to provide specific implementation
 @Override
 default void display() {
     System.out.println("Interface B");
 }
}

//Define a class that implements A and B
class MClass implements A, B {
 // Resolve the diamond problem by providing an explicit implementation
 @Override
 public void display() {
     // Call the desired method implementation from one of the interfaces
     A.super.display(); // Here, we're choosing to call the display() method of interface A
 }
}

//Main class to demonstrate resolution of the diamond problem
public class P09 {
 public static void main(String[] args) {
     MClass obj = new MClass();
     obj.display(); // Output will be "Interface A"
 }
}
