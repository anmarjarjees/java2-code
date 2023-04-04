package week13.file_operations;

import java.io.File;
import java.io.FileNotFoundException;

// importing ArrayList class from the package "java.util":
import java.util.ArrayList;
import java.util.Scanner;

public class C4ScannerFileInput {
    public static void main(String[] args) {
        try {
            Scanner intFile = new Scanner(new File("src\\week13\\test-int.txt"));

            Scanner strFile = new Scanner(new File("src\\week13\\test-str.txt"));

            /*
             * Declare an empty ArrayList for our file integer values
             * 
             * Remember that we CANNOT use primitive data types with ArrayList,
             * the solution is to use the Wrapper class for the primitive data type
             */
            ArrayList<Integer> myNumbers = new ArrayList<>();

            // and so on for myLetters array list:
            ArrayList<String> myLetters = new ArrayList<>();

            while (intFile.hasNext()) {
                // add these lines to our Array List: myNumbers
                myNumbers.add(intFile.nextInt());
            }

            while (strFile.hasNext()) {
                // add these lines to our Array List: myLetters
                myLetters.add(strFile.next());
            }

            System.out.println(myNumbers);
            System.out.println(myLetters);

            // close the file(s):
            intFile.close();
            strFile.close();
        } catch (FileNotFoundException e) {
            // printing simple message:
            System.out.println("Your file cannot be found or located!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }
    } // end main()
} // end file class
