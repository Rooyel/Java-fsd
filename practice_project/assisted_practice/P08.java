package practice_project.assisted_practice;

public class P08 {

    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String converted to StringBuffer: " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("String converted to StringBuilder: " + stringBuilder);
    }
}
