package exceptions_part3;

public class RangeCheckDemo {
    // Method to check if a value is within a specified range
    public void checkValue(int value, int min, int max) throws OutOfRangeException {
        if (value < min || value > max) {
            throw new OutOfRangeException("Value " + value + " is out of range (" + min + " - " + max + ").");
        }
    }

    public static void main(String[] args) {
        RangeCheckDemo checker = new RangeCheckDemo();
        try {
            checker.checkValue(10, 1, 5);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    } // main()
} // class
