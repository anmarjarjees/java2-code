package basic_intro;

public class TestRun {
    public static void main(String[] args) {
        // a numeric variable
        int studentGrade = 90;
        /*
         * Using "Ternary" Operator :-)
         */

        // To recap (if/else block):
        if (studentGrade >= 50) {
            System.out.println("Pass the course");
        } else {
            System.out.println("Try again");
        }

        // Summarize the code using "Ternary" operator:
        // (condition) ? true : false
        System.out.println(studentGrade >= 50 ? "Pass" : "Try again");

        int product = 3;
        /*
         * NOTE:
         * We can omit the { } for the while block
         * since it contains only one statement.
         * 
         * This rule also applies to other control structures
         * like if conditions, for loops, etc.
         * 
         * Be aware:
         * omitting braces can lead to errors
         * if you later add more statements.
         * Always ensure the intended scope of the block is clear to avoid bugs.
         */
        while (product <= 100)
            product = 3 * product;
    } // end main()
}
