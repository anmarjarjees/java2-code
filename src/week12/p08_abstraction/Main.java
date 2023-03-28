package week12.p08_abstraction;

import week12.p09_interface.PaymentCalculator;

/*
Abstract Classes and Methods
Data abstraction is the process of hiding certain details 
and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 
*/
public class Main {
    public static void main(String[] args) {
        LoginService log1 = new LoginService();
        log1.logInUser();

        // Error: Cannot instantiate the type PaymentCalculator
        // Reason: PaymentCalculator is an interface
        // PaymentCalculator payment1 = new PaymentCalculator();

        // Error: Cannot instantiate the type Shape
        // Reason: Shape is an abstract class
        // Shape myShape1 = new Shape();

        Rectangle rec1 = new Rectangle(3, 5);
        rec1.calcPerimeter();

    } // end main()
}
