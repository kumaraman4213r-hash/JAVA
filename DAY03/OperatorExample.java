public class OperatorExample {
    public static void main(String[] args) {
        int first = 12;
        int second = 5;

        System.out.println("Arithmetic operators:");
        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Division: " + (first / second));
        System.out.println("Remainder: " + (first % second));

        int total = first;
        total += second;
        System.out.println("Assignment (+=): " + total);

        int count = 3;
        System.out.println("Post-increment: " + count++);
        System.out.println("After post-increment: " + count);
        System.out.println("Pre-decrement: " + --count);

        System.out.println("Relational operators:");
        System.out.println("first > second: " + (first > second));
        System.out.println("first == second: " + (first == second));
        System.out.println("first != second: " + (first != second));

        boolean bothConditions = first > second && second > 0;
        boolean eitherCondition = first < second || second > 0;
        System.out.println("Logical AND: " + bothConditions);
        System.out.println("Logical OR: " + eitherCondition);
        System.out.println("Logical NOT: " + !(first == second));

        String larger = first > second ? "first" : "second";
        System.out.println("Ternary operator: " + larger + " is larger");
    }
}