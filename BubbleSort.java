import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    //Display message
    System.out.println("************************************");
    System.out.println("Sample Runs of Bubble Sort");
    System.out.println("************************************");

    //Sample array
    double[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Original Array:");
    //Print original array
    printArray(arr);
    //Sort
    bubbleSort(arr);
    //Print sorted array
    System.out.println("\nSorted Array:");
    printArray(arr);
    //New line
    System.out.println();

    //Sample char array
    char[] chArr = { 'e', 'u', 'a', 'o', 'i' };
    System.out.println("Original Array:");
    //Print original array
    printArray(chArr);
    //Sort array
    bubbleSort(chArr);
    System.out.println("\nSorted Array:");
    //Print sorted array
    printArray(chArr);
  }

  // Bubble sort for double array
  public static void bubbleSort(double[] list) {
    int n = list.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // Check if current element is greater than next element
        if (list[j] > list[j + 1]) {
          // swap temp and arr[i]
          double temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }

  // Bubble sort for char array
  public static void bubbleSort(char[] list) {
    int n = list.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // Check if current character is greater then next character
        if (list[j] > list[j + 1]) {
          // swap temp and arr[i]
          char temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }

  // Method to print double array
  public static void printArray(double[] arr) {
    for (double value : arr) {
      System.out.print(value + " "); // Print each character followed by a space
    }
    System.out.println(); // Newline after printing array
  }

  // Method to print char array
  public static void printArray(char[] arr) {
    for (char value : arr) {
      System.out.print(value + " "); // Print each character followed by a space
    }
    System.out.println(); // Newline after printing array
  }
}
