package week14.other_exceptions;

public class MyArray {
    public static void main(String[] args) {
        try {
            int myLuckyNumber = 7; // if I want to use one number

            // Question: What if we have 5 lucky numbers:
            int myLuckyNumber1 = 9;
            int myLuckyNumber2 = 3;
            int myLuckyNumber3 = 10;
            int myLuckyNumber4 = 25;
            int myLuckyNumber5 = 30;

            String name = "Alex";

            int[] myLuckyNumbers = new int[5];

            // Can be done in two lines also!
            // 1. Just declaring an array varaible
            int[] myFavChannelsNumbers;
            // 2. Then Initialize the array with 9 empty places
            myFavChannelsNumbers = new int[9]; //

            System.out.println(myLuckyNumbers);

            myLuckyNumbers[0] = 9;
            myLuckyNumbers[1] = 3;
            myLuckyNumbers[2] = 10;
            myLuckyNumbers[3] = 25;
            myLuckyNumbers[4] = 30;
            /*
             * The error: Index 5 out of bounds for length 5
             */
            myLuckyNumbers[5] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        } finally {

        }

    } // end main()
}
