class Student {
    String name;
    int marks;
    static String school;

    public Student() {
        name = "Unknown";
        marks = 0;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void show() {
        System.out.println(name + " : " + marks + " : " + school);
    }
}

public class Example {
    public static void main(String[] args) {
        Student.school = "DAV Public School";

        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("Aman", 90);
        s2.show();

        new Student("Riya", 95).show();
    }
}
