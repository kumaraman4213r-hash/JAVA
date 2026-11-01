class A{
    public void show(){
        System.out.println("in A Show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B Show");
    }
}



public class MethodOverriding {
    public static void main(String[] args) {
         B obj = new B();
         obj.show();
         obj.config();

         
    }
}
