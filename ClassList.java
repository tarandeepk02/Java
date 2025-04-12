import java.io.*;
import java.util.*;

public class ClassList {

  static Scanner scanner = new Scanner(System.in);
  //Set File path globally
  static final String FILE_PATH =
    "classList.txt";

  public static void main(String[] args) {
    int choice;
    do {
      //Show choices message
      System.out.println(
        "Please enter your choice: \n" +
        "1: To display a specific student's record\n" +
        "2: To calculate the final average\n" +
        "3: To find a student with the highest score on the final exam\n" +
        "4: To find the number of student records having score greater than or equal to 90\n" +
        "5: To copy the students' record to another file\n" +
        "6: To terminate the program"
      );
      // Read user's choice
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          // Prompt user to enter student's name
          System.out.print("Please enter student's name: \n");
          String name = scanner.nextLine();

          try {
            // Call method to display student records by name
            displayStudentRecords(name);
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 2:
          try {
            // Call method to calculate final exam average
            finalExamAverage();
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 3:
          try {
            // Call method to find student with highest score
            studentWithHighestScore();
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 4:
          try {
            // Call method to find number of students with score >= 90
            studentWithGreaterScore();
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 5:
          try {
            // Call method to copy student records to another file
            copyStudentsRecord();
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 6:
          // Terminate the program
          System.out.println("The program terminates");
          break;
        default:
          // Show message for invalid choice
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    } while (choice != 6);
  }

  // Method to display student records by name
  public static void displayStudentRecords(String name) throws IOException {
    File myFile = new File(FILE_PATH);
    if (myFile.exists()) {
      Scanner inputFile = new Scanner(myFile);
      // Skipping the header line
      inputFile.nextLine();
      // Flag to indicate if the student record is found
      boolean search = false;

      while (inputFile.hasNextLine()) {
        //Get line from file
        String line = inputFile.nextLine();

        if (line.contains(name)) {
          String[] parts = line.split(":");
          // Display student record information
          System.out.println(
            "\nStudent record found. Here is the information: "
          );
          System.out.println("Student ID: " + parts[0]);
          System.out.println("Student Name: " + parts[1]);
          System.out.println("Final Score: " + parts[2] + "\n");
          search = true;
        }
      }

      if (!search) {
        // Not found message
        System.out.println("\nNo Matching record found.\n");
      }

      inputFile.close();
    } else {
      // File does not exits message
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }

  // Method to calculate final exam average
  public static void finalExamAverage() throws IOException {
    File myFile = new File(FILE_PATH);
    if (myFile.exists()) {
      Scanner inputFile = new Scanner(myFile);
      // Skipping the header line
      inputFile.nextLine();
      double total = 0;
      int count = 0;

      // Loop through file
      while (inputFile.hasNextLine()) {
        String line = inputFile.nextLine();
        String[] parts = line.split(":");
        double score = Double.parseDouble(parts[2]);
        // Get total and count values
        total += score;
        count++;
      }
      // Calculate average
      double average = total / count;
      System.out.println("The final exam average is " + average + "\n");

      inputFile.close();
    } else {
      // File does not exits message
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }

  // Method to find student with highest score
  public static void studentWithHighestScore() throws IOException {
    File myFile = new File(FILE_PATH);
    if (myFile.exists()) {
      Scanner inputFile = new Scanner(myFile);
      // Skipping the header line
      inputFile.nextLine();
      double highScore = -1;
      String highScoreName = "";
      String highScoreId = "";

      while (inputFile.hasNextLine()) {
        String line = inputFile.nextLine();
        String[] parts = line.split(":");
        double score = Double.parseDouble(parts[2]);

        // Calculate highscore
        if (score > highScore) {
          highScore = score;
          highScoreId = parts[0];
          highScoreName = parts[1];
        }
      }

      // Display information
      System.out.println("\nStudent with the highest score on exam:");
      System.out.println("Student ID: " + highScoreId);
      System.out.println("Name: " + highScoreName);
      System.out.println("Highest Score: " + highScore + "\n");

      inputFile.close();
    } else {
      // File does not exits message
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }

  // Method to find number of students with score >= 90
  public static void studentWithGreaterScore() throws IOException {
    File myFile = new File(FILE_PATH);
    if (myFile.exists()) {
      Scanner inputFile = new Scanner(myFile);
      // Skipping the header line
      inputFile.nextLine();
      int count = 0;

      while (inputFile.hasNextLine()) {
        String line = inputFile.nextLine();
        String[] parts = line.split(":");
        // Get score
        double score = Double.parseDouble(parts[2]);

        // Check score
        if (score >= 90) {
          count++;
        }
      }

      System.out.println(
        "Total number of student records having score greater than or equal to 90 is " +
        count +
        "\n"
      );

      inputFile.close();
    } else {
      // File does not exits message
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }

  // Method to copy student records to another file
  public static void copyStudentsRecord() throws IOException {
    // Prompt for file name
    System.out.println("Please enter the file name: ");
    String fileName = scanner.nextLine();

    File myFile = new File(FILE_PATH);
    PrintWriter outputFile = new PrintWriter(
      new File(        
        fileName
      )
    );

    if (myFile.exists()) {
      Scanner inputFile = new Scanner(myFile);
      // Skipping the header line
      inputFile.nextLine();
      int count = 0;

      // Loop through input file and print in output file path
      while (inputFile.hasNextLine()) {
        String line = inputFile.nextLine();
        outputFile.println(line);
        count++;
      }

      // Display messahe
      System.out.println(
        count + " records successfully copied to another file\n"
      );

      inputFile.close();
      outputFile.close();
    } else {
      // File does not exits message
      System.out.println("File does not exist!");
      System.exit(1);
    }
  }
}
