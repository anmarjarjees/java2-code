package interfaces_more;

/**
 * This class implements both "WorkCalculator" and "BonusCalculator" interfaces.
 * It provides specific implementations for calculating work hours and bonuses
 * for employees.
 * 
 * To recall:
 * - class "Employee" must implement all the methods in both interfaces,
 * Otherwise Error:
 * "The type Employee must implement the inherited abstract method"
 */
public class Employee implements WorkCalculator, BonusCalculator {

    @Override
    public double calculateBasePayment(double paymentPerHour, double hours) {
        /*
         * Calculate the gross payment by:
         * multiplying the payment per hour by the number of hours worked
         */
        return paymentPerHour * hours;
    }

}
