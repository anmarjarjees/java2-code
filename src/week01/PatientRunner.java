package week01;

public class PatientRunner {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         * Creating 3 instances (objects)
         */

        /*
         * we are instantiating a Patient object named "patient1"
         * using the default constructor => new ClassName()
         */
        Patient patient1 = new Patient();

        /*
         * objectName.property
         * objectName.method()
         */

        // Updating the values of the public instance variable
        patient1.firstName = "Alex";
        patient1.lastName = "Chow";

        // It outputs the value of the public instance variable
        System.out.println("First Patient: First name: " + patient1.firstName);
        System.out.println("First Patient: Last name: " + patient1.lastName);
        System.out.println("First Patient Full Name: " + patient1.firstName + " " + patient1.lastName);

        patient1.isAdult(18); // has no output

        System.out.println(patient1.isAdult(18));

        if (patient1.isAdult(18)) {
            System.out.println("This patient is adult");
        } else {
            System.out.println("This patient is underage");
        }

        Patient patient2 = new Patient();

        Patient patient3 = new Patient();
    } // main()
} // class file
