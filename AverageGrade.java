import java.util.Scanner;

public class AverageGrade {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Declare variables
    char input;
    int count = 0;
    double sum = 0;

    // Loop to enter grade
    do {
      if (count == 0) {
        System.out.print("Do you want to enter the grade? ");
      } else {
        System.out.print("Do you want to enter another grade? ");
      }

      // Convert user input to lower case
      input = Character.toLowerCase(scanner.next().charAt(0));

      if (input == 'y') {
        System.out.print("Please enter the grade: ");
        int grade;
        do {
          grade = scanner.nextInt();

          // Validate grade
          if (grade < 0 || grade > 100) {
            System.out.println("Please enter a valid grade (between 0-100).");
          } else {
            sum += grade;
            count++;
          }
        } while (grade < 0 || grade > 100);
      } else if (input != 'n') {
        System.out.println("Invalid input. Please enter 'y' or 'n'.");
      }
    } while (input != 'n');

    // Calculate average grade
    if (count == 0) {
      System.out.println("No grade has been entered.");
    } else {
      double average = sum / count;
      System.out.printf("The average grade is: %.2f%n", average);
    }

    scanner.close();
  }
}
