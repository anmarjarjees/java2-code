package inheritance_part1;

/*
 * Java has "Class Library":
 * Example: Scanner class => scan the input
 * 
 * "Random" class 
 * 
 * Some classes are part of the package "java.lang" (no need for importing)
 * We have other classes belong to other packages (need to be imported)
 * - "Scanner" => from the package "java.util"
 * - "Random" => from the package "java.util"
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Random class => Creates a new random number generator
        Random random = new Random();
        System.out.println(random); // java.util.Random@36baf30c

        /*
         * Every time we run the file,
         * numbers will be changed because they are randomly generated
         */
        System.out.println(random.nextInt()); // -857071360
        System.out.println(random.nextDouble()); // 0.0232522738699954
        System.out.println(random.nextFloat()); // 0.016653478
        System.out.println(random.nextBoolean()); // true

        // Task: random integer number (0 -26):
        System.out.println(random.nextInt(26)); // 0 - 26

        // we can use the casting operation
        /*
         * a = 97 and A = 65
         * Link: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
         * 
         * casting the numeric value to char => (char)
         */
        System.out.println((char) 97); // a
        System.out.println((char) 65); // A
        /*
         * there is no in Java a method
         * to generate random Alphabet Letter (A-Z) or (a-z)
         * 
         * Solution:
         * we can use inheritance to inherit the features of "Random" class
         * then customize it to add a random letter method to it :-)
         */

        // System.out.println(random.nextLetter()); // no such method :-(

        System.out.println("\nUsing Our Rand Class :-)");
        // creating an object "rand" of our custom class "Rand"
        // Since our "Rand" class extends "Random"
        Rand rand = new Rand();
        System.out.println(rand.nextSmallLetter());
        System.out.println(rand.nextCapitalLetter()); // "J" you can do it:
        /*
         * Good idea if we can use our same object "rand"
         * to generate for us random (int, double, float, bool,...);
         */
        System.out.println(rand.nextInt()); // -1878451607
        System.out.println(rand.nextDouble()); // 0.6198077037562593
        System.out.println(rand.nextFloat()); // 0.86119926
        System.out.println(rand.nextBoolean()); // true
    }
}
