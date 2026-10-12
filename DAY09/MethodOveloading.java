// "Method Overloading: A method with the same name but different parameters is called Overloading."

class Sum{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}

public class MethodOveloading {
    public static void main(String[] args) {
        Sum s = new Sum();
         double s1 = s.add(8, 9);
         System.out.println(s1);
        
    }

    
}
