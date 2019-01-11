package Chapter03;

import java.util.Scanner;

/**
 * calculates what day a future day is based off of the current day and the
 * number of days from now
 *
 * @author Noah Carter
 */
public class C3_1 {

    /**
     * Is a main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's Day: ");
        int day = input.nextInt();

        System.out.println("Enter the future Day: ");
        int elapsed = input.nextInt();

        int futureday = ((day + elapsed) % 7);

        if (day == 0) {
            System.out.println("Today is Sunday");

        }

        if (day == 1) {
            System.out.println("Today is Monday");

        }

        if (day == 2) {
            System.out.println("Today is Tuesday");

        }

        if (day == 3) {
            System.out.println("Today is wednesday");

        }

        if (day == 4) {
            System.out.println("Today is Thursday");

        }

        if (day == 5) {
            System.out.println("Today is Friday");

        }

        if (day == 6) {
            System.out.println("Today is Saturday");

        }
        if (futureday == 0) {
            System.out.println("The future day is Sunday");

        }

        if (futureday == 1) {
            System.out.println("The future day is Monday");

        }

        if (futureday == 2) {
            System.out.println("The future day is Tuesday");

        }

        if (futureday == 3) {
            System.out.println("The future day is Wendesday");

        }

        if (futureday == 4) {
            System.out.println("The future day is Thursday");

        }

        if (futureday == 5) {
            System.out.println("The future day is Friday");

        }

        if (futureday == 6) {
            System.out.println("The future day is Saturday");

        }

    }

}
