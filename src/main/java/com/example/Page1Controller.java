package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Page1Controller {
    int amountOfClicks = 0;

    @FXML public TextField clickerTextField;

    @FXML
    public void goToLanding() throws Exception {
        App.getInstance().changeSceneTo(App.getInstance().landingPage);
    }

    @FXML
    public void updateClickCounter() {
        amountOfClicks += 1;
        clickerTextField.setText(String.valueOf(amountOfClicks));
    }
}
