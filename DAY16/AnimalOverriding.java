class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
