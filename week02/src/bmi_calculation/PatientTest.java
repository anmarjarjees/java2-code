package bmi_calculation;

public class PatientTest {
    public static void main(String[] args) {
        System.out.println("Patient Info Application:");
        /*
         * We will add 3 patients:
         * - Alex Chow
         * - Sam Simpson
         * - Sally Grayson
         * 
         * Creating 3 objects (instances) for each patient
         * 
         * Using the "default" Constructor
         * to construct these new objects
         * 
         * the default constructor CANNOT accept any arguments:
         * new Patient()
         */
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        Patient p3 = new Patient(); // warning: not in use

        /*
         * By the help of the setters public methods,
         * we can assign values to these private properties:
         * - the private field "firstName"
         * - the private field "lastName"
         * - the private field "weight"
         * - the private field "height"
         */

        // first name:
        p1.setFirstName("Alex");
        // last name:
        p1.setLastName("Chow");

        p2.setFirstName("Sam");
        p2.setLastName("Simpson");

        // height and weight for one patient#1
        p1.setWeight(70);
        p1.setHeight(150);

        double p1BMI = p1.calculateBMI();
        System.out.println("The BMI for Patient#1: " + p1BMI);
        System.out.println("P1 is " + p1.getBMIStatus(p1BMI));

        /*
         * Warning: about this code
         * The static method printMsg() from the type Patient
         * should be accessed in a static way
         */
        // p1.printMsg(); // Bad Way! (incorrect way)
        Patient.printMsg();
    } // main()
} // class file