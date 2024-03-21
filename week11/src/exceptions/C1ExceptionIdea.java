package exceptions;

import java.util.Scanner;

/**
 * C1ExceptionIdea
 */
public class C1ExceptionIdea {
    public static void main(String[] args) {
        /*
         * Exception:
         * An event that occurs during the execution of a program that disrupts
         * the normal flow of instructions.
         */
        Scanner input = new Scanner(System.in);

        /*
         * answer = 90/80
         * 90 => the numerator
         * 80 => the denominator
         */
        System.out.print("Enter your any number to divide (the numerator): ");
        double num1 = input.nextDouble();

        System.out.print("Enter your any number to divide by (the denominator): ");
        double num2 = input.nextDouble();

        double result = num1 / num2;
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);

        /*
         * But with using integer input:
         */
        System.out.print("Enter your first whole (integer) number (the numerator): ");
        int n1 = input.nextInt();
        System.out.print("Enter your second whole (integer) number (the denominator): ");
        int n2 = input.nextInt();
        double div = n1 / n2;
        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);

        // more examples :-)
        String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" };

        /*
         * Testing another common exception: going beyond the array length:
         */
        // names.length = 5 elements => we have to loop 4 times => starting from 0
        for (int index = 0; index < 6; index++) {
            System.out.println("Name: " + names[index]);
        }
        input.close();
        /*
         * We have examined 3 exceptions:
         * - java.lang.ArithmeticException/ by zero => only with integer values
         * - java.lang.ArrayIndexOutOfBoundsException
         * - java.util.InputMismatchException
         */
    } // main()
} // Class