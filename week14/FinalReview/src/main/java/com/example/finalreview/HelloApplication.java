package com.example.finalreview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/*
In a JavaFX application using "FXML" with the MVC Design Pattern

The full MVC application is consisted of the following sections/parts:
> Model: Java classes representing the data and business logic of the application.
> View: FXML files defining the layout and appearance of the user interface.
> Controller: Java classes containing event handling logic for the user interface components defined in the FXML files.
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        with Swing, we have JFrame that contains JPanel.
        in JavaFx, we have a "stage" that contains a "scene" or "Scene Graph".
         */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // modify the window's size:
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        // Modify the title of my app window
        stage.setTitle("Final JavaFX Review");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}