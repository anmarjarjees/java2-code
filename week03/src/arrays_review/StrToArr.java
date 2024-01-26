package arrays_review;

// class StrToArr => String to Array
public class StrToArr {
    public static void main(String[] args) {
        String myStr = "We are studying Java Programming Language";
        /*
         * Converting myStr to an Array using the "space" as delimiter:
         * index 0 => We
         * index 1 => are
         * index 2 => studying
         * ....
         */

        /*
         * myStr object of type "String" class
         * using the string method split()
         * Returns: the array of strings
         */
        String[] strArray = myStr.split(" "); // regex => Regular Expression

        for (String word : strArray) {
            System.out.println(word);
        }

        /*
         * Enter your list of exams with spaces or commas
         * values = "23 45 67 45 76 90";
         * valArr = values.split(" ")
         */
    } // main()
} // class f
