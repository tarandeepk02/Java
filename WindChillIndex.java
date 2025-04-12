import java.util.Scanner;

public class WindChillIndex {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // declare wind speed degree as constant
    final double windSpeedDegree = 0.16;

    // Display heading
    System.out.println("This program calculates the wind-chill index.\n");

    // Input temperature
    System.out.print("Enter the temperature in Celsius: ");
    double celsiusTemperature = scanner.nextDouble();

    // Check if temperature is valid
    if (celsiusTemperature < -50 || celsiusTemperature > 5) {
      System.out.println("Whoops: Temperature must be between -50°C and 5°C.");
      System.exit(0);
    }

    // Input wind speed
    System.out.print("Enter the wind speed kilometers per hour: ");
    int windSpeed = scanner.nextInt();

    // Check if temperature is valid
    if (windSpeed < 0 || windSpeed > 100) {
      System.out.println("Whoops: Wind speed must be between 0 and 100 km/h.");
      System.exit(0);
    }

    double windChillIndex;
    // Calculate wind chill index
    windChillIndex =
      13.112 +
      0.6215 *
      celsiusTemperature -
      11.37 *
      Math.pow(windSpeed, windSpeedDegree) +
      0.3965 *
      celsiusTemperature *
      Math.pow(windSpeed, windSpeedDegree);

    // Display output
    System.out.println("The wind chill index is " + (int) windChillIndex);

    scanner.close();
  }
}
