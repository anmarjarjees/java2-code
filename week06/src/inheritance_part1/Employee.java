package inheritance_part1;

/*
 * "final", "static", "abstract" keywords are not part of "A PIE"
 * 
 * The keyword "final" can be used in several contexts:
 * - Final Class
 * - Final Variable
 * - Final Method
 * 
 * 1. Final Class:
 * - this class for example "Employee" CANNOT be extended (cannot be subclassed).
 * - this class can be used as blueprint to instantiate objects only
 * In other words, no class can inherit from "Employee"
 * 
 * NOTE:
 * It's valid to place "final" before/after the access modifier:
 * - public final class
 * - final public class
 * But The correct and logical placement of the "final" keyword when defining a final class 
 * is after the access modifier: 
 */
public final class Employee {
    /*
     * 2. Final Variable:
     * - Can only be assigned once. Once a final variable has been assigned,
     * it cannot be reassigned. It's exactly like "const" in JavaScript
     * - If a final variable is not initialized at the time of declaration,
     * it must be initialized in the constructor.
     */
    // Final variables "MAX_VALUE" and "MIN_VALUE"
    final int MAX_VALUE = 100;
    final int MIN_VALUE;

    // final String PROGRAM;
    /*
     * Error in the constructor:
     * The blank final field PROGRAM may not have been initialized
     */

    public Employee() {
        MIN_VALUE = 0;
    }

    /*
     * 2. Final Method:
     * - cannot be overridden by subclasses
     * - to prevent subclasses from altering the behaviour of a method
     */
    // Final method
    /*
     * NOTE:
     * Adding keyword "final" for a method inside a "final" class is useless!
     * as this class cannot be subclassed.
     */
    public final void show() {
        System.out.println("This is a final method");
    }
}

/*
 * Recap:
 * > Final Classes: Cannot be extended
 * > Final Variables: Constants, can be initialized only once
 * > Final Methods: Cannot be overridden by subclasses
 */