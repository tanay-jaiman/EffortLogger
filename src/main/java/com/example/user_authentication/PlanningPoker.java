package com.example.user_authentication;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class PlanningPoker {

    ArrayList<String> taskList;

    @FXML
    private TextField addTaskField;
    @FXML
    private TextField estimationInput;
    @FXML
    public Label pokerLabel;
    @FXML
    public Label estimationLabel;

    @FXML
    protected void addTaskFunction() {
        pokerLabel.setText("Task - " + addTaskField.getText() + " has been added.");
        estimationLabel.setText("The effort estimation for the task is - " + estimationInput.getText() + ".");
    }
}
