package exceptions_part2;

/* 
 * Working with files requires the "File" class
 * from "java.io" package
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * To recap:
 * This class will be used to execute our code,
 * We need to add PSVM method:
 */
public class C5TryResourcesMore {
    /*
     * In Java when we use resources, we follow these steps (milestones)
     * 1. Open a resource
     * 2. Read data from that resource
     * 3. Close the resource
     * 
     * Example => Using Scanner (we had to close to avoid the Java warning)
     * 
     * Exception can also happened when we don't close the open resource(s) properly
     * These resources should be always closed after finishing with them
     * there are two solutions to close them.
     * 
     * Two Solutions:
     * **************
     * 1. Close the resources inside the finally {...} block
     * (We tried it in the previous lecture)
     * 
     * 2. Using Try with resources (recommended) => try-with-resources
     * we can declare the resources that we need to use within the try block
     * and Java will automatically close them for us immediately
     * after the try block execution
     */
    public static void main(String[] args) {
        /*
         * We will use the same code example from the previous project,
         * but this time, we will try () <==> resources
         */

        /*
         * We could create the folder "temp-files" inside the current package:
         * > src\exceptions_part3\temp-files\numbers.txt
         * 
         * Or create it inside the "src" folder:
         * > temp-files/numbers.txt
         */
        File myInputFile = new File("text-files\\numbers.txt"); // for reading
        File myOutputFile = new File("text-files\\result.txt"); // for writing
        try (
                // We can add more than one resource to be closed, each ends with ;
                // notice the ; for the last resource statement is optional
                // also the resources have to be created/declared and initialized within try()
                Scanner scReadFile = new Scanner(myInputFile);
                PrintWriter pwWriteFile = new PrintWriter(myOutputFile);
        /*
         * These resources will be closed in the reverse order that they were defined:
         * Java will close "pwWriteFile" first, then "scReadFile" later
         */) {
            while (scReadFile.hasNext()) {
                // Or saving/writing them to the file:
                pwWriteFile.println(scReadFile.nextInt());
            }

            // No need to close these two objects (open resources)
            // scReadFile.close();
            // pwWriteFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception Class Name: " + e.getClass());
            // class java.io.FileNotFoundException

            System.out.print("Uncompleted operation: " + e.getMessage());
            // (The system cannot find the path specified)
        } // catch
        /*
         * NOTE:
         * try-with-closing resources works with
         * - Classes that implement "Closeable" interface
         * - Classes that implement "AutoCloseable" interface
         * 
         * Examples:
         * - "Scanner" class implements Closeable
         * public final class Scanner implements Iterator<String>, Closeable {...}
         * - "PrintWriter" class extends "Writer" class
         * which implements "Closeable" interface
         * 
         * public class PrintWriter extends Writer {...}
         * public abstract class Writer implements Appendable, Closeable, Flushable
         * {...}
         */

        // The code below will not work as it belongs to solution#1:
        /*
         * finally {
         * scReadFile.close();
         * pwWriteFile.close();
         * }
         */
    } // main()
} // class