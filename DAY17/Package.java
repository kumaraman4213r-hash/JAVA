import day17.AdvCalc;
import day17.Calc;

public class Package 
{
    public static void main(String[] args) 
    {
        Calc obj = new Calc();
        AdvCalc obj1 =  new AdvCalc();

        int sum = obj.add(10,5);
        System.out.println(" sum: "+ sum);

        int multi = obj1.multi(10,5);
        System.out.println(" Multiplication : " +multi);
    }
}
