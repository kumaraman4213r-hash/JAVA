public class ExampleSwitchStatement {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("You selected tea.");
                break;
            case 2:
                System.out.println("You selected coffee.");
                break;
            case 3:
                System.out.println("You selected juice.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }
}