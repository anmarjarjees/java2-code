package exceptions_part2;

/* 
 * Working with files requires the "File" class
 * from java.io package
 */
import java.io.File;
import java.io.IOException;

/*
 * Stack Trace:
 * Interactive log of methods calls which is a history of all method calls
 * within the program's execution that led up to throw exception(s).
 * 
 * This allows us as programmers to trace the path (thread) that the program
 * has used to run our task(s).
 * It can show us the lines that contains the wrong code.
 * 
 * It's commonly used with exception to print the stack trace within the catch
 * block
 * 
 */
public class C3StackTraceEx {
    public static void main(String[] args) {
        File myFile = new File("data/any.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            // Without e.printStackTrace:
            // System.out.print("Uncompleted operation: " + e.getMessage());
            // Output => Uncompleted operation: The system cannot find the path specified

            // With e.printStackTrace:
            e.printStackTrace();
            /*
             * The output:
             * ***********
             * java.io.IOException: The system cannot find the path specified
             * at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
             * at java.base/java.io.File.createNewFile(File.java:1043)
             * at exceptions_part2.C3StackTraceEx.main(C3StackTraceEx.java:27)
             * 
             * Explanations:
             * *************
             * (1) The exception class and the message
             * 
             * (2) no line number. native method was called.
             * It's a method that was NOT written in Java => we cannot access it from Stack
             * Trace
             * 
             * (3) in java File class => return fs.createFileExclusively(path);
             * 
             * (4) where the code that causes exception begins
             */
        } // catch() block
    } // main()
} // class
