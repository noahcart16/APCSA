package Chapter03;

import java.util.Scanner;

/**
 * determines ether a number is a palindrome or not
 *
 * @author Noah Carter
 */
public class C3_2 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Enter a three didgit Number: ");
        int num = input.nextInt();

        n1 = num / 100;
        n2 = num % 10;

        if (n2 == n1) {
            System.out.println(num + " The number is a palendrome");
        } else {
            System.out.println(num + " The number is not a palendrome");
        }

    }

}
