package abstraction;

/* 
 * Example of converting "UML Class Diagram"
 * to Java code
 * Please refer to my full PDF file about the OOP and UML
 */
public class Spaceship {
    /*
     * The fields symbols in UML:
     * - callSign: String = "Stop"
     * - shieldActive: Boolean​
     * - shieldStrength: Integer​
     * - position: Coordinate
     */
    private String callSign = "stop";
    private int shieldStrength;

    /*
     * The methods symbols in UML:
     * + getShieldStrength(): Integer​
     * + reduceShield(Integer)
     * + increaseDifficulty(Float) <= Notice that this is "Underlined"
     */
    // getter for "shieldStrength" private field
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void reduceShield(int value) {

    }

    public static void increaseDifficulty(double value) {

    }

} // class
