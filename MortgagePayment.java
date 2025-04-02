public class MortgagePayment {
    public static void main(String[] args) {
        // Input values
        double annualInterestRate = 2.75;  
        int numberOfYears = 24;           
        double mortgageAmount = 500000;   

        // Convert annual interest rate to monthly interest rate
        double mIR = annualInterestRate / 12 / 100;

        // Calculate monthly payment
        int numberOfPayments = numberOfYears * 12;
        double monthlyPayment = (mIR * mortgageAmount) / (1 - Math.pow(1 + mIR, -numberOfPayments));

        // Calculate total payment
        double totalPayment = monthlyPayment * numberOfPayments;

        // Calculate total interest paid to the bank
        double totalInterestPaid = totalPayment - mortgageAmount;

        // Calculate interest paid as a percentage of the mortgage amount
        double interestPercentage = (totalInterestPaid / mortgageAmount) * 100;


        System.out.printf("Given Annual Interest Rate: %.2f\n", annualInterestRate);
        System.out.printf("Given Number of Years: %2d\n", numberOfYears);
        System.out.printf("Given Morgage Amount: %.2f\n", mortgageAmount);


        // Display results
        System.out.printf("The monthly payment is $ %.2f\n", monthlyPayment);
        System.out.printf("The total payment is $ %.2f\n", totalPayment);
        System.out.printf("The total interest paid is $ %.2f\n", totalInterestPaid);
        System.out.printf("The interest percentage is %.2f%%\n", interestPercentage);
    }
}
