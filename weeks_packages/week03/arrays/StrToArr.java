package week03.arrays;

// String to Array
public class StrToArr {
    public static void main(String[] args) {
        String myStr = "We are studying Java Programming Language";
        /*
         * Array:
         * index 0 => We
         * index 1 => are
         * index 2 => studying
         */

        String[] strArray = myStr.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            // Printing the indices (indexes) of the array with the value of each index:
            System.out.println("Index: " + i + " => " + strArray[i]);
        }

        /*
         * Enter your list of exams with spaces or commas
         * values = "23 45 67 45 76 90";
         * valArr = values.split(" ")
         */
    } // main()
}
// class file
