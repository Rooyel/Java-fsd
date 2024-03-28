package practice_project.assisted_practice2;

//Encapsulation: Class with private fields and public methods
class Car {
 private String brand;
 private String model;

 public Car(String brand, String model) {
     this.brand = brand;
     this.model = model;
 }

 // Getter methods to access private fields
 public String getBrand() {
     return brand;
 }

 public String getModel() {
     return model;
 }
}

//Inheritance: Subclass inheriting from Car class
class ElectricCar extends Car {
 private int batteryCapacity;

 public ElectricCar(String brand, String model, int batteryCapacity) {
     super(brand, model);
     this.batteryCapacity = batteryCapacity;
 }

 // Polymorphism: Method overriding
 @Override
 public String toString() {
     return "Brand: " + getBrand() + ", Model: " + getModel() + ", Battery Capacity: " + batteryCapacity + " kWh";
 }
}

public class P08 {
 public static void main(String[] args) {
     // Creating objects of Car and ElectricCar classes
     Car car1 = new Car("Toyota", "Camry");
     ElectricCar electricCar1 = new ElectricCar("Tesla", "Model S", 100);

     // Encapsulation: Accessing private fields using getter methods
     System.out.println("Car 1 - Brand: " + car1.getBrand() + ", Model: " + car1.getModel());
     System.out.println("Electric Car 1 - " + electricCar1);

     // Abstraction: Hiding internal details of ElectricCar class
     // Polymorphism: Using ElectricCar object in place of Car object
     Car car2 = electricCar1;
     System.out.println("Car 2 - Brand: " + car2.getBrand() + ", Model: " + car2.getModel());
 }
}
