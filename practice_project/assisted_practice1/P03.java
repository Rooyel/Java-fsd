package practice_project.assisted_practice1;

public class P03 {

    public void voidMethod() {
        System.out.println("This is a void method without parameters.");
    }

    public void parameterizedMethod(int value) {
        System.out.println("This is a parameterized method. Value: " + value);
    }

    public int returnMethod() {
        System.out.println("This is a method with return value.");
        return 100;
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        P03 obj = new P03();

        obj.voidMethod();

        obj.parameterizedMethod(50);

        int returnValue = obj.returnMethod();
        System.out.println("Returned value: " + returnValue);

        staticMethod();

        P03.staticMethod();
    }
}
