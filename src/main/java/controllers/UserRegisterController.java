package controllers;
import service.UserService;
import entity.User;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.SQLException;

public class UserRegisterController {
    @FXML
    private AnchorPane root;
    @FXML
    private TextField fieldUsername;
    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private TextField fieldLocation;
    @FXML
    private PasswordField passfieldPassword;
    @FXML
    private Button bSave;

    @FXML
    private void buttonSignUp() throws SQLException, IOException {
        User user=new User(fieldUsername.getText(), fieldLastName.getText(),fieldFirstName.getText(),fieldLocation.getText(),passfieldPassword.getText());
        UserService us1=new UserService();
        us1.addUser(user);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Succes!");
        alert.showAndWait();
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/LoginView.fxml"));
        Scene scene = new Scene(parent);
        Stage primarystage = (Stage) root.getScene().getWindow();
        primarystage.setScene(scene);
        primarystage.setTitle("Login Form");
        primarystage.centerOnScreen();
    }
}