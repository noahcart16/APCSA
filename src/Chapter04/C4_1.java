/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

import java.util.Scanner;

/**
 * Tells you about your francis tuttle enrollment
 *
 * @author Noah Carter
 */
public class C4_1 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String character;
        String major = null;
        String year = null;
        System.out.println("Enter two characters: ");
        character = input.next();

        if (character.contains("M")) {

            major = ("Mathematics");
        } else if (character.contains("C")) {
            major = ("Computer Science");
        } else if (character.contains("I")) {
            major = ("Information Technology");
        }

        if (character.contains("1")) {
            year = ("Freshman");
        } else if (character.contains("2")) {
            year = ("Sophmore");
        } else if (character.contains("3")) {
            year = ("Junior");
        } else if (character.contains("4")) {
            year = ("Senior");
        }
        System.out.println(major + " " + year);
    }
}
