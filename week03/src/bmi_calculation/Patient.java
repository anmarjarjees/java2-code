package bmi_calculation;

/*
 * class Patient is a "utility" class
 * it's doesn't have the main() method
 */
public class Patient {
    /*
     * Variables (fields) inside class are classified into two catagories:
     * - Instance Variables => can be accessed by the class objects (instances)
     * - Class Variables [static] => can only be accessed by the Class name
     */
    // 1. Class Properties/Attributes/fields:
    private String firstName; // "" by default => empty string
    private String lastName; // "" by default

    // Encapsulation
    private double weight; // 0.0 by default
    private double height; // 0.0 by default
    // private int age; // no need for this variable

    /*
     * Constructor: "Special" Method:
     * - To construct an object of the class (public)
     * - Has the same name as the class name
     * - Cannot have a return type
     * - Can be used for initializing the class fields (variables)
     */

    // Constructor Parameters: String firstName & String lastName
    public Patient(String firstName, String lastName) {
        // Initializing the class fields
        // the "this" refer to the instance fields
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String lastName, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
    }

    /*
     * OOP: A default constructor that has no parameters
     */

    // We need to "explicitly" add/declare the constructor that has no parameters:
    public Patient() {
        // nothing to initialize
    }

    /*
     * To recap:
     * We have three methods of constructor,
     * but each one has different set of parameters
     * 
     * When we have:
     * - The same method is declared more than one time inside the same class
     * - Each one has different set of parameters or different data types
     * This is called "Overloading"
     * 
     * In OOP => A PIE => "P" for "Polymorphism" (Multi forms)
     * 
     * Polymorphism can be implemented in two different types:
     * - Overloading (Compile Time)=> inside one class (in this class example)
     * - Overriding (Run Time)=> with inheritance (for later)
     */

    // Getters and Setters:
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Create another public method to just print the patient's information:
    public void printPatientInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("last Name: " + lastName);
    }

    // Static Method => belongs to the class not its object:
    public static void printMsg() {
        System.out.println("Have a good day and stay safe!");
    }
} // class file
