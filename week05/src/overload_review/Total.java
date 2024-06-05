/* 
 The 4 principles of OOP => A PIE
 P => Polymorphism:
 - Overloading => 
 - Overriding =>
 */
package overload_review;

import java.util.ArrayList;

public class Total {

    // Create a method for adding two numbers:

    /*
     * Two options to access this public method:
     * - Create an object of class Total
     * - Using the keyword "static"
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /*
     * Overloading:
     * - Different Set of Parameters
     * - Different Data type of Parameters
     */
    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double add(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }

    public static String add(String text1, String text2) {
        return text1 + " " + text2;
    }

    /*
     * Good idea:
     * Create another add() method to accept a list of parameter
     * this method should accept any array/array list
     */
    public static double add(ArrayList<Double> anyArray) {
        /*
         * Enjoy the coding of this logic by finding the total of list:
         * Do it and let me know :-)
         */
        return 0.0;
    }

}
