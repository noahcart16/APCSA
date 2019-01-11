package Chapter05;

import java.util.Scanner;

/**
 * calculates the number of negative and positive numbers
 *
 * @author Noah Carter
 */
public class C5_1 {

    /**
     * it is a main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeCount = 0;
        int positiveCount = 0;
        double total = 0;

        System.out.println("Enter an integer, the input ends if it is 0; ");
        int x = input.nextInt();

        if (x == 0) {
            System.out.println("No numbers are entered except 0.");
            System.exit(0);
        }

        while (x != 0) {
            if (x > 0) {
                ++positiveCount;
                total += x;
            } else if (x < 0) {
                ++negativeCount;
                total += x;
            }
            x = input.nextInt();
        }

        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The totel is " + total);
        System.out.println("The average is " + (total / (positiveCount + negativeCount)));

    }
}
