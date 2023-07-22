package com.example.eventseventhandlers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    protected void onButtonClick() {
        System.out.println("Hello, " + nameField.getText());
    }
}