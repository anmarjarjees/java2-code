package interfaces_intro;

/*
 * The "SeniorEmployee" class implements the "PaymentCalculator" interface,
 * providing specific implementations for the methods defined in the interface.
 * "SeniorEmployee" in this example represents employees with 10+ years of experience.
 */
public class SeniorEmployee implements PaymentCalculator {

    @Override
    public double calculateGross(double hours) {
        // Initialize a variable:
        // Providing a default value for a variable at the time of declaration

        // Initialize the variable "payRate" with the value of $35 per hour
        double payRate = 35;

        // Calculate pay per week: Hours x Pay Rate
        double payPerWeek = hours * payRate;
        return payPerWeek;
    }

    @Override
    public void doSomething(int i, double x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doSomething'");
    }

}
