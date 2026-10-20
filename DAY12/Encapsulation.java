class Human{
    private int age = 20;
    private String name = "Aman"; 

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


public class Encapsulation {
    public static void main(String[] args){
    Human obj = new Human();
        obj.setAge(22);
        obj.setName("Aman Kumar");
        System.out.println(obj.getName() + " : " + obj.getAge());
    
    }   
}
