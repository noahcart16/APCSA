package Chapter02;

import java.util.Scanner;

/**
 * calculates interest
 *
 * @author Noah Carter
 */
public class C2_2 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
