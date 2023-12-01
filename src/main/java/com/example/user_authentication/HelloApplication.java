package com.example.user_authentication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 Entry point for the User Authentication application.
 This class sets up the JavaFX stage and loads the FXML for the UI.
 */
public class HelloApplication extends Application {

    private static final String FXML_FILE = "hello-view.fxml";
    private static final int SCENE_WIDTH = 500;
    private static final int SCENE_HEIGHT = 450;

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(FXML_FILE));
            Scene scene = new Scene(fxmlLoader.load(), SCENE_WIDTH, SCENE_HEIGHT);
            stage.setTitle("User Authentication");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Consider a more sophisticated error handling
        }
    }

    public static void main(String[] args) {
        // Additional initializations can be done here
        launch(args);
    }
}