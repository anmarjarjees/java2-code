package exceptions_part3;

/* 
 * A demo about using our own custom exception,
 * 
 * Instead of using these built-in Java Exceptions
 * - InputMismatchException 
 * - ArithmeticException 
 * - ArrayIndexOutOfBoundsException
 * - IOException
 * 
 * We will add a custom method to:
 * - Throw a built-in Java Exception (First)
 * - Throw our own exception after creating it (Later)
 */
/**
 * CustomExDemo
 */
public class CustomExDemo {

    /*
     * This class will be used to run our application,
     * adding the main() method:
     * PSVM => S => "static"
     */
    public static void main(String[] args) {
        // We will call our method(s) inside the main()
        /*
         * Remember: Because main() is static,
         * so any method we want to call/run inside the main MUST be static
         */
        double result = getGrossPayment(30, 25);
        System.out.println(result);

        // the code below is commented to test our own exception
        /*
         * result = getGrossPayment(42, 25); // exception
         * System.out.println(result);
         */

        /*
         * Hard coding the values for quick demo and simplicity:
         */
        double exam1 = 190.43;
        double exam2 = 91.89;
        /*
         * We might need our app to throw an exception
         * based on our custom code/methods (based on the programmer's perspective)
         */
        /*
         * Java will show a compilation error:
         * "Unhandled exception type OutOfRangeException"
         */
        double avg;
        try {
            avg = getAverage(exam1, exam2);
            System.out.println("Average of " + exam1 + " and " + exam2 + " is: " + avg);
        } catch (OutOfRangeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // catch exception
    } // main()

    /*
     * Creating a simple method to calculate the gross pay
     * by multiplying the "hours" worked by the "pay rate"
     * 
     * With a condition that hours cannot exceed the 40 as a maximum
     * This method should NOT accept more than 40 hours
     * 
     * if we put 40 => this method will "throw" an exception
     */
    private static double getGrossPayment(double hours, double payRate) {
        if (hours <= 0 || hours > 40) {
            // Invalid Input:
            // could be like this:
            // System.out.println("Minimum 1 and Maximum must be 40 hours");
            // return 0;

            // But we will use a Java Exception below:

            /*
             * using "throw" then the instantiation of an existing exception
             * Java provides many exceptions that we can use
             * or we can create a new exception class based on our needs
             * 
             * In this case, it's invalid (illegal)
             * to put more than 40 hours or less than 0,
             * 
             * Two Solutions:
             * 1) We can use the Java exception class "IllegalArgumentException"
             * and passing to this class constructor our custom message
             * 
             * 2) Using our own custom exception
             */

            throw new IllegalArgumentException("Hours has to be between 0 to 40");

            /*
             * NOTE: if we look inside the "IllegalArgumentException" class:
             * 
             * public class IllegalArgumentException extends RuntimeException {
             * public IllegalArgumentException() {
             * super();
             * }
             * }
             * 
             * Notice that it extends "RuntimeException"
             * so it's an "Unchecked Exception"
             * which means, we don't have to declare that our method throws that exception
             */
        } // end if
        return hours * payRate;
    } // getGrossPayment()

    /*
     * Creating a method tha throws a custom exception
     * we are adding our own custom exception named "OutOfRangeException"
     * to this method :-)
     * 
     * Accepts two numeric values:
     * - numeric
     * - between 0 to 100
     * 
     */
    public static double getAverage(double value1, double value2) throws OutOfRangeException {
        /*
         * we can add more () for better readability:
         * ((value1 < 0 || value1 > 100) || (value2 < 0 || value2 > 100))
         */
        if (value1 < 0 || value1 > 100 || value2 < 0 || value2 > 100) {
            // We will use our custom exception below :-)
            /*
             * Notice below because our custom exception "OutOfRangeException"
             * extends the main "Exception" class so it's a "Checked Exception"
             * That's why we have this error:
             * Error: Unhandled exception type OutOfRangeException
             * 
             * Two solutions: we must either:
             * 1) specify it in our method signature
             * with the keyword "throw"
             * - Template => throws ExceptionClassName
             * 
             * 2) or by adding try/catch as we explained before.
             * - Using Try and Catch
             */
            throw new OutOfRangeException();
        } // end if
        return (value1 + value2) / 2;
    } // getAverage()
} // class