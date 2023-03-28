package week12.p09_interface;

public class JuniorLevel implements PaymentCalculator {
    /*
     * public double calGrossPay() {
     * return 0;
     * }
     */

    @Override
    public double calculateGross(double hours) {
        // Initialization means providing a default value for a variable at the time of
        // declaration
        double payRate = 25; // initialize the variable "payRate" with the value of $25
        // 3. Hours x Pay Rate:
        double payPerWeek = hours * payRate;

        return payPerWeek;
    }

    @Override
    public void doSomething(int i, double x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doSomething'");
    }
}
