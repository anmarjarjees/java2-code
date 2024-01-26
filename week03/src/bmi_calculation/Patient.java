package bmi_calculation;

/*
 * class Patient is a "utility" class
 * it's doesn't have the main() method
 */
public class Patient {
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
     */
    public Patient(String firstName, String lastName) {
        // Initializing the class fields:
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String lastName, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
    }

    // We need to explicitly add/declare the constructor that has no parameters:
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
     * In OOP, we have "Polymorphism" (Multi forms)
     * 
     * Polymorphism can be implemented in two different types:
     * - Overloading => in this class example
     * - Overriding => for later (Inheritance)
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
}
