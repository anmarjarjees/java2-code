package interfaces_more;

/*
 * WorkCalculator Interface:
 * This interface defines a method for calculating work hours
 */
public interface WorkCalculator {
    /*
     * "calculateBasePayment" method:
     * > Abstract method that must be implemented
     * by any class that implements this interface
     * > calculates the base payment based on the number of hours worked
     * and the payment per hour.
     * > The input is the payment per hour and the number of hours worked.
     * > The output is the base payment.
     */
    double calculateBasePayment(double paymentPerHour, double hours);
}