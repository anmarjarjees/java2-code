package week10.p06_inheritance2;

/* 
 * Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class). 
 * Different kinds of objects often have a certain amount in common with each other.
 * link: https://www.w3schools.com/java/java_inheritance.asp
*/
public class Vehicle {
    // the Vehicle class has three fields
    // Private Fields CANNOT be accessed by the subclasses
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    public String province = "Ontario";

    /*
     * To read more:
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    protected boolean isPreOwned = false; // New Car

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
     * so if you "extends" this class, the subclass CANNOT be without a
     * constructor,
     * it must implement the same constructor from the parent class,
     * OR you can redefine the default one explicitly in the superclass
     * to make it available again,
     * in such case no need to write the constructor in the subclass
     */

    // Adding a default constructor explicitly:
    // public Vehicle() {
    // }

    // In PHP => public function __construct(...) { }
    // the Vehicle class has one constructor

    public Vehicle(String brand, String type, String wheels, int year) {
        this.brand = brand;
        // In PHP => $this->brand = $brand;
        this.type = type;
        this.wheels = wheels;
        this.year = year;
    }

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

    public void getVehicleInfo() {
        // we can add the "this" keyword, but no need!
        System.out.println("Brand: " + this.brand);
        System.out.println("type: " + this.type);
        System.out.println("wheels: " + wheels);
        System.out.println("year: " + year);
    }

    // we will add this method to get a record/list about the major recent
    // maintenance only
    public void getRecord(String fixPart, double cost) {
        System.out.println("What to fix: " + fixPart);
        System.out.println("Total Cost: " + cost);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

} // end class