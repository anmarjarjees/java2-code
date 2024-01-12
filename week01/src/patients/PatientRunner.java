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
         * we are instantiating a Patient object named "patient1"
         * using the default "constructor" => new ClassName()
         */
        Patient patient1 = new Patient();

        /*
         * Using the dot notation to access the class member:
         * objectName.property
         * objectName.method()
         */

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

        // creating two more instances (objects):
        Patient patient2 = new Patient();

        Patient patient3 = new Patient();
    } // main()
} // class file
