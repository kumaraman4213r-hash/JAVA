public class Student extends Person {
    private final String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void study() {
        System.out.println("I am studying " + course + ".");
    }
}
