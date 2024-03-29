package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C2ExceptionDemo {
    public static void main(String[] args) {
        /*
         * "input" is declared inside the main() method,
         * it can be accessed from any block inside the main()
         */
        Scanner input = new Scanner(System.in);
        /*
         * Java can handle the double values => without throwing an exception
         * Java will throw an exception with integer values
         * 
         * First Exception:
         * - InputMismatchException => input a string value instead of integer value!
         * 
         * Use try/catch block:
         * - One try block with at least one or many catch block
         * - Another optional block => "finally" block
         * 
         * To recap:
         * Variable Scope => inside the block of code
         */

        try {
            // write my main code:
            /*
             * Any variable we declare inside the try block,
             * can only be accessed inside the { } of the try block
             */
            // we put all our code that might cause an exception:
            System.out.print("Enter your first whole number (the numerator): ");
            int n1 = input.nextInt();
            System.out.print("Enter your second whole number (the denominator): ");
            int n2 = input.nextInt();
            double div = n1 / n2;
            System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        }
        /*
         * We can add as many catch() blocks as we need
         * according to the exceptions that we might have in our code
         */
        catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println(e.getMessage()); // null
            System.out.println("Invalid input! You need to enter a whole number only!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // / by zero
            System.out.println("Division by 0 is infinite!");
        } catch (Exception e) {
            System.out.println("Sorry, something went wrong! Try again");
        } finally {
            // this "finally" block will always run
            System.out.println("Thank you, see you again");
        }

        // Error: n1 cannot be resolved to a variable
        // System.out.println("Your first number is: " + n1);
        input.close();
    } // main()
} // class
