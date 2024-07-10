package interfaces_intro;

/* 
 * Ask ourselves:
 * is "JuniorLevel" is a "PaymentCalculator"?
 * There is no direct connection between the two classes!
 * 
 * However, we can make "JuniorLevel" class implement the "PaymentCalculator" interface
 * to provide specific implementations of the methods defined in the interface.
 */
public class JuniorLevel implements PaymentCalculator {

    @Override
    public double calculateGross(double hours) {
        // "Initialize a Variable":
        // Providing a default value for a variable at the time of declaration

        // initialize the variable "payRate" with the value of $25 per hour
        double payRate = 25;

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
