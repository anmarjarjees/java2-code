package guessing_games;

import java.util.Random;
// import java.util.Random; // for our first game to guess a random number
import java.util.Scanner;
// template => import package_name.ClassName

import inheritance_intro.AnyRandom;

public class AnyGuess {
    public static void main(String[] args) {
        /*
         * Game:
         * Part1: (Solved)
         * let the user guess a random number between 0 to 10
         * 
         * Part2: (our task)
         * let the user guess a random small letter
         * then check if it's the same as the random (small/capital) letter
         * we received from the computer
         */

        /*
         * Ask the user to choose between:
         * - Guessing a random number
         * - Guessing a random small letter
         * 
         * logic:
         * - ask
         * - using if else...
         */

        System.out.println("Guessing Games:");
        System.out.println("Game1: Guessing a random number\nGame2: Guessing a random letter");
        System.out.println("Enter 1 for game1 or 2 for game2");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        AnyRandom rand = new AnyRandom();

        if (choice == 1) {
            System.out.println("Game1: Guessing a random number");
            int compNumber = rand.nextInt(10); // 0 to 10
            // Game1 solution is solved (written) => NumberGuess.java2
            System.out.println("The random integer value is: " + compNumber);
        } else {
            /*
             * We will do just the first initial part together,
             * but I will let you do the rest by yourselves to enjoy the game :-)
             */
            System.out.println("Game2: Guessing a random letter");
            rand.nextSmallLetter();

            // Just for fun:
            // Anmar cannot be resolved to a type :-)
            // Anmar myName = new Anmar();

            char compSmallLetter = rand.nextSmallLetter();
            // Game2 in not solved (enjoy this task)
            System.out.println("The random small letter is: " + compSmallLetter);

            // Complete it...
        }
        sc.close();
    } // main()
}
