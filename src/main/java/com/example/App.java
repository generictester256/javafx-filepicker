package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    private Stage stage;

    private static App instance;

    public App() throws IOException {
        if(instance == null) {
            instance = this;
            landingPage = FXMLLoader.load(getClass().getResource("/Landing.fxml"));
            page1 = FXMLLoader.load(getClass().getResource("/Page1.fxml"));
            page2 = FXMLLoader.load(getClass().getResource("/Page2.fxml"));
            currentParents.add(landingPage);
            currentParents.add(page1);
            currentParents.add(page2);
            currentScenes.add(new Scene(landingPage));
            currentScenes.add(new Scene(page1));
            currentScenes.add(new Scene(page2));
        }
    }

    public static App getInstance() { return instance; }

    public static void main(String[] args) { launch(args); }

    public List<Parent> currentParents = new ArrayList<>();
    public List<Scene> currentScenes = new ArrayList<>();

    public Parent landingPage;
    public Parent page1;
    public Parent page2;

    @Override
    public void start(Stage primaryStage) throws IOException {
        String version = "v1.0.0";
        // Parent root = FXMLLoader.load(getClass().getResource("/App.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/Landing.fxml"));

        stage = primaryStage;
        stage.setTitle("File Picker " + version);
        stage.setScene(currentScenes.get(0));
        stage.setResizable(false);
        stage.show();
    }

    public void changeSceneTo(Parent page) throws Exception {

        if(currentParents.contains(page)) {
            System.out.println("Loading known parent");
            stage.setScene(currentScenes.get(currentParents.indexOf(page)));
        } else {
            System.out.println("Loading new parent");
            Scene currentScene = new Scene(page);
            currentScenes.add(currentScene);
            currentParents.add(page);

            stage.setScene(currentScene);
        }

    }
}
