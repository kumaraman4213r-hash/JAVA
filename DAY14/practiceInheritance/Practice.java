// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class Practice {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();  

        a = new Cat();
        a.sound(); 

        a = new Cow();
        a.sound();  
    }
}