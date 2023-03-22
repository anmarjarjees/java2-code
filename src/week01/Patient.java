package week01;

/* 
 * camelCase => firstName
 * PascalCase => Patient
 * snake_case => first_name
 * kabob-case => first-name (JS Frameworks)
 * 
 * Class can have two members:
 * - Properties => variables
 * - Methods => functions inside a class
 * 
 * Link: https://diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator
 * 
 * OOP => A PIE
 */
public class Patient {
    // 1. Class Properties/Attributes/fields:
    // It has 5 instance variables and accessibility levels

    // Access Modifiers: private, public, default, protected
    // using camelCase by convention

    public String firstName; // "" by default => empty string
    public String lastName; // "" by default

    // Encapsulation
    private double weight; // 0.0 by default
    private double height; // 0.0 by default
    // private int age; // no need for this variable

    // 2. Class Properties/Attributes/fields:
    /*
     * Create a method (function inside a class) that
     * takes one integer argument
     * Returns a boolean value => true / false
     * 
     * for example, method to check if the patient is adult 18 or over or no
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

    // Create another public method to just print the patient's information

    // Create another public method to to calculate Body Mass Index

    // Class Variables ==> can be used only inside the class

} // end Patient
