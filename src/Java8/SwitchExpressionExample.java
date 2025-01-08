package Java8;
import java.util.Scanner;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
// java 12+
        int result = switch (choice) {
            case 1 -> a + b;
            case 2 -> a * b;
            case 3 -> a - b;
            case 4 -> b != 0 ? a / b : -1; // Handle division by zero
            default -> -1; // Handle invalid choice
        };

        if (result != -1 || (choice == 4 && b == 0)) {
            if (choice == 4 && b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid choice. Please select a valid operation.");
        }
        
        scanner.close();
    }
}
