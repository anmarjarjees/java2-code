package week12.p09_interface;

public class SeniorLevel implements PaymentCalculator {
    public double getGrossPay() {
        return 0;
    }

    @Override
    public double calculateGross(double hours) {
        // Initialization means providing a default value for a variable at the time of
        // declaration
        double payRate = 35; // initialize the variable "payRate" with the value of $35
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
