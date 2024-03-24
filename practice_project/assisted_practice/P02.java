package practice_project.assisted_practice;


public class P02 {

    public int publicField = 10;
    private int privateField = 20;
    protected int protectedField = 30;
    int defaultField = 40;

    public void publicMethod() {
        System.out.println("This is a public method.");
        System.out.println("Value of privateField: " + privateField);
    }

    @SuppressWarnings("unused")
	private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public static void main(String[] args) {
        P02 obj = new P02();

        System.out.println("Accessing fields:");
        System.out.println("publicField: " + obj.publicField);
        System.out.println("protectedField: " + obj.protectedField);
        System.out.println("defaultField: " + obj.defaultField);

        System.out.println("\nAccessing methods:");
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}
