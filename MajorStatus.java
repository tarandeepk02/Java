import java.util.Scanner;

public class MajorStatus {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Enter two characters: ");
    String input = scanner.nextLine();

    // Validate input length
    if (input.length() != 2) {
      System.out.println("You must enter only two characters.");
      System.exit(1);
    }

    // Extract major and status characters
    char majorChar = Character.toUpperCase(input.charAt(0));
    char statusChar = input.charAt(1);

    // Validate major character
    if (majorChar != 'M' && majorChar != 'C' && majorChar != 'I') {
      System.out.println("Invalid input: Wrong major code");
      System.exit(1);
    }

    // Validate status character
    if (statusChar < '1' || statusChar > '4') {
      System.out.println("Invalid status character. It must be 1, 2, 3, or 4.");
      System.exit(1);
    }

    // Display major and status
    String major;
    switch (majorChar) {
      case 'M':
        major = "Mathematics";
        break;
      case 'C':
        major = "Computer Science";
        break;
      case 'I':
        major = "Information Technology";
        break;
      default:
        major = "Unknown";
    }

    String status;
    switch (statusChar) {
      case '1':
        status = "Freshman";
        break;
      case '2':
        status = "Sophomore";
        break;
      case '3':
        status = "Junior";
        break;
      case '4':
        status = "Senior";
        break;
      default:
        status = "Unknown";
    }

    System.out.println(major + " " + status);

    scanner.close();
  }
}
