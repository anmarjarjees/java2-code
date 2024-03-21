package exceptions;

import java.util.Scanner;

public class C3ExceptionMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // we put all our code that might cause an exception:
            System.out.print("Enter your first whole number (the numerator): ");
            int n1 = input.nextInt();
            System.out.print("Enter your second whole number (the denominator): ");
            int n2 = input.nextInt();
            double div = n1 / n2;
            System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);

            String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" };
            // names.length = 5 elements => we have to loop 4 times => starting from 0
            for (int index = 0; index < 6; index++) {
                System.out.println("Name: " + names[index]);
            }
        }
        /*
         * Remember that "Exception" class can be used to handle any exception
         * We can create only one catch block/statement to handle all the exceptions
         */
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());

            // Trick: to know the type (class) of Exception: getClass()
            // to know what's the type/class file for any exception:
            // returns the Class object that represents the runtime class of this object.
            // returns the class name of the exception
            System.out.println(e.getClass());
            // Example => class java.util.InputMismatchException
            // Example => class java.lang.ArithmeticException
            // Example => class java.lang.ArrayIndexOutOfBoundsException
        } finally {
            System.out.println("I hope it makes sense to you :-)");
        }
        input.close();
    } // main()
} // class
