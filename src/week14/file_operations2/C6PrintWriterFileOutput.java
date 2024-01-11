package week14.file_operations2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
// import the major general exception class:
import java.lang.Exception;

/* 
 * File Output:
 * Writing data from our application primary memory (RAM) 
 * to a permanent secondary storage unit
 */
public class C6PrintWriterFileOutput {
    public static void main(String[] args) {
        try {
            // Relative Path: src\week14\quotes.txt
            PrintWriter pw = new PrintWriter("src\\week14\\quotes.txt");

            // System.out.println(); // to print into the terminal!
            pw.println(
                    "Life is like riding a bicycle. To keep your balance, you must keep moving. Albert Einstein");

            pw.println(
                    "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. Buddha");

            pw.println(
                    "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them. Dalai Lama");

            // closing the object:
            pw.close();

            // testing div by 0 exception:
            // Infinity => in Java divide by Zero for decimal values
            int x = 22;
            int y = 0;
            double result = x / y;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Class Name: " + e.getClass());
            System.out.println("Error Message: " + e.getMessage());
        }

    } // end main

} // end class file
