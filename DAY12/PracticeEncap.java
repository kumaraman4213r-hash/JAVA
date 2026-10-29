public class PracticeEncap {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Constructor
    public PracticeEncap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age provided.");
        }
    }

    // ADDED: The entry point Java needs to run your program
    public static void main(String[] args) {
        // Since you have a constructor, pass name and age during object creation
        PracticeEncap person = new PracticeEncap("Alice", 25);
        
        // Read data using getter
        System.out.println("Initial Name: " + person.getName());
        System.out.println("Initial Age: " + person.getAge());

        // Modify data using setter
        person.setAge(26);
        System.out.println("Updated Age: " + person.getAge());

        // Try an invalid age
        person.setAge(-5); 
    }
}
