package controllers;

import entity.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import service.IssueService;
import service.UserService;

import java.util.List;

public class AdminLoggedController {
    @FXML
    private Button showButton;
    @FXML
    private TableView tableview;
    @FXML
    private TableColumn<User, String> colID;
    @FXML
    private TableColumn<User, String> colUserName;
    @FXML
    private TableColumn<User, String> colFirstName;
    @FXML
    private TableColumn<User, String> colLastName;
    @FXML
    private TableColumn<User, String> colLocation;
    @FXML
    private TableColumn<User, String> colPassword;
    private UserService userservice;
    public AdminLoggedController() {
        userservice = new UserService();
    }
    @FXML
    private void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUserName.setCellValueFactory(new PropertyValueFactory<>("username"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        refreshTable();
    }
    private void refreshTable() {
        List<User> usersList = userservice.getAllUsers();
        tableview.getItems().setAll(usersList);
    }
    @FXML
    private void buttonShowUsersList(){
        refreshTable();
    }
}
