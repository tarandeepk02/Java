import java.util.Scanner;

public class ClassifyScores {

  public static void main(String[] args) {
    // Create an array with 10 elements to store counts for each range
    int[] scoreRanges = new int[10];
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);
    int score;
    do {
      // Display message
      System.out.print("Please enter a score in the range 0 to 100: ");
      score = scanner.nextInt();
      classifyScore(score, scoreRanges);
    } while (score >= 0);
    // Display the tabulated scores
    displayScores(scoreRanges);
    // Close the scanner
    scanner.close();
  }

  // Function to classify the score into the appropriate range
  private static void classifyScore(int score, int[] scoreRanges) {
    // Check if the score is within the valid range
    if (score >= 0 && score <= 100) {
      if (score == 100) {
        scoreRanges[9]++;
      } else {
        scoreRanges[score / 10]++;
      }
    } else if (score > 100) {
      // Display an error message for scores greater than 100
      System.out.println(
        "Invalid input - the score must be between 0 to 100. Please enter again."
      );
    }
  }

  // Function to display the tabulated scores
  private static void displayScores(int[] scoreRanges) {
    System.out.println("Range\tNumber of scores");
    for (int i = 0; i < scoreRanges.length; i++) {
      int lowerRange = i * 10;
      int upperRange = (i == 9) ? 99 : (i * 10 + 9);
      System.out.println(
        lowerRange + " - " + upperRange + "\t\t" + scoreRanges[i]
      );
    }
  }
}