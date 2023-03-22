package week04.p01_classes;

/*
 * Working with a class named "Car"
 * An object is any entity that has:
 * - state 
 * - behavior
 * 
 * Example:
 * Car is an object. It has
 * States: sedan, 4-weal, white, etc...
 * Behaviors: driving, braking, turn left, turn right, ... 
 */
public class Car {
    // Member Variables: data (Instance Variables or Class Variables [static])
    /*
     * Encapsulation:
     * To keep all/some members hidden from the outside the class.
     * Which means this member cannot be accessed outside the class itself
     * we can do it using the keyword "private"
     * 
     * NOTE:
     * Any class member (fields and method)
     * are defaulted to be "public"
     * if we don't specify the access modifier
     */
    private String brandName;
    private int year;
    private String type;
    private String model;

    // Constructor for setting the values:
     // Constructor Parameters: String branName, int year, String carType, String carModel
    public Car(String branName, int year, String carType, String carModel) {
        // the "this" refer to the instance fields
        this.brandName = branName;
        this.year = year;

        // Notice: below no need to use the keyword "this"
        // However using "this" will give a clear idea about the class
        type = carType;
        model = carModel;
    }

    public void getInfo() {
        System.out.println(
                "brandName: " + brandName + ". Year: " + year + " Car Type: " + type + ". Car Model: " + model);
        /*
         * in PHP:
         * echo "<p>brandName $brandName</p>";
         * echo "<p>brandName ".$brandName."</p>";
         */
        // System.out.println(Car.carInfo());
    }

    public void moveForward() {

    }

    public void moveBackward() {

    }

    public void turnRight() {

    }

    public void turnLeft() {

    }

    public void stop() {

    }

    /*
     * We can override the toString() method:
     * 
     * Using @override Annotation:
     * Annotations, a form of metadata, provide data about a program that is not
     * part of the program itself. Annotations have no direct effect on the
     * operation of the code they annotate.
     * 
     * When overriding a method, you might want to use the @Override
     * annotation that instructs the compiler that you intend to override a method
     * in the superclass. If, for some reason, the compiler detects that the method
     * does not exist in one of the superclasses, then it will generate an error.
     * Link: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
     */

    @Override
    public String toString() {
        /*
         * We can omit the user of "this" keyword
         */
        // return "Name is: " + this.name + " Fav Food: " + this.favFood;
        return "BranName: " + brandName + ". Year: " + year + " Car Type: " + type + ". Car Model: " + model;
    }
} // end class file
