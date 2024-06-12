package inheritance_part1;
/*
 * OOP => A PIE
 * Create a superclass named "Vehicle"
 * then make other subclass that extend the class "Vehicle":
 * - "Car" is a Vehicle
 * - "Truck" is a Vehicle
 * - "Motorcycle" is a Vehicle
 * - "Airplane" is a Vehicle (Bad => Doesn't make sense)
 * - 'is a' OR 'is a type of'
 */

/* 
* Java Definitions: 
* A class that is derived from another class is called a "subclass" 
* (also a derived class, extended class, or child class). 
* 
* The class from which the subclass is derived is called a "superclass" 
* (also a base class or a parent class). 

 * In Java:
 * - Vehicle => Superclass
 * - Car => subclass
 * 
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
*/

public class Vehicle {
    /*
     * Examine the 3 common access modifiers (visibility):
     * - private
     * - public
     * - protected (to be used with the idea of inheritance)
     */
    /*
     * Public Members (Fields/Methods):
     * ********************************
     * - CAN be accessed by the subclasses or any other classes
     * - CAN be transferred to the subclasses :-)
     * 
     * It CAN be accessed outside the class "Vehicle",
     * I can be accessed within any class
     * 
     * Private Members (Fields/Methods):
     * *********************************
     * - CANNOT be accessed from outside the class, not even by subclasses
     * - CANNOT be transferred to the subclasses :-(
     * 
     * They CANNOT be accessed outside the class "Vehicle",
     * They are accessible only within the class they are declared in.
     * It can ONLY be accessed within the same class "Vehicle"
     * 
     * Protected Members (Fields/Methods):
     * ***********************************
     * - Can be accessed by any class within the "same package" (folder),
     * as well as by "subclasses" in "any package",
     * regardless of whether the subclass is in the same package or not.
     * - CANNOT be accessed by classes outside their package,
     * except by subclasses
     * - Can be transferred to the subclasses in any package within a project :-)
     */

    /*
     * The Vehicle class has 5 fields/attributes
     * Common Properties for every vehicle type/kind:
     * - brand
     * - year
     */
    protected String brand; // Brand of vehicle: Toyota, Nissan, ..
    protected int year; // The make year (Year of manufacture)
    protected int purchasedYear; // Year the vehicle was purchased
    protected String fuelType; // Type of fuel (Petrol, Diesel, Electric)

    // Indicates if the vehicle is preowned
    // with initial value of "false"
    protected boolean isPreowned = false;
    /*
     * Please be advised that "boolean" fields are "false" by default,
     * Explicitly initializing it to "false" is not strictly necessary.
     * But it can improve code readability and make the intention clearer
     * to other developers who read the code.
     * 
     * At the end, it's a matter of preference and coding style :-)
     */

    /*
     * Notice that we declared all fields to be "protected",
     * "protected" allows subclasses to access these fields directly,
     * while restricting access from classes outside of the inheritance hierarchy.
     * 
     * This is a design choice that provides a balance between encapsulation
     * and inheritance.
     * 
     * To read more:
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */

    /*
     * Our custom Constructor that has 5 parameters
     * to initialize the class fields:
     */
    public Vehicle(String brand, int year, int purchasedYear, String fuelType, boolean isPreowned) {
        this.brand = brand;
        this.year = year;
        this.purchasedYear = purchasedYear;
        this.fuelType = fuelType;
        this.isPreowned = isPreowned;
        // In PHP => $this->brand = $brand;
    } // constructor:

    // Adding a default "constructor" explicitly:
    /*
     * Question:
     * *********
     * If any class is shipped with the default constructor (no parameter),
     * why we have/need to write it below?
     * 
     * Reason:
     * *******
     * When we add the custom constructor, it will disable the default one,
     * So we need to explicitly define the constructor
     * with no-arguments/no-parameters
     * 
     * Case#1:
     * we need again to declare the default one explicitly
     * if we need to create a new object/instance without initialization
     * 
     * Case#2:
     * we need again to declare the default one explicitly
     * if we need to use it in a subclass, for example "Truck"
     */

    // Try to remove/add the comment from this no-argument constructor:
    /*
     * public Vehicle() {
     * 
     * }
     */

    // In PHP => public function __construct(...) { }
    // the Vehicle class has one constructor

    // the Vehicle class has 5 common methods
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void startDriving() {
        System.out.println("Started Driving");
    }

    public void stopDriving() {
        System.out.println("Stopped Driving");
    }

    public void turn(String direction) {
        System.out.println("is turning " + direction);
    }

    public void printVehicleInfo() {
        // we can add the "this" keyword, but no need!
        System.out.println("Brand: " + this.brand);
        System.out.println("year: " + year); // the make year
        System.out.println("Fuel Type: " + fuelType);
    }

    /*
     * we will add this method to get a record/list
     * about the major recent maintenance only
     */
    public void printMaintainRecord(String fixPart, double cost) {
        System.out.println("\nRepair and Fix Report:");
        System.out.println("What to fix: " + fixPart);
        System.out.println("Total Cost: " + cost);
    }

    /*
     * Example of "Properties" using Getters and Setters:
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
} // class file
