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
 * we will create our own exception :-)
 */
public class C3CustomExDemo {
    /*
     * One of the solution:
     * throws OutOfRangeException
     */
    public static void main(String[] args) {
        // We will call our method inside the main()
        /*
         * Remember: Because main() is static,
         * so any method we want to call/run inside the main MUST be static
         */

        /*
         * We might need our app to throw an exception
         * based on our custom code/methods (based on the programmer's perspective)
         */

        double result = getGrossPayment(20, 25); // ok
        System.out.println(result);

        // the code below is commented to test our own exception
        /*
         * result = getGrossPayment(42, 25); // exception
         * System.out.println(result);
         */

        /*
         * Hard coding the values for simplicity:
         */

        double exam1 = 190.43;
        double exam2 = 91.89;
        /*
         * Java will show a compilation error:
         * "Unhandled exception type OutOfRangeException"
         */
        try {
            double avg = getAverage(exam1, exam2);
            System.out.println("Average of " + exam1 + " and " + exam2 + " is: " + avg);
        } catch (OutOfRangeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // exception
        System.out.println(result);
    } // main()

    /*
     * Creating a simple method to calculate the gross pay
     * by multiplying the "hours" worked by the "pay rate"
     * 
     * With a condition that hours cannot exceed the 40 as a maximum
     */
    public static double getGrossPayment(double hours, double payRate) {
        if (hours < 0 || hours > 40) {

            // could be like this:
            // System.out.println("Maximum must be 40 hours");
            // return 0;

            // But we will use a Java Exception below:

            /*
             * using "throw" then the instantiation of an existing exception
             * Java provides many exceptions that we can use
             * or we can create a new exception class based on our needs (we did it)
             * 
             * In this case, it's invalid (illegal)
             * to put more than 40 hours or less than 0,
             * 
             * Two Solutions:
             * 1) We can use the Java exception class "IllegalArgumentException"
             * and passing to the constructor our custom message
             * 
             * 2) Using our exception
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
     * Below, we are adding our own custom exception "OutOfRangeException"
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
             * extends the "Exception" class so it's a "Checked Exception"
             * That's why we have this error:
             * Error: Unhandled exception type OutOfRangeException
             * 
             * So we must either:
             * 1) specify it in our method signature
             * with the keyword "throw"
             * - Throws ExceptionClassName
             * 
             * 2) or by adding try/catch as we explained before.
             * - Using Try and Catch
             *
             */
            throw new OutOfRangeException();
        }
        return (value1 + value2) / 2;
    } // getAverage()
} // class
