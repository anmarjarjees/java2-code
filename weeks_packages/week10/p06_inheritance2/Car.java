package week10.p06_inheritance2;

/* 
 * OOP: A PIE
 * - Subclasses use "extends" keyword in the definition
 * - Subclasses can define new local methods or fields to use 
 * or can use the "super()" method and "super" keyword to call inherited methods or the super constructor. "super" keyword can be used to:
 * - Access parent class fields => super.fieldName
 * - Access parent class method => super.methodName()
 * - Using Constructors => creating a new instance of the parent class
 * 
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

    /*
     * You can write a subclass constructor that invokes the constructor of the
     * superclass, either implicitly or by using the keyword "super"
     */
    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        // In PHP parent::__construct(...)
        // (String brand, String type, String wheels, int year)
        super(brand, type, wheels, year); // calling parent class constructor
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Printing car specifications
    public void getCarSpecs() {
        /*
         * First, we need to call the method "getVehicleInfo()" from the parent class
         */
        getVehicleInfo();
        // Just adding our extra info:
        System.out.println("Fuel Type: " + fuelType);
        /*
         * trying to access the field "isPreOwned"
         * Error: The field Vehicle.isPreOwned is not visible
         */
        System.out.println("Car Status: " + isPreOwned);
    }

    // Creating another method with the name "getCarRecord"
    // from the original class:
    public void getCarRecord() {
        // Passing String "fixPart", double "cost"
        super.getRecord("Breaks", 869.73);
        System.out.println("Purchase Year: " + purchaseYear);
    }
    /*
     * NOTE ABOUT "super" keyword:
     * getCarSpecs() is calling the method "getVehicleInfo()" from the parent class
     * just by referencing its name "getVehicleInfo()" [without "super" keyboard]
     * because the subclass "Car" doesn't have its own implementation of
     * "getVehicleInfo()"
     * 
     * getRecord() is calling the method "getRecord()" from the parent class
     * by using the "super" keyword then dot notation.
     * the "super" keyword is needed here because both (super class/subclass)
     * using the same method name "getRecord()"
     * so the program needs to know which version of the method to be used
     */

}
