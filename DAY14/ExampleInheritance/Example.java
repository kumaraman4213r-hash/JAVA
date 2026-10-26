// Parent Class (Superclass)
class Vehicle {
    String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child Class (Subclass)
class Car extends Vehicle {
    String modelName = "Mustang";
}

// Execution Class
public class Example {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}