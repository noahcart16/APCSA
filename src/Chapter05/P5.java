package Chapter05;

import java.util.Scanner;

/**
 * takes votes
 *
 * @author Noah carter
 */
public class P5 {

    /**
     * it is a main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vote;
        String q = "Q";
        String y = "Y";
        String n = "N";
        int yesVote = 0;
        int noVote = 0;
        int invalidVote = 0;

        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
        vote = input.next();

        if (vote.equalsIgnoreCase(q)) {
            System.exit(0);
        }
        while (!vote.equalsIgnoreCase(q)) {
            if (vote.equalsIgnoreCase(y)) {
                ++yesVote;
            } else if (vote.equalsIgnoreCase(n)) {
                ++noVote;
            } else {
                System.out.println("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
                ++invalidVote;
            }
            vote = input.next();
        }

        System.out.println("Yes votes: " + yesVote);
        System.out.println("NO votes: " + noVote);
        System.out.println("Invalid votes: " + invalidVote);
    }
}
