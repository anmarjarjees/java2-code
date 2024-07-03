package inheritance_demo1;
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
 * OOP: A PIE => (I) for "Inheritance":
 * - Subclasses use "extends" keyword in the definition
 * - Subclasses can define their new local (private) fields or methods
 * 
 * 
 * Accessing/Invoking Superclass Constructor:
 * ******************************************
 * To use/access the constructor of the superclass,
 * we use the "super()" method:
 * - it's used to call the constructor of the superclass within the constructor of the subclass
 * - it must be the first statement in the constructor body
 * - it should provide arguments that match one of the constructors in the superclass
 * - it's specifically used to call constructors of the superclass, not other methods
 * 
 * Accessing/Invoking Superclass Methods and Variables:
 * ****************************************************
 * To access/invoke/call methods or fields defined in the superclass within the subclass,
 * we can simply access them directly by just mentioning the fieldName or methodName of the superclass.
 * But we have to use the "super" keyword when there is a name conflict:
 * field/method with the same name in both superclass and subclass
 * - Access parent class fields => super.fieldName
 * - Access parent class method => super.methodName()
 * 
 * Notice that we can still use the "super" keyword even if there is no name conflict,
 * but it will be unnecessary!
 */
public class Car extends Vehicle {
    /*
     * Car class inherits all the fields and methods of Vehicle class,
     * but only the "private" and "protected" ones
     * 
     * and adds the fields: "fuelType" and "purchaseYear"
     */
    // Besides the 5 fields from the superclass (main/parent class):
    // the "Car" subclass adds two extra/private fields:
    private int numberOfDoors; // Number of doors
    private String carType; // Type of car: SUV, Sedan, Van,...
    private String driveType; // Drive type: FWD, AWD

    /*
     * IMPORTANT NOTE:
     * ***************
     * Subclass constructor can invoke/call the desired constructor of the
     * superclass:
     * > "implicitly":
     * Calling the default/no parameter constructor without using super() method
     * 
     * > "explicitly" => By using super() method
     * 
     * As conclusion:
     * **************
     * The "implicit" approach (without super):
     * is good if the superclass has a no-argument constructor
     * and the initialization logic does not require additional steps
     * from the superclass constructor
     * 
     * The "explicit" approach (with super):
     * is good to explicitly choose which superclass constructor to call
     * and pass arguments to it if necessary
     * 
     * 
     * A Note from Oracle:
     * *******************
     * If a constructor does not explicitly invoke a superclass constructor,
     * the Java compiler automatically inserts a call to the no-argument constructor
     * of the superclass.
     * 
     * If the super class does not have a no-argument constructor,
     * you will get a compile-time error.
     */

    /*
     * Consider the following important Error Message Note:
     * ****************************************************
     * Java Error Message :-(
     * Implicit super constructor Vehicle() is undefined.
     * Must explicitly invoke another constructor
     * 
     * In plain English :-)
     * Since the superclass contains a custom constructor with parameter(s)
     * Java requires us to create constructor in the subclass that calls the
     * constructor of the superclass:
     */

    /*
     * When the superclass contains a custom constructor with parameters:
     * ******************************************************************
     * Class "Vehicle" contains a constructor with parameter(s)
     * If you "extends" this class "Vehicle",
     * the subclass CANNOT be without a constructor!
     * Java will throw the error that is mentioned above.
     * 
     * Two ways to solve it:
     * *********************
     * 1) The subclass must call/invoke the constructor
     * from the parent class either explicitly using "super()" or implicitly
     * 
     * 2) We can redefine/create the default constructor (with no parameter)
     * in the superclass to make it available again for all the subclasses,
     * in such case no need to write the constructor in the subclass
     */

    public Car(String brand, int year, boolean isPreowned, int purchasedYear, String fuelType, int numberOfDoors,
            String carType, String driveType) {
        /*
         * IMPORTANT NOTES TO RECALL:
         * **************************
         * - We can skip calling the constructor of the superclass explicitly
         * with super() and let Java calling the constructor implicitly
         * if the superclass has the no-argument constructor
         * 
         * - We must call the/a constructor of the superclass explicitly
         * with super() if the superclass does NOT the no-argument constructor
         */

        // JAVA => Constructor call must be the first statement in a constructor
        // Call to the superclass (Vehicle) constructor:
        super(brand, year, isPreowned, purchasedYear, fuelType);
        // Link: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        // Link: https://www.geeksforgeeks.org/super-keyword/

        /*
         * In PHP:
         * parent::__construct(...)
         * parent::__construct($brand, $type, $wheels, $year))
         */

        // continue with the same logic:
        // assign the other parameters to the private class fields:
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
        this.driveType = driveType;
    }

    /*
     * Error MSG:
     * "Implicit super constructor Vehicle() is undefined.
     * Must explicitly invoke another constructor"
     * 
     * Same Solution :-)
     */
    public Car(String brand, int year, boolean isPreowned, int purchasedYear, String fuelType) {
        // Call to the superclass (Vehicle) constructor:
        super(brand, year, isPreowned, purchasedYear, fuelType);
    }

    // Adding properties (Getter and Setter)
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    // Adding a new method for the class "Car" (we don't have it in the superclass)
    // Printing car specifications
    public void printCarSpecs() {
        /*
         * First: we need to call the method "getVehicleInfo()"
         * from the super (parent) class
         */
        printVehicleInfo(); // print the essential fields
        // Just adding our extra info:
        /*
         * trying to access the field "isPreOwned"
         * since it protected, we can access it.
         * if it was "private", Java will show this error
         * Error: The field Vehicle.isPreOwned is not visible
         * 
         * Also, we added the keyword "super", but it's unnecessary!
         */
        System.out.println("Car Status: " + super.isPreowned);
        System.out.println("Number of Doors: " + this.carType);
        System.out.println("Car Type: " + this.carType);
        System.out.println("Drive Type: " + driveType);
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
        System.out.println("Purchase Year: " + purchasedYear);
    } // printRecord()

    /*
     * IMPORTANT NOTE ABOUT "super" KEYBOARD:
     * **************************************
     * 
     * Consider the following please:
     * > printCarSpecs() => is calling "printVehicleInfo()" method of the superclass
     * > printRecord() => is calling => "printRecord()" method of the superclass
     * 
     * getCarSpecs() is calling the method "getVehicleInfo()"
     * from the super class (parent) class "Vehicle"
     * just by referencing its name "getVehicleInfo()" [without "super" keyboard]
     * because the subclass "Car" doesn't have its own implementation of
     * "getVehicleInfo()"
     * 
     * printRecord() is calling the method "printRecord()" from the parent class
     * by using the "super" keyword then dot notation.
     * the "super" keyword is needed(required) here
     * because both (superclass/subclass)
     * using the same method name "printRecord()"
     * so the program needs to know which version of the method to be used
     */

} // class file
