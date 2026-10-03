//Type Conversion is done automatically by the compiler (implicit conversion). It changes a smaller data type into a larger data type to prevent data loss. This is also called widening conversion.

public class TypeConversion {
    
 public static void main(String[] args) {

        int a = 10;
        double b = a;   // int → double automatically

        System.out.println(a);
        System.out.println(b);
    }
}
