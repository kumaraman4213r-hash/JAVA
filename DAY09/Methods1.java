class Calculator{
    public int add(int n1,int n2,int n3){
        return  n1+n2+n3;
    }
    public int add1(int n1,int n2){
        return n1+n2;
    }
}


public class Methods1 {
    public static void main(String[] args) {
        Calculator obj =  new Calculator();
        int r1 = obj.add(1, 5, 10);
        //int r2 = obj.add1(5, 10);
        System.out.println(r1);
    }
    
}
