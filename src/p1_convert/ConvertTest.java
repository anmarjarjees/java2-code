package p1_convert;

import java.util.Scanner;

public class ConvertTest {
    public static void main(String[] args) {
        // Enter '1' for weight converting, or '2' for temperature converting:
        /*
         * a) If the user input is 1  go to the if/case block to calculate the wanted
         * mass/weight value
         * b) If the user input is 2  go to the if/case block to calculate the wanted
         * temperature value
         */
        int conversion, conversionChoice;
        double tempValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for weight conversion , 2 for temp conversion");
        conversion = sc.nextInt();

        if (conversion == 1) {
            System.out.println("Enter the value of weight");
            tempValue = sc.nextDouble();
            System.out.println("Enter '1' for converting LB to KG '2' for KG to LB");
            conversionChoice = sc.nextInt();
            if (conversionChoice == 1) {
                double result = Convert.getMass(tempValue, 1);
                System.out.println(tempValue + "LB is" + result + "KG is");
            } else if (conversionChoice == 2) {
                double result = Convert.getMass(tempValue, 2);
                System.out.println(tempValue + "KG is " + result + "LB is");
            } else {
                System.out.println("User entered Invalid option! please enter 1 or 2 ");
            }
        } else if (conversion == 2) {
            System.out.println("Enter a temperature value:");
            tempValue = sc.nextDouble();

            System.out.println("Enter '1' for converting F to C, or '2' for converting C to F:");
            conversionChoice = sc.nextInt();

            if (conversionChoice == 1) {
                double result = Convert.getTemperature(tempValue, 1);
                System.out.println(tempValue + " F is " + result + " C");
            } else if (conversionChoice == 2) {
                double result = Convert.getTemperature(tempValue, 2);
                System.out.println(tempValue + " C is " + result + " F");
            } else {
                System.out.println("Invalid option! Please enter either 1 or 2.");
            }
        } else {
            System.out.println("Invalid option! Please enter either 1 or 2.");
        }

        sayHi();

        sayHello();
    } // end main()

    /*
     * private static double getMass(double weight, int choice) {
     * return 0.0;
     * }
     */

    // AM - Static/yes-no - Type - name
    private static void sayHi() {
        System.out.println("Say Hi!");
    }

    public static void sayHello() {
        System.out.println("Say Hi!");
    }
}
// end class
