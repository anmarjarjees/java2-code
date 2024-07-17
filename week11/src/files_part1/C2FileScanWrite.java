package files_part1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class C2FileScanWrite {
    public static void main(String[] args) {

        // We will use files with Scanner:
        /*
         * We have two files in this example:
         * **********************************
         * - file1: read => reading from an existing file (to input the data)
         * - file2: write => create a new one with contents from the file1 (to output
         * the data)
         * 
         * Notice the two files:
         * *********************
         * - file1: numbers.txt
         * => exist file that contains numbers (input these numbers into our code)
         * - file2: result.txt
         * => we will create the result file with the same contents of numbers.txt
         * 
         * Relative Path => src\text-files\numbers.txt
         * Path => C:\...\java2-code\week12\src\text-files\numbers.txt
         * 
         * Error: text-files\numbers.txt (The system cannot find the path specified)
         */
        try {
            File myInputFile = new File("text-files/numbers.txt"); // for reading
            File myOutputFile = new File("text-files/result.txt");

            // Scan/read the content of the file "numbers.txt" => myInputFile
            /*
             * NOTE:
             * passing File object to Scanner() constructor method,
             * will throw: "Unhandled exception type FileNotFoundException"
             */
            Scanner scReadFile = new Scanner(myInputFile);

            // print/output the content into the file "result.txt" => myOutputFile:
            PrintWriter pwWriteFile = new PrintWriter(myOutputFile);

            // Testing :-)
            /*
             * // We can output the content using nextInt() since we have only integers:
             * // first integer value in the file => print the first number:
             * System.out.println(scReadFile.nextInt());
             * // the next integer value in the file => print the second number:
             * System.out.println(scReadFile.nextInt());
             * // the next integer value in the file => print the third number:
             * System.out.println(scReadFile.nextInt());
             * // and so on....
             * System.out.println(scReadFile.nextInt());
             */

            /*
             * hasNext() is a method of the class "Scanner"
             * return true => has next content to read,
             * return false => has no any next content to read
             */
            while (scReadFile.hasNext()) {
                // We can output the number to the terminal (for testing):
                // We need to comment this line to run the next one properly:
                // System.out.println(scReadFile.nextInt()); // done 100%
                // System.out.println(scReadFile.nextLine()); // with String/Numbers

                // Or saving/writing them to the file:
                pwWriteFile.println(scReadFile.nextInt());
            }

            // Close the open resources at the end:
            pwWriteFile.close();
            scReadFile.close();
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            // System.out.println(e.getStackTrace());
            e.printStackTrace();
        } // catch()
    } // main()
} // class
