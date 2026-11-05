class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Person name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class NewClassExample {
    public static void main(String[] args) {
        Student student = new Student("Aman", 15);
        student.display();
    }
}
