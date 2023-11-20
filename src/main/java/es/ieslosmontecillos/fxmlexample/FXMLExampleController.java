package es.ieslosmontecillos.fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML private Text actiontarget;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event)
    {
        actiontarget.setText("Sign in button pressed\nUser Name: " + usernameField.getText() + "\nPassword: " + passwordField.getText());
    }

}