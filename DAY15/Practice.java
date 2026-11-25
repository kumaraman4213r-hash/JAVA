public class Practice {
    static class Vehicle {
        String brand;

        Vehicle(String brand) {
            super();
            this.brand = brand;
            System.out.println("Vehicle constructor");
        }

        void display() {
            System.out.println("Brand: " + brand);
        }
    }

    static class Car extends Vehicle {
        int wheels;

        Car(String brand, int wheels) {
            super(brand);
            this.wheels = wheels;
            System.out.println("Car constructor");
        }

        @Override
        void display() {
            super.display();
            System.out.println("Wheels: " + wheels);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.display();
    }
}
