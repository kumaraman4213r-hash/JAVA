public class ExampleTerniaryOp {
    public static void main(String[] args) {
        int num = 15;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number " + num + " is " + result);
    }
}