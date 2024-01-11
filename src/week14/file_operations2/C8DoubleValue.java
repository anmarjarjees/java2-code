package week14.file_operations2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C8DoubleValue {
    public static void main(String[] args) {
        Scanner numFile = null;
        PrintWriter pw = null;
        try {
            numFile = new Scanner(new File("src\\week14\\numbers.txt"));
            pw = new PrintWriter(new File("src\\week14\\doubles.txt"));

            int doubleNum;
            while (numFile.hasNext()) {
                doubleNum = numFile.nextInt() * 2;

                // Print the doubled value into the file "doubling.txt":
                pw.println(doubleNum); // Each value will be printed into a new line
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } finally {
            // closing:
            numFile.close();
            pw.close();
        }
    } // end main()

} // end class file
