package controllers;

import entity.Issue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import service.IssueService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ForumController {
    @FXML
    private AnchorPane root;
    @FXML
    private TextField fieldTitle;
    @FXML
    private TextField fieldDescription;
    @FXML
    private TextField fieldDate;
    @FXML
    private Button bSave;
    @FXML
    private Button bMenu;
    @FXML
    private TableView tableview;
    @FXML
    private TableColumn<Issue, String> colTitle;
    @FXML
    private TableColumn<Issue, String> colDescription;
    @FXML
    private TableColumn<Issue, String> colDate;
    private IssueService issueservice;
    public ForumController() {
        issueservice = new IssueService();
    }

    @FXML
    private void initialize() {
        colTitle.setCellValueFactory(new PropertyValueFactory<>("titleIssue"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("descriptionIssue"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("reportDate"));

        refreshTable();
    }
    private void refreshTable() {
        List<Issue> issueList = issueservice.getAllIssues();
        tableview.getItems().setAll(issueList);
    }
    @FXML
    private void buttonAddIssue() throws SQLException, IOException {
        Issue issue = new Issue(fieldTitle.getText(), fieldDescription.getText(), fieldDate.getText());
        IssueService is1 = new IssueService();
        is1.addIssue(issue);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Succes!");
        alert.showAndWait();
    }
    @FXML
    private void buttonShowIssues(){
        refreshTable();
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
