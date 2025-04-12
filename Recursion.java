import java.util.Scanner;

import javafx.beans.binding.When;

public class Recursion {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("********************************************");
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    System.out.print("The reversal of " + num + " is ");
    reverseDisplay(num);
    System.out.println();

    System.out.println("********************************************");
    System.out.print("Enter a string: ");
    input.nextLine();
    String str = input.nextLine();
    System.out.print("The reversal of \"" + str + "\" is ");
    reverseDisplay(str);
    System.out.println();

    System.out.println("********************************************");
    int[] list1 = new int[6];
    System.out.print("Enter 6 integers: ");
    for (int i = 0; i < 6; i++) list1[i] = input.nextInt();
    cube(list1);
    System.out.print("The cubes of the elements are: ");
    for (int i = 0; i < 6; i++) System.out.print(list1[i] + " ");
    System.out.println();

    System.out.println("********************************************");
    int[] list2 = new int[5];
    System.out.print("Enter 5 integers: ");
    for (int i = 0; i < 5; i++) list2[i] = input.nextInt();
    System.out.println("The largest element is " + largest(list2));

    System.out.println("********************************************");
    input.nextLine();
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    char[] items = s.toCharArray();
    System.out.print("Enter a character: ");
    char ch = input.nextLine().trim().charAt(0);
    System.out.println(ch + " appears " + count(items, ch) + " times");
  }

  // Reverses and displays an integer
  public static void reverseDisplay(int value) {
    if (value < 10) {
      System.out.print(value);
    } else {
      System.out.print(value % 10);
      reverseDisplay(value / 10);
    }
  }

  // Reverses and displays a string
  public static void reverseDisplay(String value) {
    if (value.length() > 1) {
      System.out.print(value.charAt(value.length() - 1));
      reverseDisplay(value.substring(0, value.length() - 1));
    } else {
      System.out.print(value);
    }
  }

  // Cubes each element in an array
  public static void cube(int[] list) {
    cube(list, 0, list.length - 1);
  }

  // Recursive method for cube(int[] list, int low, int high)
  public static void cube(int[] list, int low, int high) {
    if (low <= high) {
      // Cube the current element
      list[low] = list[low] * list[low] * list[low];
      // Recursively call cube function for the next element
      cube(list, low + 1, high);
    }
  }

  // Finds the largest integer in an array
  public static int largest(int[] list) {
    return largest(list, 0, list.length - 1);
  }

  // Recursive method for largest(int[] list, int low, int high)
  public static int largest(int[] list, int low, int high) {
    // Case when the array has only one element
    if (low == high) return list[low];
    // Calculate the middle index
    int mid = (low + high) / 2;
    // Recursively find the largest in the first half
    int max1 = largest(list, low, mid);
    // Recursively find the largest in the second half
    int max2 = largest(list, mid + 1, high);
    // Return the maximum of the two halves
    return Math.max(max1, max2);
  }

  // Finds the number of occurrences of a specified character in an array
  public static int count(char[] chars, char ch) {
    return count(chars, ch, chars.length - 1);
  }

  // Recursive method for count(char[] chars, char ch)
  public static int count(char[] chars, char ch, int high) {
    // Case when there are no elements left in the array
    if (high < 0) return 0;
    // Check if the character matches with the current element
    int occurrences = chars[high] == ch ? 1 : 0;
    // Recursively call count function
    return occurrences + count(chars, ch, high - 1);
  }
}
