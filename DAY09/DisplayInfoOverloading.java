class Information {
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void display(String name, int age, String city) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

public class DisplayInfoOverloading {
    public static void main(String[] args) {
        Information info = new Information();
        info.display("Aman");
        info.display("Aman", 20);
        info.display("Aman", 20, "Delhi");
    }
}
