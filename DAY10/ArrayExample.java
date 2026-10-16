public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 9};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
