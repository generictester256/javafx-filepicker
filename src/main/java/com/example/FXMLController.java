package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class FXMLController {
    @FXML public TextArea filesText;
    @FXML public Button fileSelectionButton;

    @FXML
    public void selectFiles(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Markdown Files", "*.md"));

        List<File> selectedFile = fileChooser.showOpenMultipleDialog(fileSelectionButton.getScene().getWindow());

        if(selectedFile != null) {
            for (File file : selectedFile) {
                filesText.appendText(file.toString().replace("\\", "\\\\") + System.lineSeparator());
            }
        }
    }
}
