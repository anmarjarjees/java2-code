package about_abstraction;

/**
 * Main:
 * Abstract Classes and Methods
 * Data abstraction is the process of hiding certain details
 * and showing only essential information to the user.
 * Abstraction can be achieved with either abstract classes or interfaces
 */
public class Main {
    public static void main(String[] args) {

        // login for a user:
        LoginService user1 = new LoginService();
        user1.logInUser();

        // anonymous (inner class) 3'rd semester:
        /*
         * Shape myShape = new Shape() {
         * 
         * };
         */

        // Error: Cannot instantiate the type Shape
        // "Shape" class is an abstract class
        // we cannot create objects of an "abstract" class
        // Shape myShape = new Shape();

        Rectangle myRectangle = new Rectangle(5, 7);
        System.out.println(myRectangle.calcArea());

        // PaymentCalculator payment1 = new PaymentCalculator();
        // Error: Cannot instantiate the type PaymentCalculator
        // Reason: PaymentCalculator is an interface

        // Error: Cannot instantiate the type Shape
        // Reason: Shape is an abstract class
        // Shape myShape1 = new Shape();
    }
}