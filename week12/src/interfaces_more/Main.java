package interfaces_more;

/**
 * Main:
 * This class contains the main method to run our code.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Calculate base payment for 20 hours with $25 per hour
        double basePayment = employee.calculateBasePayment(25, 20);

        /*
         * Using the default method "calculateBonusPayment" two times:
         * - With custom bonus of 15%
         * - With default bonus of 10%
         */

        // Calculate custom bonus for a base payment with a 15% bonus
        double customBonusPayment = employee.calculateBonusPayment(basePayment, 15);

        // Calculate default bonus for a base payment
        double defaultBonusPayment = employee.calculateBonusPayment(basePayment, -1);

        // Output the 3 results individually:
        System.out.println("Base Payment (without bonus): " + basePayment);
        System.out.println("Salary after adding custom Bonus (15%): " + customBonusPayment);
        System.out.println("Salary after adding default Bonus (10%): " + defaultBonusPayment);
    } // main()
} // class