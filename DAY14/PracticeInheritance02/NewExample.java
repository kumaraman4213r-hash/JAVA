// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class NewExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");

        dog.eat();
        dog.bark();
    }
}
