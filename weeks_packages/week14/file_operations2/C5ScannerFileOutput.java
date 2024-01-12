package week14.file_operations2;

import java.io.File;
import java.io.IOException;
// importing ArrayList:
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * This exception is related for file i/o operation:
 * > java.lang.Object
 * >> java.lang.Throwable
 * >>> java.lang.Exception
 * >>>> java.lang.RuntimeException
 * >>>>> java.util.NoSuchElementException
 * >>>>>> java.util.InputMismatchException
 */
public class C5ScannerFileOutput {
    public static void main(String[] args) {
        try {
            /*
             * Relative Path:src\week14\mixed.txt
             */
            Scanner mixedFile = new Scanner(new File("src\\week14\\mixed.txt"));

            ArrayList<Integer> myNumbers = new ArrayList<>();

            while (mixedFile.hasNext()) {
                myNumbers.add(mixedFile.nextInt());
            }

            System.out.println(myNumbers);

            // close the file:
            mixedFile.close();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException Error: " + e.getMessage());
            /*
             * We have to start with the specific exception(s) => The subclass for the
             * "Exception"
             * and add the general one at the end,
             * otherwise the Complier will show error:
             * Unreachable catch block for ArithmeticException. It is already handled by the
             * catch block for ExceptionJava(553648315)
             */
            // Or all the other exceptions in Java! Just use the root exception class
            // "Exception":
        } catch (Exception e) {
            System.out.println("Exception Class: " + e.getClass());
            // Exception Class: class java.util.InputMismatchException
            System.out.println("Error: " + e.getMessage());
        }
    }
} // end class file
