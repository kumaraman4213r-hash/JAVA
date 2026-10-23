class Device {
    String model;
    int price;
    static String brand; // shared by all objects

    public Device() {
        this.model = "Default Device";
        this.price = 1000;
    }

    public Device(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void show() {
        System.out.println(model + " : " + price + " : " + brand);
    }
}

public class AllInOne {
    public static void main(String[] args) {
        Device.brand = "TechWorld";

        Device d1 = new Device("Apple", 1500);
        d1.show();

        Device d2 = new Device();
        d2.show();

        new Device("Samsung", 1700).show(); // anonymous object

        Device d3 = new Device("Realme", 1200);
        System.out.println(d3.model + " : " + d3.price + " : " + Device.brand);
    }
}
