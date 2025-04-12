import java.util.Scanner;

public class ArrayDemo {

  public static void main(String[] args) {
    int[] numbers = new int[20];
    initializeArray(numbers);
    System.out.println("The array of random numbers is:");
    displayArray(numbers);
    System.out.println(
      "The smallest number in the array is " + getSmallest(numbers)
    );
    System.out.println(
      "The average of the array elements is " + getAverage(numbers)
    );
    System.out.println(
      "The number of elements above average is " + countAboveAverage(numbers)
    );
    System.out.println("The array of random numbers in reverse is:");
    displayArrayReverse(numbers);
  }

  public static void initializeArray(int[] values) {
    int i;
    //Loop through array
    for (i = 0; i < values.length; i++) {
      //Set value of array
      values[i] = (int) (Math.random() * 100);
    }
    System.out.println(values);
  }

  public static void displayArray(int[] values) {
    int i;
    //Loop through array
    for (i = 0; i < values.length; i++) {
      //Print array
      System.out.print(values[i] + " ");
    }
    System.out.print("\n");
  }

  public static int getSmallest(int[] values) {
    int smallest = values[0];
    //Loop through array
    for (int i = 0; i < values.length; i++) {
      //Check for smallest number
      if (smallest > values[i]) {
        smallest = values[i];
      }
    }
    return smallest;
  }

  public static double getAverage(int[] values) {
    int arrayCount = values.length;
    double sum = 0.0;
    //Loop through array
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    //Calculate average
    double average = sum / arrayCount;
    return average;
  }

  public static int countAboveAverage(int[] values) {
    double average = getAverage(values);
    int count = 0;
    //Loop through array
    for (int i = 0; i < values.length; i++) {
      if (values[i] > average) {
        count++;
      }
    }
    return count;
  }

  public static void displayArrayReverse(int[] values) {
    //Loop through array in decrement order
    for (int i = values.length - 1; i >= 0; i--) {
      System.out.print(values[i] + " ");
    }
    System.out.print("\n");
  }
}
