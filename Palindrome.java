import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Display message
    System.out.print("Enter a string: ");
    while (true) {
      String input = scanner.nextLine();

      if (input.length() <= 3) {
        System.out.println(
          "The length of the string \"" +
          input +
          "\" is less than 3. Please re-enter a string of length >= 3. "
        );
      } else {
        // Check if the string is a palindrome
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
          if (input.charAt(left) != input.charAt(right)) {
            isPalindrome = false; // Characters at same positions are not equal, not a palindrome
            break;
          }
          left++;
          right--;
        }

        if (isPalindrome) {
          System.out.println("The string \"" + input + "\" is a palindrome");
        } else {
          System.out.println(
            "The string \"" + input + "\" is not a palindrome"
          );
        }

        break; // Exit the loop after processing the input
      }
    }

    scanner.close();
  }
}
