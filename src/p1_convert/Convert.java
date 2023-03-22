package p1_convert;

/* 
 * For utilities and functions
 * not to run my code
 * 
 * Class Members:
 * - Fields/Properties
 * - Methods
 */
public class Convert {
    // Create two class fields/variables (without values):

    // A field/variable => massResult of double data type static
    // A field/variable => tempResult of double data type static
    private static double massResult; // Class variable
    private static double tempResult;
    private double length; // Instance variable
    private double hight; // 0.0
    public int numberOfSides; // 0
    public String name; // ""
    public boolean isValid; // false

    // Methods:
    // getKilogramValue => static, private, returning value of double data type
    /*
     * getKilogramValue() {
     * // To convert from pound to kilogram => divide (lb) value by 2.2
     * }
     */
    private static double getKilogramValue(int massPound) {
        int result = massPound / 2; // local variable => result
        return result;
    }

    // getPoundValue => static, private, returning value of double data type
    /*
     * getPoundValue() {
     * // To convert from kilogram to pound => multiply (kg) value by 2.2
     * }
     */
    private static double getPoundValue(double massKg) {
        return massKg * 2.2;
    }

    public static double getMass(double massValue, int usersChoice) {
        if (usersChoice == 1) {
            massResult = getKilogramValue(massValue);
        } else if (usersChoice == 2) {
            tempResult = getPoundValue(massValue);
        } else {
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            massResult = 0;
        }
        return massResult;
    }

    /*
     * getFahrenheitValue () {
     * // value in F = (value in C * 9/5) + 32
     * }
     */
    private static double getFahrenheitValue(double tempInCelsius) {
        int ratio = 32;
        String str = "anc";
        return (tempInCelsius * 9 / 5) + ratio;
    }

    /*
     * getCelsiusValue () {
     * // value in C = (value in F - 32) * 5/9
     * }
     */
    private static double getCelsiusValue(double tempInFahrenheit) {
        double result = (tempInFahrenheit - 32) * 5 / 9;
        // System.out.println(result); // extra job!!!!
        return result;
        Math.PI;
    }

    public static double getTemperature(double tempValue, int userChoice) {
        if (userChoice == 1) {
            tempResult = getFahrenheitValue(tempValue);
        } else if (userChoice == 2) {
            tempResult = getCelsiusValue(tempValue);
        } else {
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            tempResult = 0;
        }
        return tempResult;
    }

    // Getters and Setters
    public double getHight() {
        return hight;
    }

    public double getLength() {
        return length;
    }

    public double getDim(String prop) {
        if (prop == "hight") {
            return hight;
        } else {
            return length;
        }
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

} // end class

// Two more static and public methods
/*
 * This methods needs two parameters:
 * - temperature value => ??????
 * - the option => 1 or 2
 */
/*
 * getTemperature(option) {
 * switch (option) {
 * case 1: // converting Cel to Fah
 * // call getFahrenheit
 * // Assign the returned value of getFahrenheit() method to tempResult
 * 
 * case 2: // converting Fah to Cel
 * // call getFahrenheit
 * // Assign the returned value of getFahrenheit() method to tempResult
 * default: // for invalid input
 * }
 * // return the value of tempResult
 * }
 */

/*
 * getMass() {
 * 
 * }
 */
