import java.util.Scanner;

public class Triangles {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput;

    do {
      // Display message
      System.out.printf("Enter three sides in double: ");

      // Read Inputs
      double side1 = scanner.nextDouble();
      double side2 = scanner.nextDouble();
      double side3 = scanner.nextDouble();

      // Check valid status
      boolean validStatus = isValid(side1, side2, side3);

      if (validStatus) {
        double area = area(side1, side2, side3);
        System.out.printf("The area of the triangle is %.2f\n", area);
      } else {
        System.out.println("Input is invalid");
      }

      // Prompt user to continue
      System.out.println("Would you like to repeat the program?");
      userInput = scanner.next().toLowerCase();
    } while (userInput.equals("yes"));

    // Print end of program message
    System.out.println("End of Program");

    scanner.close();
  }

  /** Return true if the sum of every two sides is greater than the third side. */
  public static boolean isValid(double side1, double side2, double side3) {
    if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
      return true;
    } else {
      return false;
    }
  }

  /** Return the area of the triangle. */
  public static double area(double side1, double side2, double side3) {
    double s = (side1 + side2 + side3) / 2;

    // Calculate area
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    return area;
  }
}
