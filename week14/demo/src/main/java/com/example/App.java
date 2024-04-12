package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App:
 * "App" class is our main class that extends the "Application" abstract class:
 * so all JavaFX application must extend the "Application" class
 */

/*
 * Our main class:
 * > "HelloApplication" in IntelliJ IDE
 * > "App" in VS Code:
 * 
 * > overrides "start()" method start() method
 * is the entry point for the JavaFX Applications
 *
 * > declares the primary/main stage called "stage" of type "Stage"
 * every JavaFx App has a primary stage
 *
 * stage has a scene that contains the JavaFX nodes (components in Swing)
 *
 * No GUI buttons/components and no controls for events in this file:
 * - the GUI nodes will be defined in the .fxml file
 * - the events will be defined in the .java controller file
 */

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
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        /*
         * FXMLLoader => loading the object graph hierarchy from our .fxml file,
         * 
         * FXMLLoader is in charge of loading the view the .fxml file
         * > VS code => "primary.fxml" (removed the secondary.fxml)
         * > Idea IntelliJ => "hello-view.fxml"
         */
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}