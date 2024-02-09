package bmi_calculation;

// A PIE
public class PatientRun {
    // psvm => for public static void main
    public static void main(String[] args) {
        // first variable => object of type "Patient"
        // passing first and last names
        Patient p1 = new Patient("Alex", "Chow");

        // passing the first/last names and width/height
        Patient p2 = new Patient("Alexa", "Chow", 78, 173);

        // just empty object (no passing arguments) and using setters to set its values:
        Patient p3 = new Patient();

        p3.setFirstName(null);
        p3.setLastName(null);

        Patient p4 = new Patient();

        System.out.println("Patient First Name: " + p1.getFirstName());

        // Finally Chaining Class Methods:
        /*
         * We can chain the class method(s) through the constructor immediately!
         * Task: Create an new constructor and chaining printPatientInfo() method
         * 
         * NOTE: Chaining can be applied to Non-static methods
         * Otherwise:
         * The static method printDocInfo()
         * from the type Patient should be accessed in a static way
         */
        // new Patient().printMsg();

        new Patient().printPatientInfo();
        /*
         * Output:
         * First Name:null
         * last Name:null
         */

        new Patient("Sam", "Simpson").printPatientInfo();
        /*
         * Output:
         * First Name: Sam
         * last Name: Simpson
         */
    } // main()
} // class file
