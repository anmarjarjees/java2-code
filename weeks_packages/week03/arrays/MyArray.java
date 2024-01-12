package week03.arrays;

/* 
 * PascalCase => MyArray
 * camelCase => myArray
 * snake_case => my_array
 * kebab-case => my-array
 */
public class MyArray {
    /* 
    
    */
    public static void main(String[] args) {
        int myLuckyNumber = 7; // if I want to use one number

        // Question: What if we have 5 lucky numbers:
        int myLuckyNumber1 = 9;
        int myLuckyNumber2 = 3;
        int myLuckyNumber3 = 10;
        int myLuckyNumber4 = 25;
        int myLuckyNumber5 = 30;

        String name = "Alex";

        int[] myLuckyNumbers = new int[5];

        // Can be done in two lines also!
        // 1. Just declaring an array varaible
        int[] myFavChannelsNumbers;
        // 2. Then Initialize the array with 9 empty places
        myFavChannelsNumbers = new int[9]; //

        System.out.println(myLuckyNumbers);

        myLuckyNumbers[0] = 9;
        myLuckyNumbers[1] = 3;
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;
        /*
         * The error: Index 5 out of bounds for length 5
         */
        // myLuckyNumbers[5] = 30;

        System.out.println(myLuckyNumbers);
        System.out.println("the second number is " + myLuckyNumbers[1]);

        String[] students = new String[6]; // 6 - 1 => 5
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";

        System.out.println("The first students in the list is " + students[0]);

        // PHP => $languages = ["HTML", "CSS","JavaScript"];
        // JS => let languages = ["HTML", "CSS","JavaScript"];

        // In Java:-)
        String[] languages = { "HTML", "CSS", "JavaScript", "PHP", "Python" };
        System.out.println("our third language in the list is " + languages[2]);
        System.out.println(languages[3] + " is very popular language for back-end web development");

        // replace "PHP" in index 3 with "Java"
        languages[3] = "Java";

        System.out.println("Our current semester language in the list is " + languages[3]);

        /*
         * object has two members:
         * - properties
         * - methods()
         */

        System.out.println("We have to learn " + languages.length + " languages");

    }
}
