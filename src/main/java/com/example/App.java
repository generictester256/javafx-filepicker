package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    public static Parent root;

    @Override
    public void start(Stage stage) throws IOException {
        String version = "v1.0.0";
        root = FXMLLoader.load(getClass().getResource("/App.fxml"));


        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // Scene scene = new Scene(new StackPane(l), 640, 480);
        // stage.setScene(scene);

        stage.setTitle("File Picker " + version);
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}
