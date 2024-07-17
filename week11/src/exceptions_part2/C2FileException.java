package exceptions_part2;

import java.io.File;
import java.io.IOException;

public class C2FileException {
    /*
     * Below we added the declaration => throws IOException
     * To handle the "Checked Exception"
     * 
     * Using the throws declaration instead of try/catch,
     * With this solution there will be no custom error message,
     * unless if we also add try/catch block!
     */

    public static void main(String[] args) throws IOException {
        // File(String pathname)
        File myFile = new File("data/any.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Invalid Path!");
        } // Checked Exception
    } // main()
} // class
