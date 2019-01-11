package Chapter04;

import java.util.Random;
import java.util.Scanner;

/**
 * stores information about bidders and calculates the winner of the auction
 *
 * @author Noah Carter
 */
public class P4 {

    /**
     * is a main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1;
        int hours1;
        double charged1;

        String name2;
        int hours2;
        double charged2;

        double totalcost1;
        double totalcost2;

        System.out.println("The details asked for below concern the first bidder ");
        System.out.println("Name: ");
        name1 = input.next();
        System.out.println("Hours: ");
        hours1 = input.nextInt();
        System.out.println("Rate per hour: ");
        charged1 = input.nextDouble();

        System.out.println("The details asked for below concern the Second bidder ");
        System.out.println("Name: ");
        name2 = input.next();
        System.out.println("Hours: ");
        hours2 = input.nextInt();
        System.out.println("Rate per hour: ");
        charged2 = input.nextDouble();

        totalcost1 = hours1 * charged1;
        totalcost2 = hours2 * charged2;

        if (totalcost1 < totalcost2) {
            System.out.println("The Winner is: " + name1);
            System.out.println("Total Cost: " + totalcost1);
        } else if (totalcost1 > totalcost2) {
            System.out.println("The Winner is: " + name2);
            System.out.printf("Total Cost: %.2f\n", totalcost2);
        } else if (totalcost1 == totalcost2 && hours1 < hours2) {
            System.out.println("The Winner is: " + name1);
            System.out.printf("Total Cost: %.2f\n ", totalcost1);
            System.out.println("Total Hours: " + hours1);
        } else if (totalcost1 == totalcost2 && hours2 < hours1) {
            System.out.println("The Winner is: " + name2);
            System.out.printf("Total Cost: %.2f\n ", totalcost2);
            System.out.println("Total Hours: " + hours2);
        } else if (totalcost1 == totalcost2 && hours2 == hours1) {
            System.out.printf("Both " + name1 + " and " + name2 + "have identical bids at " + hours1 + "hours at a rate of %.2f\n ", totalcost1);

        }

    }

}
