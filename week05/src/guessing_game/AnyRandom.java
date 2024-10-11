package guessing_game;

import java.util.Random;

/* 
 * Our own custom Class name "AnyRandom":
 * to generate any random item:
 * - letters
 * - numbers
 * - boolean
 */

// to make our Rand class inherit from the Random
/* 
 * Inheritance => A PIE
 * - In Java: Rand => the subclass (C# base class) (PHP child class)
 * - In Java: Random => the superclass (C# derived class) (PHP parent class)
 * 
 * All the superclass members (properties and methods)
 * can be used/accessed by the subclass (except the private members)
 * 
 * We are extending all the members of Java built-in super-class "Random"
* and adding to them in our subclass "AnyRandom"
* 
* The "AnyRandom" class is a child of Random
* OR
* The "AnyRandom" class inherits from Random
* OR
* The "AnyRandom" class extends from Random
* 
* In Java we use these two keywords:
* - Super class
* - Sub-class
 */
public class AnyRandom extends Random {
    /*
     * Generate Random small/capital letters
     */
    Random random = new Random();

    /*
     * ASCII TABLE:
     * ************
     * a = 97 and A = 65
     * 26 letters in English
     * > minimum value is 97 for letter "a"
     * > minimum value is 65 for letter "A"
     * Link: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
     */

    /*
     * Our custom method to return a random small letter :-)
     */
    public char nextSmallLetter() {
        // nextInt(26) =>
        /*
         * The range of random numbers for small letters should be between 97 and 122
         * - small "a" has the value of 97
         * - small "z" has the value of 122
         * 
         * > nextInt(26) => random integer number between 0 to 26
         * > then adding 97
         */
        int randInt = random.nextInt(26) + 97;
        /*
         * if the random value is 0 => 0 + + 97 = 97 => "a"
         * if the random value is 2 => 2 + + 97 = 99 => "c"
         */

        /*
         * we need to convert (cast) this integer value
         * to its equivalent char value
         */
        return (char) randInt;
    }

    public char nextCapitalLetter() {
        // Enjoy the coding of this method...
        return 'A';
    }
}
