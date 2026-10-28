// Parent class
class Employee {
    double salary = 50000;
    
    void work() {
        System.out.println("Employee is working...");
    }
}

// Child class extending Employee
class Developer extends Employee {
    double bonus = 15000;
    
    void debug() {
        System.out.println("Developer is writing code.");
    }
}

public class PracticeInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        
        // Accessing parent class field and method
        System.out.println("Salary: $" + dev.salary);
        dev.work();
        
        // Accessing child class field and method
        System.out.println("Bonus: $" + dev.bonus);
        dev.debug();
    }
}
