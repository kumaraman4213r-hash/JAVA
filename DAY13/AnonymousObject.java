
class A 
{
    public A()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in A show");
    }
}


public class AnonymousObject {

    public static void main(String a[]) 
    {
        new A();    // anonymous object
    }
}
