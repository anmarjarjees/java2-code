package example_randomize;

/*
our class needs to be imported:
using the same keyword "import"
*/
import inheritance_part1.Rand;

public class Guessing {
    public static void main(String[] args) {
        /*
         * Instead of using the Java "Random":
         * Random ra = new Random();
         * int randNumber = ra.nextInt(10); // bound => maximum is 10
         * 
         * we can use our custom class "Rand"
         */
        Rand myRandom = new Rand();
        int randNumber = myRandom.nextInt(10); // bound => maximum is 10

        System.out.println("Guess the random number between 0 and 10");
        // complete it ....
        /*
         * using doWhile/While:
         * - ask the user to input to put the number
         * - check if input number = the random number
         * then:
         * - break the while/do while
         * - display a nice message
         * - if the input number not the same a the random number
         * then:
         * - ask the user
         * - counter for counting how many tries
         */

        char randChar = myRandom.nextSmallLetter();
        System.out.println("Guess a letter between a and z");
        // complete it ....
    }
}
