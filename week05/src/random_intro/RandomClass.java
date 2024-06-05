package random_intro;

/*
 * Review:
 * *******
 * Java has "Class Library" which a library of several built-in classes
 * Example: Scanner class => scan the input
 * 
 * There is also a "Random" class => generates random numeric or boolean values
 * 
 * Some classes are part of the package "java.lang" (no need for importing)
 * We have other classes belong to other packages (need to be imported)
 * 
 * Examples:
 * - "Scanner" => from the package "java.util"
 * - "Random" => from the package "java.util"
 */
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        /*
         * Let the computer generates for us this secret number
         * 
         * use a class "Random"
         */
        // Random class:
        Random random = new Random();
        /*
         * Random class has different methods to generate random:
         * - int value
         * - double value
         * - float value
         * - boolean value
         * - etc...
         * 
         * But it doesn't have methods for random letters!
         * no methods for generating random small/capital letter (A-Z)
         */

        // Examples:
        /*
         * Notice that every time we run the file,
         * these numbers will be changed because they are randomly generated
         */
        System.out.println(random.nextInt()); // -857071360
        System.out.println(random.nextDouble()); // 0.0232522738699954
        System.out.println(random.nextFloat()); // 0.016653478
        System.out.println(random.nextBoolean()); // true

        /*
         * Let's try to generate random small or capital letters!!!
         * there is no in Java a method
         * to generate random Alphabet Letter (A-Z) or (a-z)
         * No such methods in Java "Random" Class :-(
         */

        // random.nextSmallLetter(); // <= no such method
        // Error => The method nextSmallLetter() is undefined for the type Random

        // Task: random integer number (0 -26): Adding limits [0 to 26]
        System.out.println(random.nextInt(26)); // 0 - 26

        System.out.println(random.nextInt(26)); // 0 to 26
        System.out.println(random.nextInt(100)); // 0 to 100

        // We can also customize the limit => minimum (origin) and maximum (bound):
        // Task: random integer number (10 -20)
        System.out.println(random.nextInt(10, 20)); // 16
    }
}
