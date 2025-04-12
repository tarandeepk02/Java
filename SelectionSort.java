import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    //Sample array
    int[] arr = { 10, 40, 33, 65, -2, 8, 20, 30 };
    char[] chArr = { 'd', 'x', 'a', 'b', 'p', 'c', 'f', 'm' };
    //Display message
    System.out.println("************************************");
    System.out.println("Sample Runs of Selection Sort");
    System.out.println("************************************");

    System.out.println("Original Array:");
    //Print original array
    printArray(arr);
    //Sort
    selectionSort(arr);
    System.out.println("\nSorted Array:");
    //Print sorted array
    printArray(arr);
    System.out.println();

    System.out.println("\nOriginal Array:");
    //Print original array
    printArray(chArr);
    //Sort
    selectionSort(chArr);
    System.out.println("\nSorted Array:");
    //Print sorted array
    printArray(chArr);
    System.out.println();
  }

  // Selection sort for integer arrays
  public static void selectionSort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int minIndex = i; // Assume the current index holds the minimum value
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < list[minIndex]) {
          minIndex = j; // Update the minimum index if a smaller value is found
        }
      }
      // Swap the minimum element with the current element
      if (minIndex != i) {
        int temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
      }
    }
  }

  // Selection sort for character arrays
  public static void selectionSort(char[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int minIndex = i; // Assume the current index holds the minimum value
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < list[minIndex]) {
          minIndex = j; // Update the minimum index if a smaller value is found
        }
      }
      // Swap the minimum element with the current element
      if (minIndex != i) {
        char temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
      }
    }
  }

  // Method to print integer arrays
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // Method to print character arrays
  public static void printArray(char[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
