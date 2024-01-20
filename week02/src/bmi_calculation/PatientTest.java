package bmi_calculation;

public class PatientTest {
    public static void main(String[] args) {
        /*
         * We have 3 patients
         * Alex Chow
         * Sam Simpson
         * Sally Grayson
         * 
         * creating 3 objects (instances)
         * 
         * Using the default Constructor
         * to construct these new objects
         * 
         * the default constructor CANNOT accept any arguments
         */
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        Patient p3 = new Patient(); // warning: not in use

        /*
         * By the help of the setters public methods,
         * we can assign values to these objects:
         */

        // first names
        p1.setFirstName("Alex");
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
        // p1.printMsg();
        Patient.printMsg();
    }
}