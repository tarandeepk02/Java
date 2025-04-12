import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Please choose a shape whose area is to be calculated:");
        System.out.println("1 for Circle");
        System.out.println("2 for Rectangle");
        System.out.println("3 for Triangle");

        // Read user choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Circle
                System.out.println("Calculating the area of a circle.");
                System.out.println("Please enter the radius: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.printf("The area of circle having radius of %.2f is: %.2f", radius, circleArea);
                break;

            case 2:
                // Rectangle
                System.out.println("Calculating the area of a Rectangle.");
                System.out.println("Please enter the length of the Rectangle: ");
                double length = scanner.nextDouble();
                System.out.println("Please enter the width of the Rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.printf("The area of Rectangle having length %.2f and width: %.2f is: %.2f", length, width,
                        rectangleArea);
                break;

            case 3:
                // Triangle
                System.out.println("Calculating the area of a Triangle.");
                System.out.println("Please enter the base of the Triangle: ");
                double base = scanner.nextDouble();
                System.out.println("Please enter the height of the Triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.printf("The area of Triangle having base %.2f and height: %.2f is: %.2f", base, height,
                        triangleArea);
                break;

            default:
                //Show message if choice is not 1,2,3
                System.out.println("The choice " + choice + " is not valid.");
        }
    }
}