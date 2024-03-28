package practice_project.assisted_practice1;

public class P07 {

    private int outerData = 10;

    class InnerClass {
        private int innerData = 20;

        public void displayOuterData() {
            System.out.println("Outer data from inner class: " + outerData);
        }

        public void displayInnerData() {
            System.out.println("Inner data: " + innerData);
        }
    }

    public static void main(String[] args) {
        P07 outerObject = new P07();
        P07.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.displayOuterData();
        innerObject.displayInnerData();
    }
}
