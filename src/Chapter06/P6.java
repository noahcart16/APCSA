package Chapter06;

import java.util.Scanner;

/**
 * currency converter
 *
 * @author Noah Carter
 */
public class P6 {

    /**
     * it is a main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Euro Rate: ");
        double euroRate = input.nextDouble();
        System.out.print("Pound Sterling Rate: ");
        double poundSterlingRate = input.nextDouble();
        System.out.print("Yen Rate: ");
        double yenRate = input.nextDouble();
        String response = "";

        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen:");
            String code = input.next().toUpperCase();
            //switch (code) {
            // case "E":
            //     System.out.printf("%.2f dollars = %.2f Euros.\n", dollars, convert(dollars, euroRate));
            //      break;
            //   case "P":
            //      System.out.printf("%.2f dollars = %.2f Pound Sterlings.\n", dollars, convert(dollars, poundSterlingRate));
            //      break;
            //  case "Y":
            //      System.out.printf("%.2f dollars = %.2f Yen.\n", dollars, convert(dollars, yenRate));
            //      break;
            //}

            do {
                System.out.print("Are there more conversions to perform? ");
                response = input.next().toLowerCase();
            } while (!response.equals("yes") && !response.equals("no"));

        } while (response.equals("yes"));

    }

    /**
     * for converting currency
     *
     * @param dollars is a dollar variable
     * @param exchangeRate is the exchange rate
     * @return the converted currency
     */
    public static double convert(double dollars, double exchangeRate) {
        if (dollars > 100) {
            return 0.95 * dollars * exchangeRate;
        } else {
            return 0.90 * dollars * exchangeRate;
        }
    }
}
