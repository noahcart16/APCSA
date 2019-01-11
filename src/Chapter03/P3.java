package Chapter03;

import java.util.Scanner;

/**
 * states facts about the numbers and their relation to each other
 *
 * @author Noah Carter
 */
public class P3 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //What are the numbers?
        System.out.println("Enter the first Number: ");
        double first = input.nextDouble();

        System.out.println("Enter the second Number: ");
        double second = input.nextDouble();
        //What are the numbers relations?
        if (first < second) {
            System.out.println("The First number is less than the Second");

        }
        if (first > second) {
            System.out.println("The first is greater than the second");
        }
        if (first == second) {
            System.out.println("The first is equal to the second");
        }

        if (first <= second) {
            System.out.println("The first number is less than or equal to the second");

        }

        if (first >= second) {
            System.out.println("The first Number is greater than or equal to the second");
        }

        if (first != second) {
            System.out.println("The first Number is not equal to the second");
        }
        //Can it be divided?
        if (second == 0) {
            System.out.println("Cannot divide by zero");
        } else if (first / second < 1) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        //What is the grade
        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");

        } else if (first >= 60) {
            System.out.println("D");

        } else {
            System.out.println("F");
        }

        //Is it in Range?
        if ((second >= 1) && second <= 100) {
            System.out.println("In Range");

        } else if ((second <= 1) || second >= 100) {
            System.out.println("Out of Range");
        }
    }
}
