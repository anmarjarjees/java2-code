package patients;

/*
 * This file for calling the class "Patient"
 * and run the application for "patients" package
 * we named it "PatientRunner":
 * 
 * Since this class file will be the entry-point
 * to run our application for the Patient project
 * we have to add the main() method here:
 */
public class PatientRunner {
    // main() method is the entry-point to run our application
    public static void main(String[] args) {
        /*
         * Creating 3 instances (objects)
         */

        /*
         * We are instantiating a Patient object named "patient1"
         * using the default "Constructor" => new ClassName()
         * 
         * Constructor:
         * A special method that are being called and triggered automatically
         * when creating a new instance of a class
         */
        Patient patient1 = new Patient();

        /*
         * Using the dot notation to access the class member:
         * objectName.property
         * objectName.method()
         */

        // calling this method below to check the default values for the variables:
        patient1.testDefaultValues();

        // Updating the values of the public instance variable
        patient1.firstName = "Alex";
        patient1.lastName = "Chow";

        // Concatenation:
        // It outputs the value of the public instance variable
        System.out.println("First Patient: First name: " + patient1.firstName);
        System.out.println("First Patient: Last name: " + patient1.lastName);
        System.out.println("First Patient Full Name: " + patient1.firstName + " " + patient1.lastName);

        patient1.isAdult(18); // has no output

        System.out.println(patient1.isAdult(18)); // true/false

        // Since this method returns a boolean value:
        // we can use it in the if condition:
        if (patient1.isAdult(18)) {
            System.out.println("This patient is adult");
        } else {
            System.out.println("This patient is underage");
        }

        // Creating two more instances (objects):
        Patient patient2 = new Patient();

        Patient patient3 = new Patient();

        /*
         * A note from "Oracle" about "Local variables":
         * The compiler never assigns a default value to an uninitialized local
         * variable.
         * If you cannot initialize your local variable where it is declared,
         * make sure to assign it a value before you attempt to use it.
         * Accessing an uninitialized local variable will result in a compile-time
         * error.
         */
        int myLocalVariable;
        // System.out.println(myLocalVariable);
        // The local variable myLocalVariable may not have been initialized
    } // main()
} // class file
