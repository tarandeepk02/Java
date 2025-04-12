import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Constants for conversion
        final double POUNDS_TO_KILOGRAMS = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Input height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert weight to kilograms and height to meters
        double weightKilograms = weightPounds * POUNDS_TO_KILOGRAMS;
        double heightMeters = heightInches * INCHES_TO_METERS;

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // Display BMI
        System.out.printf("BMI is %.2f\n", bmi);

        // Display Interpretation according to the given table
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
