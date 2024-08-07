package interfaces_intro;

/*
 * In our main application,
 * instead of working with classes,
 * we can work with the interface
 */
// https://docs.oracle.com/javase/tutorial/java/IandI/interfaceAsType.html
public class Main {
    public static void main(String[] args) {
        JuniorEmployee emp1 = new JuniorEmployee();
        SeniorEmployee emp2 = new SeniorEmployee();

        System.out.println("Employee1 Gross Pay: " + emp1.calculateGross(22));
        System.out.println("Employee2 Gross Pay: " + emp2.calculateGross(31));

        // PaymentCalculator payment1 = new PaymentCalculator();
        // Error: Cannot instantiate the type PaymentCalculator
        // Reason: PaymentCalculator is an interface

        PaymentCalculator.testStaticMethod();
        emp1.testDefaultMethod();
    }
}