
//  a static variable is shared by all objects (instances) of that class.
class Mobile{
    String brand;
    int price;
     static String name; //common to  all the object(static) 

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaicKeyword {
  public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj1.name = "phone";

        obj1.show();
        obj2.show();
    }
}