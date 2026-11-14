public class NewExampleArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Size of array: " + numbers.length);
    }
}
