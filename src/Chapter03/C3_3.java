package Chapter03;

import java.util.Scanner;
import java.util.Random;

/**
 * is a rock paper scissors game
 *
 * @author Noah Carter
 */
public class C3_3 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer;
        int person;
        System.out.println("Rock(0) Paper(1) Scissors:(2) ");
        person = input.nextInt();
        Random rand = new Random();

        computer = rand.nextInt(2) + 0;

        switch (person) {
            case 0:
                if (computer == 0) {
                    System.out.println("Draw");
                } else if (computer == 1) {
                    System.out.println("Lose");
                } else if (computer == 2) {
                    System.out.println("Win");
                }
                break;

            case 1:
                if (computer == 0) {
                    System.out.println("Win");
                } else if (computer == 1) {
                    System.out.println("draw");
                } else if (computer == 2) {
                    System.out.println("Lose");
                }
                break;

            case 2:
                if (computer == 0) {
                    System.out.println("Win");
                } else if (computer == 1) {
                    System.out.println("Lose");
                } else if (computer == 2) {
                    System.out.println("Draw");
                }
                break;
        }
    }

}
