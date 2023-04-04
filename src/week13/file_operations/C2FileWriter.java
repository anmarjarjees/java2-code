package week13.file_operations;

/* 
   java.io package has the classes:
   > "FileWriter" and "BufferedWriter" to wrote text files
   > "FileReader" and "BufferedReader" to read text files
 */
import java.io.FileWriter;
// Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileWriter.html

import java.io.IOException;
import java.io.BufferedWriter;
// Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedWriter.html

public class C2FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("src\\week13\\temp1.txt");

            // writing some text to the text file:
            BufferedWriter buffer = new BufferedWriter(myFile);
            buffer.write("When there is a will, there is a way!");
            buffer.newLine();
            buffer.write("Easy come, easy go!");
            buffer.newLine();

            // extra example to create another file named temp2.txt
            FileWriter myFile2 = new FileWriter("src\\week13\\temp2.txt");

            // like "Scanner" object, we need to close the buffer object:
            buffer.close();

        } catch (IOException e) {
            // printing simple message:
            System.out.println("Cannot write on file!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }
    } // end main()
} // end class file
