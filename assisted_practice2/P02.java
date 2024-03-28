package practice_project.assisted_practice2;

class MyClass {
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }
}

class Subclass extends MyClass {
    void accessProtectedVar() {
        System.out.println("Accessing protectedVar from subclass: " + protectedVar);
    }
}

public class P02 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Accessing publicVar: " + obj.publicVar);
        obj.publicMethod();

        System.out.println("Accessing defaultVar: " + obj.defaultVar);
        obj.defaultMethod();

        Subclass subObj = new Subclass();
        subObj.accessProtectedVar();
        subObj.protectedMethod();
    }
}
