package inheritance_part1;

import java.util.Random;

/*
 * We cannot use the Java class "Random" with letters, only with numbers,
 * so we can convert the letter to its Decimal Code (numeric value)
 * in the ASCII Table
 * 
 *  Link: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
 * 
 *  For example:
* - small "a" has a decimal value of 97
* - small "z" has a decimal value of 122
* The range of random numbers for small letters should be between 97 and 122
 */

/*
* We are extending all the members of Java built-in super-class "Random"
* and adding to them in our subclass "Rand"
* 
* The "Rand" class is a child of Random
* OR
* The "Rand" class inherits from Random
* OR
* The "Rand" class extends from Random
* 
* In Java we use these two keywords:
* - Super class
* - Sub-class 
*/
public class Rand extends Random {
    /*
     * The super class "Random"
     * doesn't have the method: nextLetter()
     * 
     * we can add it to the sub-class
     */

    // Adding our custom method to generate a random small letter a - z
    // let's try to make the small letter:
    public char nextSmallLetter() {
        Random random = new Random();
        // using .nextInt(26) => so in such case it will be between 0 and 26
        // int randomInt = random.nextInt(26); // between 0 to 26

        /*
         * Since we know that the minimum letter "a" has the decimal value of 97
         * so we can just add 97 to the generated random value!
         */
        int randomInt = random.nextInt(26) + 97;
        // casting (converting the int number to its equivalent char value)
        return (char) randomInt;
    }

    // Enjoy this task :-)
    public char nextCapitalLetter() {
        return 'J'; // J for "Java"
    }

    /*
     * We have build this class with two methods"
     * = to generate a random small letter
     * = to generate a random upper letter
     * 
     * Our class is named "Rand" for Random
     * should give us the methods to generate random numbers!
     * 
     * instead of creating these methods (re-invent the wheel)
     * we can just use the ones that available in Java class "Random"!
     * 
     * solution:
     * we can just make our class extend the class "Random"
     */
} // class file
