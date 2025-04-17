import java.util.Scanner;

public class CurrencyConverter{    


    public static double getExchangeRate(String base, String target) {
       
        switch (base + "_" + target) {
            case "USD_INR": return 83.20;
            case "INR_USD": return 0.012;
            case "USD_EUR": return 0.91;
            case "EUR_USD": return 1.10;
            case "USD_GBP": return 0.79;
            case "GBP_USD": return 1.26;
            case "EUR_INR": return 90.50;
            case "INR_EUR": return 0.011;
            case "GBP_INR": return 105.75;
            case "INR_GBP": return 0.0095;
            case "USD_JPY": return 153.25;
            case "JPY_USD": return 0.0065;
           
            default: return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter base currency (e.g., USD, INR): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., EUR, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

       
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

       
        double rate = getExchangeRate(baseCurrency, targetCurrency);

        if (rate == -1) {
            System.out.println("Currency conversion for this pair is not supported.");
        } else {
            double convertedAmount = amount * rate;
            System.out.printf("\n%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}
