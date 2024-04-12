package com.example.finalclass;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label output;

    @FXML
    private TextField number;

    int userNumber;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onFindFactorialButton() {
        userNumber= Integer.parseInt(number.getText());

        // calculate the factorial:
        int finalReslut = MyMath.calculateFactorial(userNumber);

        // for testing
//        System.out.println("Result: "+ finalReslt);
        output.setText(String.valueOf(finalReslut));


    }
}