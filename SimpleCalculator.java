import java.util.Scanner;

public class SimpleCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String resultHeading = "";

    // Display message
    System.out.println("Welcome to my Simple Calculator\n");

    System.out.println(
      "You can perform the following Operations. Please type: \n" +
      "\t\tADD or + for addition\n" +
      "\t\tSUBTRACT or - for subtraction\n" +
      "\t\tMULTIPLY or * for multiplication\n" +
      "\t\tDIVIDE or / for division\n" +
      "\t\tREMAINDER or % for remainder\n" +
      "\t\tEXPONENT or ^ for exponentiation"
    );

    System.out.println("Let's Start.\n");

    // Prompt user for two numbers
    System.out.print("Enter the first operand: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second operand: ");
    double num2 = scanner.nextDouble();

    // Prompt user for the operation
    System.out.print("Enter your selection: ");
    String operation = scanner.next().toUpperCase();

    // Perform calculation using switch statement
    double result = 0.0;

    switch (operation) {
      case "ADD":
      case "+":
        result = num1 + num2;
        resultHeading = "The result of addition " + num1 + " and " + num2 + " is " + String.format("%.2f", result);
        break;
      case "SUBTRACT":
      case "-":
        result = num1 - num2;
        resultHeading = "The result of subtracting " + num2 + " from " + num1 + " is " + String.format("%.2f", result);
        break;
      case "MULTIPLY":
      case "*":
        result = num1 * num2;
        resultHeading = "The result of multiplication of " + num1 + " and " + num2 + " is " + String.format("%.2f", result);
        break;
      case "DIVIDE":
      case "/":
        if (num2 != 0) {
          result = num1 / num2;
          resultHeading = "The result of division of " + num1 + " and " + num2 + " is " + String.format("%.2f", result);
        } else {
          System.out.println("Division by 0 is not allowed.");
          System.exit(1);
        }
        break;
      case "REMAINDER":
      case "%":
        if (num2 != 0) {
          result = num1 % num2;
          resultHeading = "The result of remainder of " + num1 + " and " + num2 + " is " + String.format("%.2f", result);
        } else {
          System.out.println("Cannot find remainder for division by zero.");
          System.exit(1);
        }
        break;
      case "EXPONENT":
      case "^":
        result = Math.pow(num1, num2);
        resultHeading = "The result of exponentiation of " + num1 + " and " + num2 + " is " + String.format("%.2f", result);
        break;
      default:
        System.out.println("Invalid operation entered.");
        System.exit(1);
    }

    // Display the result
    System.out.println(resultHeading);

    scanner.close();
  }
}
