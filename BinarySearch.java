import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    //Sample array
    char[] charArr = { 'a', 'a', 'c', 'f', 'g', 'i', 'k', 'm', 'p', 's' };
    int[] arr = { -3, 0, 2, 5, 7, 8, 11, 12, 12, 17 };
    char chi = 's';
    char ch2 = 'b';
    int num1 = 7;
    int num2 = -2;

    //Display message
    System.out.println("************************************");
    System.out.println("Sample Runs of Binary Search");
    System.out.println("************************************");

    System.out.println(
      "The index of " +
      chi +
      " in " +
      Arrays.toString(charArr) +
      " is " +
      binarySearch(charArr, chi)
    );
    System.out.println(
      "The index of " +
      ch2 +
      " in " +
      Arrays.toString(charArr) +
      " is " +
      binarySearch(charArr, ch2)
    );
    System.out.println(
      "The index of " +
      num1 +
      " in " +
      Arrays.toString(arr) +
      " is " +
      binarySearch(arr, num1)
    );
    System.out.println(
      "The index of " +
      num2 +
      " in " +
      Arrays.toString(arr) +
      " is " +
      binarySearch(arr, num2)
    );
  }

  // Binary search for integer array
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (list[mid] == key) { // If key is found at mid index
        return mid;
      }
      if (list[mid] < key) { // If key is greater then search the right half
        low = mid + 1;
      } else { // If key is smaller then search the left half
        high = mid - 1;
      }
    }
    // If key is not found then return the negative index where it should be inserted
    return -low - 1;
  }

  // Binary search for character array
  public static int binarySearch(char[] list, char key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (list[mid] == key) { // If key is found at mid index
        return mid;
      }
      if (list[mid] < key) { // If key is greater then search the right half
        low = mid + 1;
      } else {
        high = mid - 1; // If key is smaller then search the left half
      }
    }
    // If key is not found then return the negative index where it should be inserted
    return -low - 1;
  }
}
