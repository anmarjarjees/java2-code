package bmi_calculation;

// A PIE
public class PatientRun {
    // psvm
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

    }
}
