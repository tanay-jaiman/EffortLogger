package com.example.user_authentication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

/**
 * Controller for the Planning Poker controller class
 */
public class PlanningPoker {

    private ArrayList<String> taskList = new ArrayList<>();

    @FXML
    private TextField addTaskField;
    @FXML
    private TextField estimationInput;
    @FXML
    private Label pokerLabel;
    @FXML
    private Label estimationLabel;

    /**
     * Adds task to the Database upon prompted by the user input
     */
    @FXML
    protected void addTaskFunction() {
        String task = addTaskField.getText();
        String estimation = estimationInput.getText();// Add validation for task and estimation here

        taskList.add(task);
        pokerLabel.setText("Task - " + task + " has been added.");
        estimationLabel.setText("The effort estimation for the task is - " + estimation + ".");

        // Clearing the input fields
        addTaskField.clear();
        estimationInput.clear();
    }
}