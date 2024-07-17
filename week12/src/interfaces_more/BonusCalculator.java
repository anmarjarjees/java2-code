package interfaces_more;

/*
 * BonusCalculator Interface:
 * This interface defines methods for calculating bonuses
 */
public interface BonusCalculator {
    /*
     * "Interface Default Methods":
     * ****************************
     * - Since Java 8, methods with interfaces can have the keyword "default"
     * to allow interfaces to provide method implementations
     * - allow us to add default implementation that can be used across multiple
     * classes without requiring each class to implement the method explicitly
     * 
     * In Java, when a class implements an interface that includes default methods,
     * it can have two options:
     * - either override those default methods
     * - or inherit them as they are
     * 
     * This "default" method calculates the bonus based on:
     * the base salary (gross payment) and the bonus percentage
     * 
     * > The input is the gross payment and the bonus percentage value
     * > If the bonus percentage is not provided, it defaults to 10%.
     * > The output is the calculated bonus amount.
     */
    default double calculateBonusPayment(double baseSalary, double bonusPercentage) {
        if (bonusPercentage <= 0) {
            // Default bonus percentage: 10%
            bonusPercentage = 10;
        }
        return baseSalary * (bonusPercentage / 100);
    }

    /*
     * "printBonusInfo" method:
     * > Static method that can be called by the interface itself
     * > cannot be overridden by implementing classes
     * > prints simple text message
     */
    static void printBonusInfo() {
        System.out.println("Calculating the final payment after bonuses based on base payment and bonus percentage.");
    }
    /*
     * FYI:
     * ****
     * Default bonus calculation will be 10% of base salary
     * 10 divided by 100% => 0.10 or 0.1
     * 
     * - baseSalary => represents the employee's base salary
     * 
     * - bonusPercentage could be any percentage or 10% if 0 value
     * 
     * - if the bonusPercentage is 10 for "10%"
     * 10 /100 => 0.10 or (0.1) => The decimal representation of 10%.
     * 
     * In mathematics, to convert a percentage to a decimal,
     * we divide by 100. So, 10% becomes 0.1 as we do in Excel
     * 
     * So for example when we multiply the base salary by 0.10,
     * we are calculating 10% of the base salary.
     * 
     * Example:
     * - Suppose the base salary is $2000.00
     * - To find 10% of $2000.00:
     * > 10 / 100 => 0.10 or 0.1
     * > we multiply $2000.00 by 0.10.
     * - The result (bonus) is 200, which is 10% of 2000.
     * - Final Salary with the bonus => $2200.00
     * 
     * For more details, you can refer to the first semester course:
     * "Math for the Computer Industry"
     */

}