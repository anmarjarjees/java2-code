package week13.file_operations;

// Importing the class "File" from "java.io" package:
// File class: to access files or complete directories (Read/Write Operations)
import java.io.File;

// Importing the class "IOException" from "java.io" package:
// IOException: an exception that is thrown when an I/O error occurs
// Link: https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html 
import java.io.IOException;

public class C1CreateFile {
    public static void main(String[] args) {
        /*
         * 1. First creating a file object: myFile1
         * 2. Passing the file name (or the directory name) to the constructor
         * 
         * NOTES:
         * > Creating a File object doesn't actually create a file,
         * it is just for representing the file to be create it later
         * by using .createNewFile() method of the File object
         * 
         * > If we don't specify the path,
         * the default path will the root folder for your Java project
         * 
         * Link: https://www.w3schools.com/java/java_files_create.asp
         */
        File myFile1 = new File("testing1.txt");

        /*
         * Creating a file inside a specific location,
         * For example:our current directory "week13"
         * 
         * Creating a file in a specific directory by specifying the path of the file
         * > windows: use double backslashes to escape the "\" character
         * > Mac and Linux: you can just write the path, like: /Users/name/filename.txt
         * 
         * Q) How to quickly get the current path or the parent path
         * > Copy Path:
         * Drive:FullPath\java2-code\src\week13\file_operations\C1CreateFile.java
         * 
         * > Copy Relative:
         * src\week13\file_operations\C1CreateFile.java
         */
        File myFile2 = new File("src\\week13\\testing2.txt");

        File myFile3 = new File("src\\week13\\file_operations\\testing3.txt");

        /*
         * boolean java.io.File.createNewFile() throws IOException
         * Error: Unhandled exception type IOException
         */
        try {
            /*
             * createNewFile() returns:
             * > true if the named file does not exist and was successfully created;
             * > false if the named file already exists
             */
            myFile1.createNewFile();
            myFile2.createNewFile();
            if (myFile3.createNewFile()) {
                // using the .getName() method to get the file name:
                System.out.println("Created File Name: " + myFile3.getName());
            } else {
                System.out.println("File already exists!");
            }
            myFile3.createNewFile();
        } catch (IOException e) {
            // printing simple message:
            System.out.println("Your file cannot be created!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }

    } // end main()

} // end class file