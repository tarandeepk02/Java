import java.util.Scanner;

public class MultiDimensionalArrayDemo {

  public static void main(String[] args) {
    int[][] numbers = new int[6][6];
    int column = 0;
    initializeArray(numbers);
    System.out.println(
      "The two-dimensional array of 6 by 6 random numbers is:"
    );
    displayArray(numbers);
    System.out.println("The sum of elements of the array by columns is: ");
    System.out.println();
    int[] colSum = sumByColumn(numbers);
    //displaying the sum of elements by columns
    for (int i : colSum) {
      System.out.printf("%5d", i);
    }
    System.out.println();
    System.out.println();
    column = colWithLargestSum(colSum);
    System.out.println(
      "The column " + column + " has the largest sum of " + colSum[column]
    );
    System.out.printf(
      "\nThe average of the array elements is %.2f \n\n",
      getAverage(numbers)
    );
    displaySmallestAndLocation(numbers);
  }

  public static void initializeArray(int[][] matrix) {
    //Loop through array matrix
    for (int i = 0; i < matrix.length; i++) {
      //Set value of array
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 100);
      }
    }
  }

  public static void displayArray(int[][] matrix) {
    System.out.println("----------------------------------------------");
    System.out.println("----------------------------------------------");
    //Loop through array matrix and display matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + "\t"); // Use "\t" for tab spacing
      }
      System.out.println(); // Add a line break after each row
    }
    System.out.println("----------------------------------------------");
    System.out.println("----------------------------------------------");
  }

  public static int[] sumByColumn(int[][] matrix) {
    int[] sums = new int[matrix[0].length];

    for (int col = 0; col < matrix[0].length; col++) {
      int sum = 0;
      //Set value of array matrix
      for (int row = 0; row < matrix.length; row++) {
        sum += matrix[row][col];
      }
      sums[col] = sum;
    }
    return sums;
  }

  public static int colWithLargestSum(int[] sums) {
    int largestSum = 0;
    int largestSumIndex = 0;
    //Loop through array matrix
    for (int i = 0; i < sums.length; i++) {
      //Check if value is greater than largestSum
      if (sums[i] > largestSum) {
        largestSum = sums[i];
        //Set Index of array
        largestSumIndex = i;
      }
    }
    return largestSumIndex;
  }

  public static double getAverage(int[][] matrix) {
    int sum = 0;
    int totalElements = 0;

    // Loop through array matrix and calculate sum and count of elements
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
        totalElements++;
      }
    }

    // Avoid division by zero
    if (totalElements == 0) {
      return 0.0;
    }

    // Calculate and return the average
    return (double) sum / totalElements;
  }

  public static void displaySmallestAndLocation(int[][] matrix) {
    int smallestElement = Integer.MAX_VALUE;
    int rowIndex = 0;
    int colIndex = 0;
    for (int i = 0; i < matrix.length; i++) {
      //Loop through matrix
      for (int j = 0; j < matrix[i].length; j++) {
        //Check if value is less than smallest element
        if (matrix[i][j] < smallestElement) {
          //Set value of smallestElement
          smallestElement = matrix[i][j];
          //Set row and column index
          rowIndex = i;
          colIndex = j;
        }
      }
    }

    System.out.println(
      "The smallest element is " +
      smallestElement +
      " and is located in row " +
      rowIndex +
      " and column " +
      colIndex
    );
  }
}
