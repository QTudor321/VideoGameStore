package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DocumentationController {
    @FXML
    private AnchorPane root;
    @FXML
    private Button bMenu;
    @FXML
    private void buttonMenu() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/GameListView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Form");
        primaryStage.centerOnScreen();
    }
}
