package week14.file_operations2;

import java.io.PrintWriter;
import java.util.ArrayList;

public class C7InputPut {
    public static void main(String[] args) {
        try {
            ArrayList<String> quotes = new ArrayList<>();

            quotes.add(
                    "Life is like riding a bicycle. To keep your balance, you must keep moving. Albert Einstein");

            quotes.add(
                    "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. Buddha");
            quotes.add(
                    "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them. Dalai Lama");

            /*
             * Creating an empty file "result.txt"
             * 
             * using => new PrintWriter("result.text");
             */
            PrintWriter pw = new PrintWriter("src\\week14\\result.txt");

            for (String quote : quotes) {
                pw.println(quote);
            }

            // We need to close PrintWrite object after fishing the operations
            // otherwise, our text file will be empty!
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println("Error in accessing or writing to file!");
        }
    } // end main()
} // class file
