package week02;

// A PIE => 
public class Patient {
    // 1. Class Properties/Attributes/fields:
    private String firstName; // "" by default => empty string
    private String lastName; // "" by default

    // Encapsulation
    private double weight; // 0.0 by default
    private double height; // 0.0 by default
    // private int age; // no need for this variable

    /*
     * Getters => get the value of a class field
     * Setters => set (assign) a value to a class field
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // let's create our setLastName manually:
    public void setLastName(String lName) {
        lastName = lName;
    }

    // setters for weight and height
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 3. Class Methods are listed below
    public boolean isAdult(int age) {
        // the method code
        if (age >= 18) {
            // do something
            return true;
        } else {
            // do other thing
            return false;
        }
    }

    // Create another public method to just for the blood sugar
    public void testBloodSugar() {
        // calculate
    }

    // Create another public method to just for the blood pressure
    public void testBloodPressure() {
        // calculate
    }

    // Create another public method to just print the patient's information
    public void printPatientInfo() {
        System.out.println("First Name:" + firstName);
        System.out.println("last Name:" + lastName);
    }

    // BMI
    // Link:
    // https://diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator
    /*
     * How to calculate Body Mass Index:
     * Body Mass Index is a simple calculation using a person’s height and weight.
     * The formula is BMI = kg/m x m
     * where kg is a person’s weight in kilograms
     * and (m)2 is their height in metres squared.
     * 
     * 1 M = 100 CM
     * 180 CM => 180/100 = 1.8 M
     */
    public double calculateBMI() {
        // Example user can input 180 CM
        double meter = height / 100; // convert the CM to M
        double bmi = weight / (meter * meter);
        // OR:
        double bmi2 = weight / Math.pow(meter, 2);
        return bmi;
    }

    /*
     * A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9.
     */
    public String getBMIStatus(double bmi) {
        if (bmi >= 25) {
            return "overweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "normal";
        } else {
            return "underweight";
        }
    }

    // Static Method => belongs to the class not its object:
    public static void printDocInfo() {
        System.out.println("Doctor Name: Martin Smith");
        System.out.println("Dept: Senior Treatments");
    }

} // end Patient
