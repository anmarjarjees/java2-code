package exceptions_part3;

/* 
 * When creating our own exceptions,
 * It's recommended to follow the same naming convention
 * (good coding practice)
 * by adding the word "Exception" at the end
 * 
 * Notice that this is our custom exception
 * we named it "OutOfRangeException" class
 * to be used with "CustomExDemo" class file
 * 
 * NOTE:
 * Any custom exception we create,
 * has to extend the main "Exception" class
 */
public class OutOfRangeException extends Exception {
    /*
     * To recall:
     * The constructor is the default method
     * to be executed when we create objects
     * 
     * Two Constructors:
     * - Custom One:
     * > for creating an instance of a custom exception with a specific error
     * message
     * - Default one (no parameters) to display the pre-defined message
     * 
     * Don't forget that with OOP,
     * we don't have to create/declare the default class constructor
     * if we:
     * - don't need to initialize or setting any value
     * - don't add any other custom constructor
     */

    public OutOfRangeException(String msg) {
        /*
         * Calling the Constructor from the superclass "Exception"
         * with the provided message "msg" to create exceptions with custom messages
         */
        super(msg);
    }

    /*
     * IMPORTANT NOTE TO REVIEW:
     * *************************
     * In Java, a constructor can call another constructor within the same class
     * by using "this" keyword
     * 
     * Below we have the default constructor (no parameters) "OutOfRangeException"
     * This constructor calls:
     * this("Input value has to be between the specified range of values")
     * which invokes/calls the constructor that takes a String argument.
     * 
     * For this reason, removing the custom constructor:
     * Compilation Error => The constructor OutOfRangeException(String) is undefined
     */
    public OutOfRangeException() {
        this("Input value has to be between the specified range of values");
    }

} // class

/*
 * Congratulation,
 * We have just created our own custom exception :-)
 */