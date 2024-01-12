package week02;

import java.util.Scanner;

public class PatientTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * We have 3 patients
         * Alex Chow
         * Sam Simpson
         * Sally Grayson
         * andy x y
         * 
         * creating 3 objects (instances)
         * 
         */

        Patient p1 = new Patient();
        Patient p2 = new Patient();
        Patient p3 = new Patient();

        p1.setFirstName("Alex");
        p1.setLastName("Chow");

        p2.setFirstName("Sam");
        p2.setLastName("Simpson");

        p1.setWeight(70);
        p1.setHeight(130);

        double p1BMI = p1.calculateBMI();
        System.out.println("The BMI for P1: " + p1BMI);
        System.out.println("P1 is " + p1.getBMIStatus(p1BMI));

        Patient.printDocInfo();

        input.close();
    } // main()
} // class file
