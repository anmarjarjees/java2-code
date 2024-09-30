package static_keyword;

/*
 * "Coupling" is one the OOP terminologies:
 * The dependency of one class/object on the other class/object
 * 
 * So coupling refer to the connection that two classes have with each other
 *  
 * This topic has more details if we talk about types of coupling:
 * - Loose Coupling: 
 * When two classes, modules, or components have low dependencies on each other, 
 * it is called loose coupling in Java
 * - Tight Coupling: 
 * When two classes are highly dependent on each other, it is called tight coupling
 * 
 * In Java environment, the less dependency we have between two classes is better for maintain, 
 * updating and debugging, so "loose coupling" which is "GOOD" is better than "tight coupling" which is "BAD".
 */
public class Main {
    // main() the entry point to run our Java application
    // It will be immediately invoked without an object
    public static void main(String[] args) {
        /*
         * we can directly call/access the "static" method "hiAll()"
         * through the class name "User" without creating an object
         */
        User.hiAll();

        /*
         * We instantiating 3 instances (objects)
         * using an empty constructor
         */
        User user1 = new User("Martin", 55);
        User user2 = new User();
        User user3 = new User();

        // now we are targeting/accessing the other class "User" fields directly:
        // public fields!
        user1.name = "Sam";
        user1.age = 27;

        user1.greetAll();
        user2.greetAll();
        user3.greetAll();

        /*
         * Warning Message:
         * "The static method hiAll() from the type User
         * should be accessed in a static way"
         * 
         * Question: How "Should be accessed in a static way"???
         */

        // user1.hiAll(); // Error
        User.hiAll(); // hiAll() is a static method

        // Example of using pow() static method of Math object:
        double num = 2;
        num = Math.pow(num, 10);

        System.out.println(User.getUserTotal());

        // The field User.totalUsers is not visible [private]
        // System.out.println(User.totalUsers);

        /*
         * Same Warning Message for => user1.calculate();
         * The static method calculate()
         * from the type User should be accessed in a static way
         */
        // user1.calculate();

        // ** Incorrect Way ** => objectName.anyStaticMethod()
        // ** Correct Way ** => ClassName.anyStaticMethod()

        // Ask the user to choose: 1 for squaring a number or 2 for dividing it by 2:
        /*
         * System.out.println
         * ("Enter 1 for squaring the number or 2 for dividing the number by 2");
         * Scanner sc = new Scanner(System.in);
         * 
         * you can continue the rest...
         */

        // Hard Coding the values just for quick demo:
        int userChoice = 1;
        double userNumber = 90;

        User.calculate(userNumber, userChoice);

        // calling/invoking our custom method "getFactorial()":
        System.out.println("The factorial of 5 is :" + getFactorial(5));
        System.out.println("The factorial of 3 is :" + getFactorial(3));
        System.out.println("The factorial of 0 is :" + getFactorial(0));

        // Finally:
        // Practice the class "Client" (self-study) :-)
        // ********************************************
        // now we CANNOT target/access the other class "Client" fields directly:
        // private fields
        Client client1 = new Client("Sam Simpson", "Golden Account Type");

        System.out.println("Our first client is " + client1);
        // The output before overriding the .toString() method:
        // Our first client is static_keyword.Client@87aac27

        Client client2 = new Client("Sally Solfege", "Bronze Account Type");

        Client client3 = new Client("Alex Chow", "Silver Account Type");

        Client client4 = new Client("Martin Smith", "Golden Account Type");

        Client client5 = new Client("Kate Wilson", "Silver Account Type");
    } // main()

    /*
     * To recap from Java Level#1:
     * ***************************
     * Below we can create own custom method(s):
     * find/return the factorial of any number:
     * 5! = 5 * 4 * 3 * 2 * 1
     * 3! = 3 * 2 * 1
     * 0! = 1
     */

    private static int getFactorial(int number) {
        /*
         * number = 5
         * 5 * 4 * 3 * 2 * 1 = same
         * 1 * 2 * 3 * 4 * 5 = same
         */
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
    } // getFactorial()

} // class file
