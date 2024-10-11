package overload_review;

public class Main {
    public static void main(String[] args) {

        /*
         * NOTE:
         * this method is static,
         * we cannot access it using the object:
         * 
         * Total myTotal = new Total();
         * myTotal.add(10, 30);
         */

        System.out.println(Total.add(20, 30));

        // Passing 3 arguments => 3 parameters
        System.out.println(Total.add(20, 30, 50));
    }
}
