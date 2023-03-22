// package ?????

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hi");
        double average = 90;
        if (average >= 50) {
            System.out.println("good");
        } else {
            System.out.println("Try again");
        }

        // Ternary:
        System.out.println("The ternary condition!");
        System.out.println((average >= 50) ? "good" : "Try again");
        /*
         * In PHP :-)
         * echo (($average >= 50) ? "good" : "Try again");
         * 
         * In JS :-)
         * document.write (($average >= 50) ? "good" : "Try again");
         * 
         */
    }
}
