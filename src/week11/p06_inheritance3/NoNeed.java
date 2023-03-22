package week11.p06_inheritance3;

public class NoNeed {
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    /*
     * To make any member (field/method) from the parent class
     * sharable with the child class, this member CANNOT be "private"
     * to solve this issue in OOP, two solution:
     * 1) we can set this field to be public, in such case the extended/sub class
     * can access it. But it will also accessed from outside the class
     * and it's against the idea of "encapsulation"! so it's not the ideal solution
     * 
     * 2) we can use the keyword "protected",
     * which means this member can be accessed
     * from the child class or within the sub class but it cannot be accessed
     * outside the super class or outside the sub class
     * 
     * so the access "protected" is only for the children of the parent class
     * 
     * Below We set the "isPreOwned" instance field in Vehicle to a "protected"
     * access modifier.
     * If it was set to private like the other fields,
     * the driven "Car" class would not be able to access it.
     * 
     * To read more,
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    protected boolean isPreOwned = false; // New Car

    // In PHP => public function __construct(...) { }

    // default constructor => explicitly creating the default constructor
    public NoNeed() {

    }

    // the Vehicle class has only custom constructor
    public NoNeed(String brand, String type, String wheels, int year) {
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