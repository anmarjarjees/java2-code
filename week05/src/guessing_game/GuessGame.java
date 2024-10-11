package guessing_game;

// import java.util.Random; // for our first game to guess a random number
import java.util.Scanner;
// template => import package_name.ClassName

public class GuessGame {
    public static void main(String[] args) {
        /*
         * Game has two options:
         * Option#1: (Previously Solved - Previous Project)
         * let the user guess a random number between 0 to 10
         * 
         * Option#2: (our task)
         * let the user guess a random "small letter" (a...z)
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
        System.out.println("Game1: Guessing a random number (0..10)\nGame2: Guessing a random letter (a...z)");
        System.out.println("Enter 1 for game1 or 2 for game2");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        AnyRandom rand = new AnyRandom();

        if (choice == 1) {
            System.out.println("Game1: Guessing a random number (0..10)");
            int compNumber = rand.nextInt(10); // 0 to 10
            // Game1 solution is solved previously (previous lecture) => "NumberGuess.java"
            // Task#1: You can implement the logic again from the file "NumberGuess.java":
            System.out.println("The random integer value is: " + compNumber);
            System.out.println("Complect Task1 By Yourself :-)");
        } else {
            /*
             * We will do just the first initial part together,
             * but I will let you do the rest by yourselves to enjoy the game :-)
             */
            System.out.println("Game2: Guessing a random letter");
            rand.nextSmallLetter();

            // Just for fun :
            // Anmar cannot be resolved to a type :-)
            // Anmar myName = new Anmar();

            char compSmallLetter = rand.nextSmallLetter();
            // Game2 in not solved (enjoy this task)
            System.out.println("The random small letter is: " + compSmallLetter);

            /*
             * Task#2: Complete it by calling the class "AnyRandom.java"
             * (from the current package)
             */
            System.out.println("Complect Task2 By Yourself :-)");
        }
        sc.close();
    } // main()
}