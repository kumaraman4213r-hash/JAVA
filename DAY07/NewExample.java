public class NewExample {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("do-while loop:");
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);

        System.out.println("enhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}
