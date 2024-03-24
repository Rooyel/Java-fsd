package practice_project.assisted_practice;

public class P04 {

    public P04() {
        System.out.println("This is a default constructor.");
    }

    public P04(int value) {
        System.out.println("This is a parameterized constructor with value: " + value);
    }

    public P04(P04 example) {
        System.out.println("This is a copy constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Creating objects using different constructors:");
        new P04();
        P04 parameterizedConstructor = new P04(10);
        new P04(parameterizedConstructor);; 
    }
}
