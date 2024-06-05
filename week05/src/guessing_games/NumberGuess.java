package guessing_games;

// The import statement for "Scanner" is needed
/* 
 * We do need to import this class
 * in order to use it
 */
import java.util.Scanner;

import java.util.Random;

/* 
 * NOTE:
 * All classes from the package "java.util"
 * need to be imported to be used 
 */

public class NumberGuess {
    public static void main(String[] args) {
        /*
         * Game Description:
         * ******************
         * - The computer will generate a random number (0 - 10)
         * - Ask the user to guess this lucky/secret number :-)
         * - Keep asking till the user enters the right number
         * - Count how many try it took to guess the number
         */

        // Random class:
        Random random = new Random();

        int compNumber = random.nextInt(10); // between 0 to 10

        Scanner sc = new Scanner(System.in);
        /*
         * We will keep asking, till we enter the secret/random number!
         * 
         * keep asking => looping or iteration
         * - We cannot use for loop, we don't have specific number of iteration
         * - we can ONLY use either while or do/while
         * > while will never run if the condition is false
         * > do/while will run at least one time even if the condition is false
         */

        // using while or do while
        /*
         * using doWhile/While:
         * - ask the user to input/put the number
         * - check if user number = the random number
         * then:
         * - break or stop the while/do while
         * - display a nice message
         * - if the input number not the same as the random number
         * then:
         * - ask the user again, and again...
         * - counter for counting how many tries
         */
        boolean keepAsking; // will be act as a "flag variable"
        int count = 0;
        do {
            System.out.println("Guess the secret number between 0 and 10");
            int userNumber = sc.nextInt();

            // if the user number is equal to the computer number
            if (userNumber == compNumber) {
                System.out.println("Good! the secret number is " + userNumber);
                keepAsking = false;
            } else {
                System.out.println("Try again!");
                keepAsking = true;
            }
            /*
             * We can use a variable with descriptive name
             * - will be true => to keep looping/asking if user couldn't guess the number
             * - will be false => to stop looping/asking if user guessed the number
             */

            count++;
        } while (keepAsking);

        System.out.println("It took " + count + " time(s) to guess the number");

        sc.close();
    } // main()
}
