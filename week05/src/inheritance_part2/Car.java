package inheritance_part2;
/* 
 * OOP: A PIE
 * - Subclasses use "extends" keyword in the definition
 * - Subclasses can define new local methods or fields to use 
 * or can use the "super()" method and "super" keyword to call inherited methods or the super constructor. "super" keyword can be used to:
 * - Access parent class fields => super.fieldName
 * - Access parent class method => super.methodName()
 * - Using Constructors => creating a new instance of the parent class
 */

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
public class Car extends Vehicle {
    /*
     * Car inherits all the fields and methods of Vehicle and adds the
     * fields fuelType and purchaseYear
     */
    // Besides the three fields from the parent class:
    // the Car subclass adds two fields:
    private String fuelType;
    private int purchaseYear;

    public Car(String brand, String type, String wheels, int year) {
        /*
         * Implicit super constructor Vehicle() is undefined.
         * Must explicitly invoke another constructor
         * 
         * In plain English :-)
         * Java requires us to call the constructor from the super class
         * > we have to use a java keyword "super()"
         * > we have to pass the arguments for the required parameters
         */
        super(brand, type, wheels, year); // calling parent class constructor

        // Link: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        // Link: https://www.geeksforgeeks.org/super-keyword/
    }

    // Getter/Setter for the class field "fuelType"
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /*
     * You can write a subclass constructor that invokes the constructor of the
     * superclass, either implicitly or by using the keyword "super"
     */
    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        // In PHP parent::__construct(...)
        // (String brand, String type, String wheels, int year)
        super(brand, type, wheels, year); // First: calling parent class constructor

        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    // Adding a method for the class "Car"
    // Printing car specifications
    public void getCarSpecs() {
        /*
         * First: we need to call the method "getVehicleInfo()" from the parent class
         */
        getVehicleInfo(); // print the essential fields
        // Just adding our extra info:
        System.out.println("Fuel Type: " + fuelType);
        /*
         * trying to access the field "isPreOwned"
         * Error: The field Vehicle.isPreOwned is not visible
         */
        System.out.println("Car Status: " + isPreOwned);
    }

    /*
     * Overriding (Method Overriding):
     * By creating another method with the name from the original class:
     * Overrides printRecord() in Superclass
     */
    public void printRecord(String fixPart, double cost) {
        // Passing String "fixPart", double "cost"
        super.printRecord(fixPart, cost);

        // Adding one extra info (customize the original method)
        System.out.println("Purchase Year: " + purchaseYear);
    }
    /*
     * IMPORTANT NOTE ABOUT "super" KEYBOARD:
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
}
