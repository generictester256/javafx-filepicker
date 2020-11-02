package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LandingController {
    int amountOfClicks = 0;

    @FXML public TextField clickerTextField;

    @FXML
    public void goToPage1() throws Exception {
        App.getInstance().changeSceneTo(App.getInstance().page1);
    }

    @FXML
    public void goToPage2() throws Exception {
        App.getInstance().changeSceneTo(App.getInstance().page2);
    }

    @FXML
    public void updateClickCounter() {
        amountOfClicks += 1;
        clickerTextField.setText(String.valueOf(amountOfClicks));
    }
}
