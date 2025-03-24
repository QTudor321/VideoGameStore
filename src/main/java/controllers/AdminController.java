package controllers;

import entity.Admin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import service.AdminService;

import java.io.IOException;
import java.util.List;

public class AdminController {
    @FXML
    private AnchorPane root;
    @FXML
    private Button bSignIn;
    @FXML
    private Button bMenu;
    @FXML
    private TextField fieldName;
    @FXML
    private PasswordField fieldPassword;
    @FXML
    private TextArea textWelcome;
    @FXML
    private void buttonSignIn() throws Exception{
        AdminService adminService = new AdminService();
        String name = fieldName.getText();
        String password = fieldPassword.getText();
        Admin loggedInAdmin = null;
        String errorMessage = null;
        List<Admin> adminList = adminService.getAllAdmins();
        for (Admin admin : adminList) {
            if (admin.getName().equals(name) && admin.getPassword().equals(password)) {
                loggedInAdmin = admin;
                break;
            }
        }
        if (loggedInAdmin != null) {
            textWelcome.setText("Welcome, " + loggedInAdmin.getName() + "!");
            Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/AdminLoggedView.fxml"));
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
            fieldName.clear();
            fieldPassword.clear();
            fieldName.requestFocus();
        }
    }
    @FXML
    private void buttonMenu() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/GameListView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game Menu Form");
        primaryStage.centerOnScreen();
    }
}
