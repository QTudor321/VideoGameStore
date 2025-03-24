package controllers;
import entity.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

import service.UserService;
public class UserLoginController {
    @FXML
    public ListView<User> userlist;
    @FXML
    private AnchorPane root;
    @FXML
    private TextField fieldUsername;
    @FXML
    private PasswordField fieldPassword;
    @FXML
    private TextArea textWelcome;
    @FXML
    private Button bSignIn;
    @FXML
    private Button bSignUp;

    @FXML
    private void buttonSignIn() throws Exception{
        UserService userService = new UserService();
        String username = fieldUsername.getText();
        String password = fieldPassword.getText();
        User loggedInUser = null;
        String errorMessage = null;
        List<User> usersList = userService.getAllUsers();
        for (User user : usersList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                break;
            }
        }
        if (loggedInUser != null) {
            textWelcome.setText("Welcome, " + loggedInUser.getUsername() + "!");
            Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/GameListView.fxml"));
            Scene scene = new Scene(parent);
            Stage primarystage = (Stage) root.getScene().getWindow();
            primarystage.setScene(scene);
            primarystage.setTitle("Game List Form");
            primarystage.centerOnScreen();
        } else {
            errorMessage = "User not found or password incorrect!";
        }
        if (errorMessage != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "UserName or Password Do not Match");
            alert.showAndWait();
            fieldUsername.clear();
            fieldPassword.clear();
            fieldUsername.requestFocus();
        }
    }
    @FXML
    private void buttonSignUp() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/RegisterView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Register Form");
        primaryStage.centerOnScreen();
    }
}