module com.example.user_authentication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user_authentication to javafx.fxml;
    exports com.example.user_authentication;
}