public class ExampleEncap {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Kumar");
        student.setRollNumber(101);
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Age: " + student.getAge());

        student.setAge(-5); // invalid age, will be ignored
        System.out.println("Updated Age: " + student.getAge());
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be 0 or greater.");
        }
    }
}
