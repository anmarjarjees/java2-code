package bmi_calculation;

/*
Link: https://diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator
 */

// ALT+SHIFT+F => Format our Code (HTML, CSS, JS, Java, Python, C#) NO PHP :-(
/*
 * A PIE => The four pillars of OOP
 * OOP is based on 4 core concepts (pillars): 
 * - Abstraction
 * - Polymorphism
 * - Inheritance
 * - Encapsulation 
 */

// This is a utility class:
public class Patient {
    // 1. Class Properties/Attributes/fields: Variables inside a class
    /*
     * Access Modifiers (Visibility Modifiers): private, public, protected, default
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    // Encapsulation: make the class fields "private"

    // let's create our getters and setters manually:
    private String firstName; // null "" by default => empty string
    private String lastName; // null "" by default

    /*
     * Try to let VS code generate the getters and setters
     * for weight and height
     */
    private double weight; // 0.0d by default

    private double height; // 0.0d by default

    // private int age; // no need for this variable

    /*
     * Notice that this class doesn't have any custom constructor,
     * Java will invoke the default one that has no parameter
     */

    // 2. Getters and Setters Methods:
    /*
     * Getters => get the value of a private class field (property)
     * Setters => set (assign) a value to a private class field (property)
     * 
     * - Getters and Setters are simply just methods
     * - By convention: start with get and set
     * - are public to open the doors to access private field(s)
     * - Optional
     */

    // Getters:
    // Getter for firstName:
    public String getFirstName() {
        return firstName;
        // return this.firstName; // no need to add "this" in this case:
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // Setters:
    // Setter for firstName:
    public void setFirstName(String firstName) {
        // Using the keyword "this" inside any method
        this.firstName = firstName; // using "this" is mandatory
    }

    public void setLastName(String lName) {
        lastName = lName; // no need for "this"
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 3. Class Methods are listed below (if you have any):
    // Methods are functions inside a class
    public boolean isAdult(int age) {
        /*
         * To recap (in any programming language):
         * "return" keyword has two actions:
         * - return the value of any data type
         * - terminate (stop) the method: any code after "return" will NOT BE executed
         */
        if (age >= 18) {
            // do something
            return true;
            // it is like a "break" statement in for loop or switch() case block :-)
        }
        return false;
        // No thing here, no more extra code...
    } // isAdult()

    // Create another public method just for the blood sugar
    public void testBloodSugar() {
        // calculate...
    }

    // Create another public method just for the blood pressure
    public void testBloodPressure() {
        // calculate...
    }

    // Create another public method to just print the patient's information:
    public void printPatientInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("last Name: " + lastName);
    }

    /*
     * The keyword "static" (Quick review to be explained later)
     * let's add the keyword "static":
     * 
     * "static" makes this class member (property or method)
     * belongs to the Class itself (not the object of the class)
     * can only be accessed through the class name:
     * - ClassName.PropertyName
     * - ClassName.MethodName()
     */

    // Static Method => belongs to the class not its object:
    public static void printMsg() {
        System.out.println("Have a good day and stay safe!");
    }

    // Another example:
    public static void printDocInfo() {
        System.out.println("Doctor: Martin Smith");
        System.out.println("Dept: Senior Treatment");
    }

    // BMI
    // Link:
    // https://diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator
    /*
     * How to calculate Body Mass Index:
     * Body Mass Index is a simple calculation using a person’s height and weight.
     * The formula is BMI = kg/m x m
     * > kg is a person’s weight in kilograms
     * > m is their height in metres squared
     * 
     * 1 M = 100 CM
     * 180 CM => 180/100 = 1.8 M
     */

    // calculateBMI:
    public double calculateBMI() {
        // Height in CM: convert it to Meter
        // use the class property "height"
        double meter = height / 100; // Convert the the CM to M

        // BMI = kg/m x m
        // double bmi = weight / (meter * meter);

        // Or using a "static" method named "pow()"
        // that belongs to Java class named "Math"
        // the method pow() for the power:
        double bmi = weight / Math.pow(meter, 2);
        return bmi;
    }

    /*
     * Task: According the BMI Status website
     * create a method to return:
     * - "Overweight"
     * - "Normal Weight"
     * - "Underweight"
     * 
     * Follow these rules from the same website:
     * A BMI of 25.0 or more is "overweight",
     * while the healthy range is 18.5 to 24.9.
     * otherwise "underweight".
     * 
     * This method needs the value of the "BMI"
     * As programmers, we have to ways:
     * - Either calling "calculateBMI" method inside this method to get the BMI
     * value
     * - Simply we can pass the value of BMI as argument to the method in main code
     */
    public String getBMIStatus(double bmi) {
        /*
         * The logic/algorithm:
         * if BMI >=25 => "Overweight"
         * if BMI between 18.5 and 24.9 => "Normal Weight"
         * else => "Underweight"
         */
        return "Do it by yourselves :-)";
    }
} // class file
