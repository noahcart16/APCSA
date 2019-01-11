package Chapter04;

import java.util.Scanner;

/**
 * declares wether a string is a substring of another string
 *
 * @author Noah Carter
 */
public class C4_2 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String s1tring;
        String s2tring = null;
        System.out.println("Enter string s1: ");
        s1tring = input.next();

        System.out.println("Enter string s2: ");
        s2tring = input.next();

        if (s1tring.contains(s2tring)) {
            System.out.println(s2tring + "is a substring of " + s1tring);

        } else {
            System.out.println(s2tring + " is not a substring of " + s1tring);
        }
    }

}
