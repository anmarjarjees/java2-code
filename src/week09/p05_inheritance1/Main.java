package week09.p05_inheritance1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random); // java.util.Random@4617c264
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextInt(26)); // 0 - 26
        System.out.println(random.nextInt(26)); // 0 - 26
        System.out.println(random.nextInt(26) + 97); // [0 - 26] + 97

        Rand rand = new Rand();
        System.out.println(rand.nextSmallLetter());
        System.out.println(rand.nextSmallLetter());
        System.out.println(rand.nextSmallLetter());
        System.out.println(rand.nextSmallLetter());
        System.out.println(rand.nextSmallLetter());
        rand.nextBoolean();
        rand.nextInt();
        rand.nextFloat();
    }
}
