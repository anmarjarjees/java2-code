package week03.arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "Java", "Python", "PHP", "C#" };
        System.out.println(mySubjects[0]);
        System.out.println(mySubjects[1]);
        // and so on...
        for (int i = 0; i < 7; i++) {
            System.out.println(mySubjects[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < mySubjects.length; i++) {
            System.out.println(mySubjects[i]);
        }

        System.out.println("\n");
        int x = 0;
        while (x < mySubjects.length) {
            System.out.println(mySubjects[x]); // x = 0, x = 1
            x++; // x = 1, x =2
        }

        int y = 0;
        do {
            System.out.println(mySubjects[y]);
            y++;
        } while (y < mySubjects.length);

        System.out.println("\n");

        // another nice loop with arrays :-)
        // (dataType x : arrayName)
        // x is just a variable that refers to the array elements/items
        for (String subject : mySubjects) {
            System.out.println(subject);
        }

        /*
         * In PHP :-)
         * foreach
         * 
         * foreach ($mySubjects as $subject) {
         * echo $subject;
         * }
         * 
         * 
         */

        // copy the students array from the previous example:
        String[] students = new String[6];
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";
        // students[9] = "James Dean";
        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 9 out of bounds for length 6
         */

        System.out.println("\n");
        for (String student : students) {
            System.out.println(student);
        }

    } // main()
} // class file
