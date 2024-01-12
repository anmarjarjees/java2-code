package week09.p05_inheritance1;

import java.util.Random;

public class Rand extends Random {
    // Adding our custom method to generate a random small letter a - z
    public char nextSmallLetter() {
        Random random = new Random();
        // using .nextInt(26) => so in such case it will be between 0 and 26
        /*
         * Since we know that the minimum is "a" that has the decimal value of 97
         * so we can add 97 to the generated random value
         */
        int randomInt = random.nextInt(26) + 97;
        return (char) randomInt;
    }

}
