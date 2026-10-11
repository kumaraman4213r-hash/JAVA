class Calulator{
    int a;
    public  int add(int n1,int n2){
        int r = n1 + n2;
        return  r;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        
        Calulator calc = new Calulator();
        int result = calc.add(num1,num2);

        System.out.println(result);
    }
    
}
