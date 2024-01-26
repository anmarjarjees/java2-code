package arrays_review;

/* 
 * PascalCase => MyArray
 * camelCase => myArray
 * snake_case => my_array
 * kebab-case => my-array
 */
public class MyArray {
    public static void main(String[] args) {
        /*
         * One variable that can save multiple values
         * all the values must have the same data types
         * fixed length
         */

        // 1. Declare an empty array variable
        int[] myLuckyNumbers;

        // 2. Then Initialize the array with 9 empty places
        myLuckyNumbers = new int[9]; // specify the length

        /*
         * In PHP :-)
         * we cannot use echo/print
         * we used print_r() or var_dump()
         */
        System.out.println(myLuckyNumbers); // [I@4617c264

        // Arrays are always 0 based index:
        myLuckyNumbers[0] = 9;
        myLuckyNumbers[1] = 3;
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;
        System.out.println(myLuckyNumbers); // [I@4617c264

        // Declare and initialize the length of the array:
        String[] students = new String[6]; // highest index is 5
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
         * Declare and initialize the array with values also:
         * PHP:
         * $languages = ["HTML", "CSS","JavaScript"];
         * 
         * JS:
         * let languages = ["HTML", "CSS","JavaScript"];
         * 
         * in Java :-)
         */
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

        String[] mySubjects = { "HTML", "CSS", "JavaScript", "Java", "Python", "PHP", "C#" };

        for (int i = 0; i < 7; i++) {
            System.out.println(mySubjects[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < mySubjects.length; i++) {
            System.out.println(mySubjects[i]);
        }

        System.out.println("\n");
        int x = 0;
        // will never run if the condition is false
        while (x < mySubjects.length) {
            System.out.println(mySubjects[x]); // x = 0, x = 1
            x++; // x = 1, x =2
        }

        int y = 0;
        // will run at least one time even the condition is false
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

    } // main()
} // class file
