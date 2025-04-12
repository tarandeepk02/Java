import java.util.Scanner;

public class StockSale {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Display heading
    System.out.println(
      "This program calculates the net proceeds from a sale of stock.\n"
    );

    // Input stock price
    System.out.print("Enter stock price: $");
    double stockPrice = scanner.nextDouble();

    // Input number of shares
    System.out.print("Enter number of shares: ");
    int numberShares = scanner.nextInt();

    // Input commission rate
    System.out.print("Enter commission rate (as a percentage): ");
    double commissionRate = scanner.nextDouble();

    // Calculations
    double valueOfShare = stockPrice * numberShares;
    double commission = valueOfShare * commissionRate / 100;
    double netProceeds = valueOfShare - commission;

    // Display output
    System.out.printf("\nValue of share: $%.2f %n", valueOfShare);
    System.out.printf("Commission: $%.2f %n", commission);
    System.out.printf("Net proceeds: $%.2f %n", netProceeds);
  }
}
