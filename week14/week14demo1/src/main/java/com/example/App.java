package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
// We also removed this import message 
// became unused after modifying the code to be similar to IntelliJ IDE template
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
 * MVC
 * Model => no exits yet (we have to create it if needed)
 * > we can create the model file inside the same package of "App.java" and the
 * controller
 * View => ?? => primary.fxml (VS code) => hello-view.fxml
 * Controller => PrimaryController => HelloController
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));

        /*
         * Starting and setting a new Scene instance "scene" for our application window:
         * setting the width and height in pixels
         * 
         * 1) please consider the width, height values
         */
        scene = new Scene(fxmlLoader.load(), 640, 480);

        // in JavaFx, we have a "stage" that contains a "scene" or "Scene Graph".
        stage.setScene(scene);

        /*
         * Setting the primary stage window
         */
        // Give the stage a title (a title for the application window)
        stage.setTitle("Hello to JavaFx application!");

        stage.show();
    }

    // We will remove this method also:
    /*
     * static void setRoot(String fxml) throws IOException {
     * scene.setRoot(loadFXML(fxml));
     * }
     */

    // We will also remove this method below:
    /*
     * Just copy this line:
     * FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml +
     * ".fxml"));
     */

    /*
     * private static Parent loadFXML(String fxml) throws IOException {
     * return fxmlLoader.load();
     * }
     */

    public static void main(String[] args) {
        // Start the JavaFX application by calling launch() to launch our application
        // :-)
        launch();
    }
}