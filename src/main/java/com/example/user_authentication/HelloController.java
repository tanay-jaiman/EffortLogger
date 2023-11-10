/*
    AUTHOR    : Tanay Jaiman
    D.O.C.    : 10/29/2023
    Class     : CSE-360
    Team-Name : Th-67
 */

package com.example.user_authentication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    // List of Users wherein
    // string[i][0] -> Username and
    // string[i][1] -> Password
    // for i in {0, 1, 2, ...., n - 1} where n is the number of employees permissible
    String[][] users = new String[][]{{"tjaiman", "TanayJaiman"}, {"ddiyora", "DakshDiyora"},
            {"hkamma", "HarshithKamma"}, {"asthombre", "Adwait Thombre"},
            {"rsharma", "Rohit Sharma"}};

    /*
        We plan to expand the database to more than 5 using SQL and a database
        We then plan to extract information from there by running queries using MySQL
        We also plan to store the passwords safely and efficiently by prompting the user to select a stronger password
        Then, we plan to encrypt and store it into the database before decrypting it.
     */

    @FXML
    private Label authentication_text; // Displays the result of the Authentication
    @FXML
    private TextField username_input; // Takes in the username as a string input
    @FXML
    private PasswordField password_input; // Takes in the password as a string input

    @FXML
    protected void authentication_passed(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PlanningPoker.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("User Authentication passed!");  // Screen Title
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSubmitButtonClick() {
        // Capture the username and password provided.
        String username = username_input.getText();
        String password = password_input.getText();

        // Iterate through the user database
        for (int i = 0; i < users.length; i++) {
            // If username is found in the database
            if (Objects.equals(users[i][0], username)) {
                // If password entered corresponds to the username correctly
                // i.e. Authentication is successful
                if (Objects.equals(users[i][1], password)) {
                    authentication_text.setText("Authentication Successful!");

                    try {
                        Window window = authentication_text.getScene().getWindow();
                        window.hide();
                        authentication_passed(new Stage());
                    }

                    catch (Exception e) {
                        authentication_text.setText("An unexpected error occurred!");
                    }

                    return;
                }

                // Username is found but password does not correspond correctly
                // I.e. Password is wrong.
                else {
                    authentication_text.setText("Incorrect Password, try again!");
                    password_input.setText(""); // Reset the password field
                    return;
                }
            }
        }

        // If the username is not found in the database
        authentication_text.setText("Authentication Failed! Try again.");
        username_input.setText(""); // Reset the username field
        password_input.setText(""); // Reset the password field
    }

    /*
        If the authentication is successful, we move from there to display appropriate screens to the user
        to be able to participate in the planning poker discussion
     */

    /*
        TEST CASES:
            1. Username and Password provided are correct -
                - "tjaiman" and "TanayJaiman"
                - "ddiyora" and "DakshDiyora"

            2. Username is correct but the password is wrong -
                - "hkamma"  and "Harshith"
                - "rsharma" and "Sharma"

            3. Username is wrong -
                - "tja1"    and "anystring"
                - "athom"   and "anotherstring"
     */
}