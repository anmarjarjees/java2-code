package inheritance_part2;
/*
 * Create a superclass named "Vehicle"
 * then make two subclass the extend the class "Vehicle":
 * - Car is a Vehicle
 * - Truck is a Vehicle
 * - Airplane (Bad => Doesn't make sense)
 */

/* 
* Java Definitions: 
* A class that is derived from another class is called a "subclass" 
* (also a derived class, extended class, or child class). 
* 
* The class from which the subclass is derived is called a "superclass" 
* (also a base class or a parent class). 

- Java: Superclass and Subclass 
- PHP: Parent class and Child Class
 - C#: Base Class and Derived Class

in C++, class can inherit from multiple classes
In Java, C# => only one

* Different kinds of objects often have a certain amount in common with each other.
* link: https://www.w3schools.com/java/java_inheritance.asp
*/

/*
     * IMPORTANT NOTE FOR REVIEWING:
     * *****************************
     * Any class we create is shipped with a default constructor
     * (with no parameters) that implicitly being generated
     * when we create a new object.
     * 
     * Adding another/other custom constructor(s)
     * will override the default one
     * 
     * so if you "extends" this class, 
     * the subclass CANNOT be without a constructor,
     * it must implement the same custom constructor from the parent class,
     * OR you can redefine/create the default one explicitly in the superclass
     * to make it available again for all the subclasses,
     * in such case no need to write the constructor in the subclass
     */

public class Vehicle {
    // the Vehicle class has three fields
    /*
     * Examine the 3 common access modifiers (visibility):
     * - private
     * - public
     * - protected (to be used with the idea of inheritance)
     */
    /*
     * Private Members (Fields/Methods):
     * - CANNOT be accessed by the subclasses or any other classes
     * - CANNOT be transferred to the subclasses
     * - CANNOT be accessed outside the class "Vehicle"
     */
    //
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    /*
     * Public Members (Fields/Methods):
     * - can be accessed by any class inside the project
     * - for sure can be transferred to the subclasses :-)
     * - CAN be accessed by any other class
     */
    public String province = "Ontario";

    /*
     * To read more:
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */

    /*
     * Protected Members (Fields/Methods):
     * - CANNOT be accessed by any class ONLY the subclasses inside the project
     * - Can be transferred to the subclasses :-)
     */
    protected boolean isPreOwned = false;

    // our custom Constructor that has 4 parameters
    public Vehicle(String brand, String type, String wheels, int year) {
        this.brand = brand;
        this.type = type;
        this.wheels = wheels;
        this.year = year;
        // In PHP => $this->brand = $brand;
    } // constructor:

    // Adding a default "constructor" explicitly:
    /*
     * Question:
     * If any class is shipped with the default constructor (no parameter),
     * why we have/need to write it below?
     * 
     * Answer-part1:
     * When we add the custom constructor will disable the default one
     * Then we can ignore the default one in case if we don't want to use it in the
     * subclasses
     * 
     * Answer-part2:
     * we need again to declare the default one explicitly
     * because we need to use in the subclass, for example "Truck"
     */
    // public Vehicle() {
    // }

    // In PHP => public function __construct(...) { }
    // the Vehicle class has one constructor

    // the Vehicle class has four methods
    public void StartDriving() {
        System.out.println("Start Driving");
    }

    public void stopDriving() {
        System.out.println("Stop Driving");
    }

    public void turn(String direction) {
        System.out.println("Turn " + direction);
    }

    public void printVehicleInfo() {
        // we can add the "this" keyword, but no need!
        System.out.println("Brand: " + this.brand);
        System.out.println("type: " + this.type);
        System.out.println("wheels: " + wheels);
        System.out.println("year: " + year); // the make year
    }

    // we will add this method to get a record/list about the major recent
    // maintenance only
    public void printRecord(String fixPart, double cost) {
        System.out.println("\nRepair and Fix Report:");
        System.out.println("What to fix: " + fixPart);
        System.out.println("Total Cost: " + cost);
    }

    // One Example of using Getters and Setters:
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
} // class file
