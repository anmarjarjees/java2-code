package patients; // we have a sub-folder named "patients"

/*
 * Java => Safe-type (strongly typed) language
 * camelCase => firstName
 * PascalCase => PatientInformation
 * snake_case => first_name (In Java, we use snake_case for package names)
 * kabob-case => first-name (JS Frameworks)
 * 
 * Class can have two members:
 * - Properties (Attributes) => variables inside a class
 * - Methods => functions inside a class
 * 
 * OOP => Object-Oriented Programming =>  A PIE
 */
public class Patient {
    // 1. Class Properties/Attributes/fields: variables inside a class

    /*
     * Two data types in Java:
     * > Primitive Data Types (Start with small letters): int, double, boolean,
     * float
     * > Reference Data Types (Start with Capital): String Class Names
     * 
     * Access Modifiers (Visibility Modifiers): private, public, protected, default
     */

    // using camelCase by convention
    // we should avoid using "public" if possible for properties
    public String firstName; // "" by default => empty string
    public String lastName; // "" by default

    // Encapsulation: using the access modifier "private"
    private double weight; // 0.0 by default for double
    private double height; // 0.0 by default
    private int age; // 0 by default for integers
    /*
     * NOTE:
     * Java Compiler gives us a warning for not using the private fields
     * As you have learned, warnings will not stop our application from being run
     */


    // 2. Class Methods: "function" inside a class
    /*
     * Task:
     * Create a method (function inside a class):
     * Check if the patient is 18+
     * if so => returns a boolean value of "true"
     * else => returns a boolean value of "false"
     * 
     * This method should takes one integer argument => the age
     * Returns a boolean value => true / false
     */
    public boolean isAdult(int age) {
        // the method code
        if (age >= 18) {
            // do something
            return true;
        } else {
            // do other thing
            return false;
        }
    }

    /*
     * We can summarize the long method "isAdult"
     * By using "Ternary Operator" :-)
     */
    public boolean isOldEnough(int age) {
        // instead of if/else block => just using ternary operator :-)
        return (age >= 60 ? true : false);
    }

    // Task: Create another "public" method to just print the patient's information

    // Create another public method to to calculate Body Mass Index

    // Class Variables ==> can be used only inside the class

} // end Patient class
