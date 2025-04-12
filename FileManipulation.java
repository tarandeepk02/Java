import java.io.*;
import java.util.*;

public class FileManipulation {

  public static void main(String[] args) throws IOException {
    //create a Scanner for the user input
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Enter the name whose all occurences have to be removed from the file"
    );

    String inputName = input.next();
    System.out.println(
      "Total names in the file before removing all occurences of " +
      inputName +
      " are " +
      countWords("names.txt")
    );
    //remove all occurences of the word inputName from the file
    removeString("names.txt", inputName);
    System.out.println(
      "Total names in the file after removing all occurences of " +
      inputName +
      " are " +
      countWords("names.txt")
    );
  }

  public static int countWords(String filename) throws IOException {
    // Creating a file object
    File myFile = new File(
      "D:\\Langara\\Spring2024\\CPSC1150\\Lab8\\" + filename
    );
    int count = 0;

    // Checking if the file exists
    if (myFile.exists()) {
      // Creating a Scanner object to read from the file
      Scanner inputFile = new Scanner(myFile);

      // Counting words in the file
      while (inputFile.hasNext()) {        
          count++;
      }
      inputFile.close(); // Closing the Scanner object
    } else {
      // Print an error message
      System.out.println("File does not exist!");
      System.exit(1);
    }

    return count; // Returning the count of words
  }

  public static void removeString(String filename, String inputName)
    throws IOException {
    // Creating a file object
    File myFile = new File(
      "D:\\Langara\\Spring2024\\CPSC1150\\Lab8\\" + filename
    );

    // Checking if the file exists
    if (myFile.exists()) {
      // Creating a Scanner object
      Scanner inputFile = new Scanner(myFile);

      String word = " ";

      // Reading each line of the file
      while (inputFile.hasNext()) {
        word = inputFile.nextLine();
      }

      // Replacing occurrences with an empty string
      String str = word.replaceAll(inputName, "");

      // Writing the modified content back to the file
      PrintWriter writer = new PrintWriter(myFile);
      writer.println(str);
      writer.close(); // Closing the PrintWriter object

      inputFile.close(); // Closing the Scanner object
    } else {
      // Print an error message if the file does not exist and exit the program
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }
}
