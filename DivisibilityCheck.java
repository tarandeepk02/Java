import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Input the first number
        System.out.print("Enter a positive integer number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter a positive integer number: ");
        int num2 = scanner.nextInt();

        // Check for negative numbers and display an error message
        if (num1 < 0 || num2 < 0) {
            System.out.println("Expecting a positive number");
        } else if (num1 < num2) {
            // Check if the first number is bigger than the second number
            System.out.println("First number must be bigger than the second number");
        } else {
            // Check if the first number is divisible by the second number
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is divisible by " + num2);
            } else {
                System.out.println(num1 + " is not divisible by " + num2);
            }
        }
        scanner.close();
    }
}
