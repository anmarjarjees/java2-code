package patients; // we have a sub-folder named "patients"

// OOP => Object-Oriented Programming =>  A PIE
/*
 * To recap, any Class can have two members:
 * - Properties (Attributes/Class Fields) => variables inside a class
 * - Methods => functions inside a class
 * 
 * In Java, the terms "fields," "properties," and "attributes" are often used interchangeably,
 * but they can different in some ways:
 *  
 * 1. Fields: 
 * Are variables that belong to a class. Fields are defined directly within the class body.
 * Fields can have different access modifiers: private, protected, public
 * 
 * 2. Properties: 
 * Might also refer to fields, but they can imply encapsulation, 
 * typically when using "getter" and "setter" methods. 
 * Properties are often associated with the combination of a private field 
 * and public getter/setter methods.
 * 
 * 3. Attributes: 
 * This term is also commonly used to refer to fields or properties within a class.
 */
public class Patient {
    // 1. Class Properties/Attributes/Class fields: variables inside a class

    /*
     * To recap, two data types in Java:
     * > Primitive Data Types (Start with small letters): int, double, boolean,
     * float
     * > Reference Data Types (Start with Capital): String Class Names
     * 
     * "Primitive" Data Types:
     * > Have default values
     * > can NOT contain "null" values
     * > are built into the Java language and are not objects
     * 
     * 
     * "Reference" data types:
     * > more complex data types that store references (memory addresses) to
     * objects.
     * > used with complex data structures
     * 
     * 
     * The choice between which one to use depends on various factors, like:
     * - memory usage
     * - performance considerations
     * - the nature/use of the data being manipulated
     * - Collections library like ArrayList, HashMap, LinkedList
     * 
     * Link:
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */

    /*
     * Class fields as
     * Link:
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */

    /*
     * Access Modifiers (Visibility Modifiers):
     * - private
     * - public
     * - protected
     * - default (empty )=> nothing is specified!
     * 
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    // using camelCase by convention
    // we should avoid using "public" if possible for properties
    public String firstName; // "" by default => empty string
    public String lastName; // "" by default

    /*
     * NOTE: Class fields have default values:
     * 
     */

    /*
     * OOP => 4 pillars => A PIE
     * 
     * Encapsulation:
     * To keep all/some members hidden from outside the class.
     * Which means this member cannot be accessed outside the class itself
     * we can do it using the keyword "private"
     * 
     * "Encapsulation": example using "private"
     * 
     * NOTE:
     * Any class member (fields and method)
     * are defaulted to be "public"
     * if we don't specify the access modifier
     */

    // Encapsulation: using the access modifier "private"
    private double weight; // 0.0 by default for double
    private double height; // 0.0 by default
    private int age; // 0 by default for integers
    private boolean isObese; // false by default
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
        return (age >= 60 ? true : false); // return => return a value and terminate the method
        // Just for testing:
        // Error: Unreachable code
        // System.out.println("I am in wrong place :-( after the return!!!");
    }

    // Just for testing the default values of the class field:
    // Link:
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    public void testDefaultValues() {
        System.out.println(firstName); // null
        System.out.println(weight); // 0.0
        System.out.println(age); // 0
        System.out.println(isObese); // false
    }

    // Tasks for the next project:
    // Create another "public" method to just print the patient's information

    // Create another public method to to calculate Body Mass Index

    // Class Variables ==> can be used only inside the class

} // end Patient class
