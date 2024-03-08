package inheritance_part3.package1;

/* 
 * Using this class as blueprint (template) to create object(s)
 * We don't add the main()
 */
public class Vehicle {
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    /*
     * public => It can be accessed by any class:
     */
    public String province = "Ontario";

    /*
     * IMPORTANT NOTE TO RECAP:
     * ************************
     * To make any member (field/method) from the parent class
     * sharable with the child class, this member CANNOT be "private"
     * to solve this issue in OOP, two solution:
     * 
     * 1) We can set this field to be "public",
     * in such case the subclass can access it.
     * But it will be also accessed from all the other classes also
     * and it's against the idea of "encapsulation"! so it's not the ideal solution
     * 
     * 2) We can use the keyword "protected",
     * which means this member can be accessed
     * from the child class or within the subclass but it cannot be accessed
     * outside the super class or outside the subclass
     * 
     * so the access "protected" is only for the children of the parent class
     * 
     * Below We set the "isPreOwned" instance field in Vehicle to a "protected"
     * access modifier.
     * If it was set to private like the other fields,
     * the subclass "Car" class would not be able to access it.
     * 
     * To read more,
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */

    /*
     * protected =>
     * - can ONLY be accessed by the subclasses:
     * - Any subclass (inside or outside the package)
     */
    protected boolean isPreowned = false; // New Car

    /*
     * no modifier: ("package level")
     * link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     * 
     * - can be accessed within the same class itself
     * - can be accessed by any class (include the subclass) BUT inside the same
     * package
     * - it's ONLY "public" for any class inside the "same package" (not inside the
     * project only)
     */
    String owner;
}
