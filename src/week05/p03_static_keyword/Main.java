package week05.p03_static_keyword;

public class Main {
    // main() the entry point to run our Java application
    // It will be immediately invoked without an object
    public static void main(String[] args) {
        // passing two arguments: "Alex Chow", 48
        User user1 = new User("Alex Chow", 48);
        User user2 = new User("Martin Smith", 51);
        User user3 = new User("Sam Simpson", 51);
        User user4 = new User("Sarah Grayson", 51);

        user1.greetAll();
        user2.greetAll();

        /*
         * Error:
         * The static method hiAll() from the type User should be accessed in a static
         * way
         * 
         * Question: How "Should be accessed in a static way"???
         */
        // user2.hiAll(); // Error
        User.hiAll(); // hiAll() is a static method

        // Example of using pow() static method of Math object:
        double num = 2;
        num = Math.pow(num, 10);

        // calling our custom method "getFactorial()":
        System.out.println("The factorial of 5 is :" + getFactorial(5));
        System.out.println("The factorial of 3 is :" + getFactorial(3));
        System.out.println("The factorial of 0 is :" + getFactorial(0));

        System.out.println("Total users: " + User.getUserTotal());
    } // end of the main() method

    // below we can create own custom methods:
    // find/return the factorial:
    // 5! = 5 * 4 * 3 * 2 * 1
    // 3! = 3 * 2 * 1
    // 0! = 1
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
    }

} // end class file
