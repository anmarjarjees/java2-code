package exceptions_part3;

/* 
 * When creating our own exceptions,
 * It's recommended to follow the same naming convention
 * (good coding practice)
 * by adding "Exception"
 * 
 * Notice that this is our custom exception
 * we named it "OutOfRangeException" class
 * to be used with "C3CustomExDemo" class file
 * 
 * it has to extend the "Exception" class
 * 
 */
public class OutOfRangeException extends Exception {
    /*
     * The constructor is the default method
     * to be executed when we create objects
     * 
     * Two Constructors:
     * - Default one (no parameters)
     * - Custom One that accept a message
     * 
     * Don't forget that with OOP,
     * we don't have to create/declare the default class constructor
     * if we:
     * - don't need to initialize or setting any value
     * - don't add any other custom constructor
     */
    public OutOfRangeException() {
        this("Input value has to be between the specified range of values");
    }

    public OutOfRangeException(String msg) {
        // calling the Constructor from the superclass "Exception"
        // to pass the "msg"
        super(msg);
    }
} // class
