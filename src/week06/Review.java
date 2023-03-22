package week06;

public class Review {
    public static void main(String[] args) {
        int number1 = 2;
        int result = number1 * 2;
        System.out.println("Result: " + result); // 4

        int number2 = 2;
        // Prefix increment:
        result = number2++ * 2;
        // 2 * 2 => 4 assigned to result
        // then number2++ => 3
        System.out.println("Result: " + result); // 4
        System.out.println("number2: " + number2); // 3

        int number3 = 2;
        // Postfix increment
        result = ++number3 * 2;
        // ++number3 = 2 + 1 => 3
        // then number3 * 2 = (3) * 2
        System.out.println("Result: " + result); // 6

    }
}
