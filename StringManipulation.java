import java.util.Scanner;

public class StringManipulation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Prompt sentence from user
    System.out.print("Please enter a sentence: \n");
    String str = scanner.nextLine();
    int choice;
    do {
      //Show options list
      System.out.println(
        "Please enter: \n" +
        "1: To display the number of words in the sentence\n" +
        "2: To display the number of vowel characters in the sentence\n" +
        "3: To display the longest word\n" +
        "4: To display the word with the most vowels\n" +
        "5: To enter a new sentence\n" +
        "6: To terminate the program"
      );
      //Prompt choice from user
      choice = scanner.nextInt();
      scanner.nextLine();
      //Switch case according to choice
      switch (choice) {
        case 1:
          int wordCount = displayWordCount(str);
          System.out.println("The number of words in the \"" + str + "\" is: " + wordCount);
          break;
        case 2:
          displayVowelCount(str);
          break;
        case 3:
          String longestWord = displayLongestWord(str);
          System.out.println("The longest word in \"" + str + "\" is " + longestWord);
          break;
        case 4:
          String mostVowelWord = displayMostVowelWord(str);
          System.out.println("The word with the most vowels in \"" + str +"\" is " +mostVowelWord);
          break;
        case 5:
          System.out.print("Please enter a new sentence: \n");
          str = scanner.nextLine();
          break;
        case 6:
          System.out.println("The program terminates");
          //Terminate program
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    } while (choice <= 6);
  }

  public static int displayWordCount(String sentence) {
    int wordCount = 0;
    boolean inWord = false;

    int i = 0;
    //Loop through sentence length
    while (i < sentence.length()) {
      char c = sentence.charAt(i);

      if (Character.isWhitespace(c)) {
        inWord = false;
      } else if (!inWord) {
        inWord = true;
        wordCount++;
      }

      i++;
    }

    return wordCount;
  }

  public static void displayVowelCount(String sentence) {
    int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

    int i = 0;
    //Loop through sentence length
    while (i < sentence.length()) {
      char c = Character.toLowerCase(sentence.charAt(i));

      switch (c) {
        case 'a':
          aCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 'i':
          iCount++;
          break;
        case 'o':
          oCount++;
          break;
        case 'u':
          uCount++;
          break;
      }

      i++;
    }
    //Display message
    System.out.println("There are: \n" +
    aCount +" a's \n" +
    eCount +" e's \n" +
    iCount +" i's \n" +
    oCount +" o's \n" +
    uCount +" u's \n" +
    "in \"" + sentence +"\""
    );
  }

  public static String displayLongestWord(String sentence) {
    String longestWord = "";
    int currentWordLength = 0;
    int maxWordLength = 0;

    int i = 0;
    int startOfLongestWord = 0;
    //Loop through sentence length
    while (i < sentence.length()) {
      char c = sentence.charAt(i);

      if (Character.isWhitespace(c)) {
        if (currentWordLength > maxWordLength) {
          maxWordLength = currentWordLength;
          startOfLongestWord = i - currentWordLength;
        }
        currentWordLength = 0;
      } else {
        currentWordLength++;
      }
      i++;
    }

    // Check the last word
    if (currentWordLength > maxWordLength) {
      startOfLongestWord = i - currentWordLength;
    }

    longestWord =
      sentence.substring(
        startOfLongestWord,
        startOfLongestWord + maxWordLength
      );
    return longestWord;
  }

  public static String displayMostVowelWord(String sentence) {
    String mostVowelWord = "";
    int maxVowelCount = 0;
    int currentWordVowelCount = 0;

    String currentWord = "";
    //Loop through sentence length
    for (int i = 0; i <= sentence.length(); i++) {
      char c = (i < sentence.length()) ? sentence.charAt(i) : ' ';

      if (Character.isWhitespace(c) || i == sentence.length()) {
        if (currentWordVowelCount > maxVowelCount) {
          maxVowelCount = currentWordVowelCount;
          mostVowelWord = currentWord.trim();
        }
        currentWordVowelCount = 0;
        currentWord = "";
      } else {
        currentWord += c;
        switch (Character.toLowerCase(c)) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            currentWordVowelCount++;
            break;
        }
      }
    }

    return maxVowelCount > 0
      ? mostVowelWord
      : "\"..there is no word with vowels.\"";
  }
}
