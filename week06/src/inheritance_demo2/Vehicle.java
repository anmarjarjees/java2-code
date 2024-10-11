package inheritance_demo2;

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
 * IMPORTANT NOTE FOR REVIEWING:
 * *****************************
 * Any class we create is shipped with a default constructor
 * (with no parameters) that is implicitly generated
 * when we create a new object.
 * 
 * Adding another/other custom constructor(s)
 * will override the default one.
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
     * - CAN be transferred to the subclasses :-).
     * 
     * It CAN be accessed outside the class "Vehicle",
     * and can be accessed within any class.
     * 
     * Private Members (Fields/Methods):
     * *********************************
     * - CANNOT be accessed from outside the class, not even by subclasses
     * - CANNOT be transferred to the subclasses :-(
     * 
     * They CANNOT be accessed outside the class "Vehicle",
     * and are accessible only within the class they are declared in.
     * 
     * Protected Members (Fields/Methods):
     * ***********************************
     * - Can be accessed by any class within the same package,
     * whether or not they are a subclass.
     * 
     * - Can be accessed by subclasses, but only through an instance
     * of the subclass itself. This means:
     * - If a subclass is in a different package, it can access
     * its own inherited `protected` members, but cannot directly
     * access `protected` members of the superclass from another class.
     * 
     * - Classes outside their package cannot access `protected`
     * members directly, even if they are instances of subclasses.
     * Access must occur through methods (like getters) of the subclass
     * that expose those `protected` members.
     * 
     * To recap, "protected" members are accessible in these two cases only:
     * 1. Same Package: All classes in the same package.
     * 2. Subclasses: All subclasses can access `protected` members,
     * but only through their own instances and methods.
     */

    /*
     * The Vehicle class has 5 fields/attributes
     * Common Properties for every vehicle type/kind:
     * - brand
     * - year
     */
    protected String brand; // Brand of vehicle: Toyota, Nissan, etc.
    protected int year; // The make year (Year of manufacture)
    protected int purchasedYear; // Year the vehicle was purchased
    protected String fuelType; // Type of fuel (Petrol, Diesel, Electric)

    // Indicates if the vehicle is preowned
    // with initial value of "false"
    protected boolean isPreowned = false;
    /*
     * Please be advised that "boolean" fields are "false" by default.
     * Explicitly initializing it to "false" is not strictly necessary,
     * but it can improve code readability and clarify intent
     * to other developers who read the code.
     * 
     * At the end, it's a matter of preference and coding style :-).
     */

    /*
     * Notice that we declared all fields to be "protected".
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
        if (purchasedYear < year) {
            throw new IllegalArgumentException("Purchased year cannot be earlier than the manufacture year.");
        }
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
     * why do we need to write it below?
     * 
     * Reason:
     * ******
     * When we add a custom constructor, it will disable the default one,
     * so we need to explicitly define the constructor
     * with no-arguments/no-parameters.
     * 
     * Case#1:
     * We need to declare the default one explicitly
     * if we need to create a new object/instance without initialization.
     * 
     * Case#2:
     * We need to declare the default one explicitly
     * if we need to use it in a subclass, for example "Truck".
     */

    // Default constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.year = 2000;
        this.purchasedYear = 2000;
        this.fuelType = "Unknown";
        this.isPreowned = false; // Not strictly necessary but for clarity.
    }

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
        System.out.println("Year: " + year); // the make year
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Preowned: " + (isPreowned ? "Yes" : "No"));
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPurchasedYear() {
        return purchasedYear;
    }

    public void setPurchasedYear(int purchasedYear) {
        this.purchasedYear = purchasedYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", year=" + year + ", purchasedYear=" + purchasedYear +
                ", fuelType=" + fuelType + ", isPreowned=" + isPreowned + "]";
    }
} // class file
