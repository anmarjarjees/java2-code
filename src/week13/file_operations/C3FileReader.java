package week13.file_operations;

/* 
   java.io package has the classes:
   > "FileWriter" and "BufferedWriter" to wrote text files
   > "FileReader" and "BufferedReader" to read text files
 */
import java.io.FileReader;
// Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileReader.html
import java.io.IOException;
import java.io.BufferedReader;
// Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedReader.html
import java.io.FileNotFoundException;
/* 
 * All the exception classes are driven from Exception class:
 * > java.lang.Object
 * >> java.lang.Throwable
 * >>> java.lang.Exception
 * >>>> java.io.IOException
 * >>>>> Java.io.FileNotFoundException
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html
 * 
 * Importing the class "FileNotFoundException"
 * for handling all the related file exceptions 
 * from java.io package
 */

// import java.io.IOException;

public class C3FileReader {
    public static void main(String[] args) {
        try {
            FileReader myFile = new FileReader("src\\week13\\temp1.txt");

            BufferedReader buffer = new BufferedReader(myFile);
            /*
             * To read the text file line-by-line,
             * use readLine() method of a BufferedReader object
             */

            // System.out.println(buffer.readLine()); // returns one line only!
            // Declare and Initialize an empty String varaible for storing a line of text
            // from the file:
            String fileLine = "";
            while ((fileLine = buffer.readLine()) != null) {
                System.out.println(fileLine);
            }
            /*
             * In PHP when reading Data using PDO :-)
             * while ($row = $query->fetch()) {
             * echo $row['first_name']....
             * }
             */

            // like Scanner object, we need to close the buffer object
            buffer.close();
        } catch (FileNotFoundException e) {
            // printing simple message:
            System.out.println("Cannot write on this file!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());

        } // We can multiple catch() statements!
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
         * Important Note:
         * starting with the subclass first then the superclass Exception at the end
         */
    } // end main()
} // end class file
