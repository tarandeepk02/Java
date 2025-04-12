import java.util.Scanner;

public class TwinPrimes {

  public static void main(String[] args) {
    //Loop from 2 to 100
    for (int i = 2; i <= 100 - 2; i++) {
      //Check if number is prime or not
      if (isPrime(i) && isPrime(i + 2)) {
        //Display output
        System.out.println("(" + i + ", " + (i + 2) + ")");
      }
    }
  }

  /** Return true if num is prime. */
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
