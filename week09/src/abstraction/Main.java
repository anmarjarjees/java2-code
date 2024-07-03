package abstraction;

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
    }
}
