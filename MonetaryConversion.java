public class MonetaryConversion {
    public static void main(String[] args){
        double input;        
        int dollars;
        int quarters;
        int dimes;
        int nickels; 
        int pennies;

        input = 39.78;

        double inputVal = (int)(input * 100);

        dollars = (int)inputVal / 100;
        quarters = (int)(inputVal % 100) / 25;
        dimes = (int)((inputVal % 100) % 25) / 10;
        nickels = (int)(((inputVal % 100) % 25) % 10) / 5;
        pennies = (int)(((inputVal % 100) % 25) % 10) % 5;

        System.out.printf("Given amount is: %.2f %n", input);
        System.out.println(dollars+ " dollars");
        System.out.println(quarters+ " quarters");
        System.out.println(dimes+ " dimes");
        System.out.println(nickels+ " nickels");
        System.out.println(pennies+ " pennies");
    }
}
