package inheritance_part2;
/*
 * the keyword for inheritance: is a
 * Car is a Vehicle => Yes => Inheritance Relationship
 * 
 * Error form Java:
 * Implicit super constructor Vehicle() is undefined for default constructor.
 * Must define an explicit constructor
 * 
 * In plain English :-)
 * If the superclass has a custom constructor (with parameters)
 * the subclass MUST also implement it
 */

/* 
 * OOP: A PIE
 * - Subclasses use "extends" keyword in the definition
 * - Subclasses can define new local methods or fields to use 
 * or can use the "super()" method and "super" keyword to call inherited methods or the super constructor. "super" keyword can be used to:
 * - Access parent class fields => super.fieldName
 * - Access parent class method => super.methodName()
 * - Using Constructors => creating a new instance of the parent class
 */
public class Car extends Vehicle {

    /*
     * Car inherits all the fields and methods of Vehicle,
     * and adds the fields: "fuelType" and "purchaseYear"
     */
    // Besides the 5 fields from the superclass (main/parent class):
    // the "Car" subclass adds two extra fields:
    private String fuelType;
    private int purchaseYear;

    /*
     * You can write a subclass constructor that invokes the constructor of the
     * superclass, either implicitly or by using the keyword "super"
     */
    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        /*
         * Java Error Message :-(
         * Implicit super constructor Vehicle() is undefined.
         * Must explicitly invoke another constructor
         * 
         * In plain English :-)
         * Java requires us to call the constructor from the super class
         * > we have to use a java keyword "super()"
         * > we have to pass the arguments for the required parameters
         * 
         * Implicit super constructor Vehicle() is undefined.
         * Must explicitly invoke another constructor
         */

        // we must call the constructor
        // calling parent class constructor:
        // (String brand, String type, String wheels, int year)
        super(brand, type, wheels, year);
        // Link: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        // Link: https://www.geeksforgeeks.org/super-keyword/

        /*
         * In PHP:
         * parent::__construct(...)
         * parent::__construct($brand, $type, $wheels, $year))
         */

        // continue with the same logic:
        // assign the parameters "fuelType" and "purchaseYear" to their class fields:
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    /*
     * Error MSG:
     * "Implicit super constructor Vehicle() is undefined.
     * Must explicitly invoke another constructor"
     * 
     * Same Solution :-)
     */
    public Car(String brand, String type, String wheels, int year) {
        super(brand, type, wheels, year);
    }

    // Getter/Setter for the class field "fuelType"
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    // Adding a new method for the class "Car" (we don't have it in the superclass)
    // Printing car specifications
    public void printCarSpecs() {
        /*
         * First: we need to call the method "getVehicleInfo()" from the super (parent)
         * class
         */
        printVehicleInfo(); // print the essential fields
        // Just adding our extra info:
        System.out.println("Fuel Type: " + fuelType);
        /*
         * trying to access the field "isPreOwned"
         * Error: The field Vehicle.isPreOwned is not visible
         */
        System.out.println("Car Status: " + isPreOwned);
    }

    /*
     * A PIE => Polymorphism has two types:
     * - Overloading
     * - Overriding
     * 
     * Overriding (Method Overriding):
     * By creating another method with the same name
     * from the super (original/main/parent) class:
     * Overrides printRecord() in Superclass
     * 
     * Reason: change it's behaviour/output
     */
    public void printRecord(String fixPart, double cost) {
        /*
         * NOTE:
         * Instead of coding these 3 print statements again!
         * we can just call their method printRecord() from the superclass
         * 
         * System.out.println("\nRepair and Fix Report:");
         * System.out.println("What to fix: " + fixPart);
         * System.out.println("Total Cost: " + cost);
         */

        // Passing String "fixPart", double "cost"
        super.printRecord(fixPart, cost);
        // Adding one extra info (customize the original method)
        System.out.println("Purchase Year: " + purchaseYear);
    } // printRecord()
    /*
     * IMPORTANT NOTE ABOUT "super" KEYBOARD:
     * **************************************
     * 
     * Consider the following please:
     * > printCarSpecs() = is calling => printVehicleInfo() from the superclass
     * > printRecord() = is calling => printRecord() from the superclass
     * 
     * getCarSpecs() is calling the method "getVehicleInfo()"
     * from the super class (parent) class "Vehicle"
     * just by referencing its name "getVehicleInfo()" [without "super" keyboard]
     * because the subclass "Car" doesn't have its own implementation of
     * "getVehicleInfo()"
     * 
     * printRecord() is calling the method "printRecord()" from the parent class
     * by using the "super" keyword then dot notation.
     * the "super" keyword is needed here because both (super class/subclass)
     * using the same method name "printRecord()"
     * so the program needs to know which version of the method to be used
     */
} // class file
