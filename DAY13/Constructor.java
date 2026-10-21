class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Human() {
        age = 12;
        name = "Aman";
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
}


public class Constructor {
    public static void main(String[] args) {
        
        Human h1 = new  Human();
        System.out.println(h1.getName()+ " : " + h1.getAge());

        Human h2 = new Human(25, "Kumar");
        System.out.println(h2.getName() + " : " + h2.getAge());
    }
}
