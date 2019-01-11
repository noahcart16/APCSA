package Chapter02;

import java.util.Scanner;

/**
 * calculates tip and tax total for the meal
 *
 * @author Noah Carter
 */
public class P2 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the meal:");
        double meal = input.nextDouble();

        System.out.println("Enter the price of the drink:");
        double drink = input.nextDouble();

        System.out.println("Enter the price of the dessert");
        double dessert = input.nextDouble();

        double tax = ((meal + drink + dessert) * .10);
        double tip = ((meal + drink + dessert + tax) * .15);
        double total = (meal + drink + dessert + tax + tip);

        System.out.println("tip:" + tip);
        System.out.println("tax:" + tax);
        System.out.println("total:" + total);
    }

}
