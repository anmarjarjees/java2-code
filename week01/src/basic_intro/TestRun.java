package basic_intro;

public class TestRun {
    public static void main(String[] args) {
        int studentGrade = 90;
        /*
         * Using "Ternary" Operator :-)
         */

        // To recap:
        if (studentGrade >= 50) {
            System.out.println("Pass the course");
        } else {
            System.out.println("Try again");
        }

        // Summarize the code using "Ternary" operator:
        // (condition) ? true : false
        System.out.println(studentGrade >= 50 ? "Passed" : "Failed");

        int product = 3;
        while (product <= 100)
            product = 3 * product;

        /*
         * In VScode, just type:
         * > sout then TAB
         * Print to standard out
         * System.out.println();
         * 
         * in Eclipse, type:
         * > sout and press Ctrl + space.
         */
    } // end main()
}
