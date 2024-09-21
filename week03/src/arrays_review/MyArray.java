package arrays_review;

// "Scanner" class from "java.util" package:
import java.util.Scanner;

/* 
 * Don't forget the letter case types in programming :-)
 * PascalCase => MyArray
 * camelCase => myArray
 * snake_case => my_array
 * kebab-case => my-array
 */
public class MyArray {
    public static void main(String[] args) {

        // simple variable that has one value of 7
        int myLuckyNumber = 7;
        /*
         * Array:
         * - One variable that can save multiple values
         * - all the values must have the same data types
         * - fixed length (Not resizable)
         */

        /*
         * First Way:
         * **********
         * 3 code lines:
         * Line#1 => Arrays and data types
         * Line#2 => The length
         * Line#3 => Adding the values
         */

        // Lucky Numbers: 9, 3, 10, 25, 30
        // 1. Declare an empty array variable
        int[] myLuckyNumbers;

        // 2. Then Initialize the array with 5 empty places
        myLuckyNumbers = new int[5]; // specify the length

        /*
         * In PHP :-)
         * we cannot use echo/print
         * we used print_r() or var_dump()
         */
        System.out.println(myLuckyNumbers); // [I@4617c264

        // 3. Adding the values:
        // Arrays are always 0 based index:
        myLuckyNumbers[0] = 9;
        myLuckyNumbers[1] = 3;
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;
        System.out.println(myLuckyNumbers); // [I@4617c264

        /*
         * Second Way:
         * ***********
         * 2 code lines:
         * Line#1 => Arrays and data types + Specifying the length
         * Line#2 => Adding the values
         */
        // 1. Declare and initialize the length of the array:
        String[] students = new String[6]; // highest index is 5

        // 2. Adding the values
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";
        /*
         * Error in the runtime:
         * Exception in thread "main"
         * java.lang.ArrayIndexOutOfBoundsException:
         * Index 6 out of bounds for length 6
         */
        // students[6] = "Any name";

        System.out.println("The first students in the list is " + students[0]);

        /*
         * Third Way:
         * **********
         * 1 code line:
         * Arrays and data types + Specifying the length + Adding the values
         */

        /*
         * Declare and initialize the array with values also:
         * PHP:
         * $languages = ["HTML", "CSS","JavaScript"];
         * 
         * JS:
         * let languages = ["HTML", "CSS","JavaScript"];
         * 
         * in Java :-)
         */

        // Declare Array with its data types + Adding the values to specify the length
        String[] languages = { "HTML", "CSS", "JavaScript" };

        System.out.println("our third language in the list is " + languages[2]);
        System.out.println(languages[2] + " is very popular language for back-end web development");

        /*
         * Array variable is an object of type Array
         * 
         * Object has two members:
         * - properties
         * - methods()
         */

        // Using the property "length" of the array object "languages"
        System.out.println("We have to learn " + languages.length + " languages");

        /*
         * Quick Review for loops with Arrays:
         */

        /*
         * Semester#4 => Android Mobile Development => "Java", "Kotlin"
         */
        String[] mySubjects = { "HTML", "CSS", "JavaScript", "C++", "Java", "Python", "PHP", "C#", "Kotlin" };
        /*
         * For more details:
         * https://github.com/anmarjarjees/java1-code/blob/main/week09/src/using_arrays/
         */

        // Printing each element without loop structure!
        System.out.println(mySubjects[0]); // "HTML"
        System.out.println(mySubjects[1]); // "CSS"
        System.out.println(mySubjects[2]);
        System.out.println(mySubjects[3]);
        System.out.println(mySubjects[4]);

        /*
         * Finally => Quick Review About Loops:
         * The popular loops (also in other languages)
         * - for loop
         * - while loop
         * - do while loop
         */
        // Not a good idea to hard code the length of the array => 9
        for (int i = 0; i < 9; i++) {
            System.out.println(mySubjects[i]);
        }

        System.out.println("\n");
        /*
         * mySubjects is an "object" of type "Array"
         */
        for (int index = 0; index < mySubjects.length; index++) {
            System.out.println(mySubjects[index]);
        }

        System.out.println("\n");

        // while:
        int x = 0;
        // will never run if the condition is false
        while (x < mySubjects.length) {
            System.out.println(mySubjects[x]); // x = 0, x = 1
            x++; // x = 1, x =2
        }

        // do while:
        int y = 0;
        // will run at least one time even if the condition is false
        do {
            System.out.println(mySubjects[y]);
            y++;
        } while (y < mySubjects.length);

        /*
         * another nice loop with arrays :-)
         * for (dataType x : arrayName) { }
         * 
         * for (iterable_type iterable_element : iterable) {
         * 
         * }
         * 
         * In PHP :-)
         * foreach:
         * 
         * foreach ($mySubjects as $subject) {
         * echo $subject;
         * }
         */
        for (String subject : mySubjects) {
            System.out.println(subject);
        }

        // do/while do
        /*
         * To recap from Java level#1:
         * Good Example of why we need to use "doWhile"/"while" instead "for" loop
         * In the example below, you can see that using for loop will not work.
         * we use for loop only if we know how many times we will loop
         */
        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        boolean playAgain = true;
        do {
            System.out.println("What's the secret number between 1 and 10?");
            int userNumber = sc.nextInt();

            if (userNumber == secretNumber) {
                System.out.println("Good the secret number is " + secretNumber);
                playAgain = false;
            } else {
                System.out.println("Not the secret");
            }

            System.out.println("Press 1 to continue or 2 to end the game");
            int userChoice = sc.nextInt();

            if (userChoice == 2) {
                playAgain = false;
            } else if (userChoice != 1 && userChoice != 2) {
                System.out.println("Invalid Input!");
            }
        } while (playAgain);

        /*
         * For more details about loops:
         * https://github.com/anmarjarjees/java1-code/blob/main/week06/src/loops/
         */
        sc.close();
    } // main()
} // class file
