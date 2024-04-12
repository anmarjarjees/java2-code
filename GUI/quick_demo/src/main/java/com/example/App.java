package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        /*
         * FXMLLoader => loading the object graph hierarchy from our .fxml file
         * "hello-view.fxml"
         */
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));

        scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /*
     * static void setRoot(String fxml) throws IOException {
     * scene.setRoot(loadFXML(fxml));
     * }
     */

    public static void main(String[] args) {
        launch();
    }

}