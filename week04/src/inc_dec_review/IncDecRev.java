package inc_dec_review;

/**
 * IncDecRev => Increment Decrement Review
 * 
 * Increment / Decrement Review
 * can be added before or after the variable
 */
public class IncDecRev {
    public static void main(String[] args) {
        int number1 = 2;
        // Initializing a new variable "result" with this formula
        int result = number1 * 2;
        System.out.println("Result: " + result); // 4

        int number2 = 2;
        // Prefix increment: ++ => adding 1
        result = number2++ * 2;
        // You might think: (2+1) => 3 * 2 => 6 (Wrong!)
        System.out.println("Result: " + result); // 4
        /*
         * Reason:
         * the increment is after the variable number2++
         * Yes, Java will increment this variable
         * but it will be after it's done with the operation/formula!
         * 
         * in other words,
         * 1. Java will multiple the variable "number2" by 2 => 4
         * 2. Java will assign the value 4 to the variable "result"
         * 3. Finally, Java will increment the number2
         */
        // The correct: 2 * 2 = 4 => then add 1 to the number2
        System.out.println("Number2 Value: " + number2); // 3

        int number3 = 2;
        // Postfix increment
        result = ++number3 * 2;
        // (2+1) * 2
        System.out.println("Result: " + result); // 6

        // Task: try the same logic but with decrement --
    }

}
