import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Input year, month, and day of the month
    System.out.print("Enter year (e.g., 2008): ");
    int year = scanner.nextInt();
    System.out.print("Enter month: 1-12: ");
    int month = scanner.nextInt();
    System.out.print("Enter the day of the month: 1-31: ");
    int day = scanner.nextInt();

    // Adjust month and year
    if (month < 3) {
      month += 12;
      year -= 1;
    }

    // Calculate values for q, m, j, and k
    int q = day;
    int m = month;
    int j = year / 100;
    int k = year % 100;

    // Apply formula to calculate h
    int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;

    // Display the day of the week
    System.out.print("Day of the week is ");
    switch (h) {
      case 0:
        System.out.println("Saturday");
        break;
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
    }

    scanner.close();
  }
}
