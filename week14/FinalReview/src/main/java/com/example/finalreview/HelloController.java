package com.example.finalreview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    // Template code from IntelliJ:
    @FXML
    private Label greeting, result; // Notice that we added our label here!

    // Or using a separate code below:
    /*
    @FXML
    private Label result;
    */

    /*
    The id of any element in the view file .fxml
    can be a class field inside the controller file:
     */
    @FXML
    private TextField userValue;

    @FXML
    protected void onHelloButtonClick() {
        greeting.setText("Welcome to JavaFX Final Assignment!");
    }

    // Below, we are adding our custom method :-)
    @FXML
    protected void onConvertButtonClick() {
        // testing:
        // System.out.println("My method was triggered!");

        // 1) how to get the user input?
        // 11 => "11" as a text

        /*
        In Java, two methods to convert numeric text type to number:
        Integer.parseInt(x);
        Double.parseDouble(x);
        */
        String userInput = userValue.getText();

        /*
         testing:
         System.out.println("Your value is: "+userInput);
         result.setText(userInput);
         */

        /*
        lb / 2.205 = kg
         */
        // double kgValue = Double.parseDouble(userInput) / 2.205;

        /*
        IMPORTANT NOTE:
        This method .parseDouble() will throw an exception: java.lang.NumberFormatException
        If the user submit the form without entering a numeric value:
        - Empty String
        - String (not number)

        Task: Use Try/Catch block to handle this type of error/exception
        for more details, refer to the JavaFX project "GuessNumber":
        https://github.com/anmarjarjees/java-gui-javafx/tree/main/GuessNumber
         */
        double kgValue = MassConversion.convertLBToKG(Double.parseDouble(userInput));
        String kgStringValue = String.valueOf(kgValue);
        result.setText("The value in Kg: "+kgStringValue);
    }
} // end class

/*
By the way,
***********
If you like to enhance the application by adding radio buttons:
> Converting lb to kg
> Converting kg to lb
refer to the JavaFX project "JavaTerms":
https://github.com/anmarjarjees/java-gui-javafx/tree/main/JavaTerms
 */