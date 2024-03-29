package files_part1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class C2FileScanWrite {
    public static void main(String[] args) {

        // We will use files with Scanner:
        /*
         * We have two files:
         * - numbers.txt => exist file that contains numbers (input these numbers into
         * our code)
         * - result.txt => we will create the result file with the same contents of
         * numbers.txt
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
            Scanner scReadFile = new Scanner(myInputFile);

            // print/output the content into the file "result.txt" => myOutputFile:
            PrintWriter pwWriteFile = new PrintWriter(myOutputFile);

            /*
             * hasNext() is a method of the class "Scanner"
             * return true => has next content to read,
             * return false => has no any next content to read
             */
            while (scReadFile.hasNext()) {
                // We can output the number to the terminal (for testing):
                // We need to comment this line to run the next one properly:
                // System.out.println(scReadFile.nextInt()); // done 100%

                // Or saving/writing them to the file:
                pwWriteFile.println(scReadFile.nextInt());
            }
            // Close it at the end:
            pwWriteFile.close();
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println(e.getMessage());
            // System.out.println(e.getStackTrace());
            e.printStackTrace();
        } // catch()
    } // main()
} // class
