package exceptions_part2;

/*
 * Working with files requires the "File" class
 * from "java.io" package,
 * we need to import the class "File"
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * NOTE:
 * This is just a very simple example of handling Files Exceptions
 * using normal try/catch block
 * We will have more detailed information about handling files exception
 * 
 * In Java when we use resources, we follow these steps (milestones)
 * 1. Open a resource
 * 2. Read data from that resource
 * 3. Close the resource
 * 
 * Example:
 * When we used the Scanner object, we had to close it at the end
 * to avoid the warning.
 * 
 * Exception can also happened when we don't close the open resource(s) properly
 * These resources should be always closed after finishing with them
 * there are two solutions to close them when using try/catch blocks:
 * 
 * Two Solutions:
 * **************
 * 1. Close the resources inside the finally {...} block of try/catch
 * (In this case, we need to declare the resources globally outside try block)
 * 
 * 2. Using Try with resources (recommended) => try-with-resources
 * we can declare the resources that we need to use within the try block
 * and Java will automatically close them for us immediately
 * after the try block execution
 * (This solution to be covered in details later...)
 */
public class C1FileException {
    /*
     * IMPORTANT NOTE (TYPES OF EXCEPTIONS):
     * *************************************
     * 1- "Checked" Exceptions => are verified by the compiler before the code is
     * executed
     * 2- "Unchecked" Exceptions => are NOT verified by the compiler.
     * Run-time exception and all its classes are considered to be
     * "Unchecked Exception"
     * 
     * We will practice them in this file:
     */
    public static void main(String[] args) {
        // Quick Recap:
        /*
         * Remember the code below for reading/scanning a user input
         * might throw an exception if we:
         * - input a decimal value
         * - input a string value
         * 
         * Because the method "nextInt()" can accept integer values only.
         * If we enter a string or a number with decimal points
         * Java will throw the exception "InputMismatchException"
         */
        System.out.print("Enter an integer (whole) number:");
        Scanner sc = new Scanner(System.in);
        int intNumber = sc.nextInt();
        System.out.println("Integer Value: " + intNumber);

        /*
         * Creating a file with a wrong path
         * Notice that we don't have a folder named "data"
         * 
         * NOTE:
         * if we remove the folder name "data"
         * and just keep the file name "any.txt"
         * Java will simply create it on the root folder
         * 
         * In the code below,
         * we are just creating an object "myFile" of type "File"
         * with specifying the parameters
         */
        // File(String pathname)
        File myFile = new File("any.txt");

        // Using the File methods: (createNewFile) => To create a new file
        /*
         * Using the File method "createNewFile()"
         * This method will create a new file
         * if the path is correct or exists
         * 
         * NOTE:
         * Java Compiler will show a compilation error:
         * "Unhandled exception type IOException"
         * 
         * When hovering the mouse over the method with error (red line):
         * Hint: boolean java.io.File.createNewFile() throws IOException
         * 
         * Java reminds us that this statement/code will generate
         * an "Unhandled exception" with the class name "IOException"
         * 
         * Solutions: In such case we have to either:
         * 1) place this statement/code within try/catch block
         * 2) or add "throws" declaration immediately after the main() method signature
         * Yes, solution#2 is easier :-) but we cannot add a custom error message :-(
         * 
         * Notice that you will see these two suggestion (solutions)
         * with the Quick Fix assistance if VS Code or any other IDE
         */

        try {
            /*
             * we can place all our code inside the try block,
             * or just the lines that throw exceptions
             */
            myFile.createNewFile();
            /*
             * Example#1:
             * If you dig deep (CTRL+CLICK) the method .createNewFile()
             * you will see the Java native code:
             * 
             * public boolean createNewFile() throws IOException {...}
             * 
             * Since this method was built to throw an exception,
             * It means that "IOException" it's a type of "Checked" exception
             * so we have to place the method that throws this exception
             * with try/catch or implement throws declaration
             * 
             * Example#2:
             * If you dig deep (CTRL+CLICK) the method .nextInt()
             * you will see the Java native code:
             * public int nextInt() {
             * return nextInt(defaultRadix);
             * }
             * 
             * Since this method was NOT built to throw an exception,
             * so it's of type "Unchecked" exception
             * so we do NOT have to place the method "nextInt()"
             * within try block/catch or implement throws declaration
             * 
             * However, we can check all the possible exceptions for nextInt():
             * if we open the function and check the comments
             * 
             * @throws...
             */
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Invalid Path!");
        }
    } // main()
} // class