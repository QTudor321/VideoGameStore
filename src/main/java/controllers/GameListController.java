package controllers;
import application.TOV_App.Game;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.VBox;

public class GameListController{
    @FXML
    private BorderPane root;
    @FXML
    private Button action1;
    @FXML
    private Button action2;
    @FXML
    private Button action3;
    @FXML
    private Button action4;
    @FXML
    private Button action5;
    @FXML
    private Button action6;
    @FXML
    private Button action7;
    @FXML
    private Button action8;
    @FXML
    private Button action9;
    @FXML
    private Button action10;
    @FXML
    private Button action11;
    @FXML
    private Button action12;
    @FXML
    private Button action13;
    @FXML
    private Button action14;
    @FXML
    private Button action15;
    @FXML
    private void buttonAction1() {
        Game game1 = new Game("Metal Gear Solid V: The Phantom Pain",
                "Metal Gear Solid V: The Phantom Pain is a 2015 action-adventure stealth video game developed and published by Konami.",
                "/images/MGS5PP.jpg",//to check if the image is right
                "Intel Core i5, 4GB RAM, NVIDIA GeForce GTX 650");

        showGameDetails(game1);
    }
    @FXML
    private void buttonAction2() {
        Game game2 = new Game("Middle-earth: Shadow of War",
                "Middle-earth: Shadow of War is a 2017 action-adventure video game developed by Monolith Productions and published by Warner Bros.",
                "/images/MESOW.jpg",
                "Intel Core i5/AMD FX-4350, 6GB RAM, NVIDIA GeForce GTX 660/Radeon HD 7850");

        showGameDetails(game2);
    }
    @FXML
    private void buttonAction3() {
        Game game3 = new Game("Rise of the Tomb Raider",
                "Rise of the Tomb Raider is a 2015 action-adventure game developed by Crystal Dynamics and published by Microsoft Studios and Square Enix.",
                "/images/ROTTR.jpg",
                "Intel Core i3, 6GB RAM, NVIDIA GeForce GTX 650");

        showGameDetails(game3);
    }
    @FXML
    private void buttonAction4() {
        Game game4 = new Game("Doom Eternal",
                "Doom Eternal is a first-person shooter game developed by id Software and published by Bethesda Softworks. ",
                "/images/DE1.jpg",
                "Intel Core i9, 16GB RAM, NVIDIA GeForce RTX 2080 Ti/AMD Radeon VII");

        showGameDetails(game4);
    }
    @FXML
    private void buttonAction5() {
        Game game5 = new Game("Assassins Creed: Valhalla",
                "Assassin's Creed Valhalla is a 2020 Viking fantasy action role-playing video game developed by Ubisoft Montreal and published by Ubisoft.",
                "/images/ACV.jpg",
                "AMD Ryzen 3 1200/Intel Core i5, 8GB RAM, AMD R9 380/NVIDIA GeForce GTX 960");

        showGameDetails(game5);
    }
    @FXML
    private void buttonAction6() {
        Game game6 = new Game("Return of the Obra Dinn",
                "Return of the Obra Dinn is an adventure and puzzle video game created by American video game designer Lucas Pope.",
                "/images/ROOD.jpg",
                "Intel Core i5, 4GB RAM, Discrete GPU");

        showGameDetails(game6);
    }
    @FXML
    private void buttonAction7() {
        Game game7 = new Game("Outer Wilds",
                "Outer Wilds is a 2019 action-adventure game developed by Mobius Digital and published by Annapurna Interactive.",
                "/images/OW.jpg",
                "AMD FX-4350/Intel Core i5, 4GB RAM, NVIDIA GeForce GTX 560/AMD Radeon HD 6870");

        showGameDetails(game7);
    }
    @FXML
    private void buttonAction8() {
        Game game8 = new Game("Celeste",
                "Celeste is a single-player adventure game where you help Madeline overcome her inner demons and climb a mountain full of challenges and secrets. ",
                "/images/C.jpg",
                "Intel Core i3, 2GB RAM, Intel HD 4000");

        showGameDetails(game8);
    }
    @FXML
    private void buttonAction9() {
        Game game9 = new Game("Hades",
                "Hades is a god-like rogue-like dungeon crawler that combines the best aspects of Supergiant's critically acclaimed titles, including the fast-paced action of Bastion.",
                "/images/H.jpg",
                "Dual Core 2.4 GHz, 4GB RAM, 1GB VRAM / DirectX 10+ support");

        showGameDetails(game9);
    }
    @FXML
    private void buttonAction10() {
        Game game10 = new Game("Hollow Knight",
                "Hollow Knight is a 2017 Metroidvania video game developed and published by independent developer Team Cherry.",
                "/images/HK.jpg",
                "Intel Pentium E5200, 4GB RAM, NVIDIA GeForce 9800 GTX graphics card");

        showGameDetails(game10);
    }
    @FXML
    private void buttonAction11() {
        Game game11 = new Game("Resident Evil 2: Remastered",
                "The genre-defining masterpiece Resident Evil 2 returns, completely rebuilt from the ground up for a deeper narrative experience.",
                "/images/RER2.jpg",
                "Intel Core i5, 8GB RAM, NVIDIA GeForce GTX 760");

        showGameDetails(game11);
    }
    @FXML
    private void buttonAction12() {
        Game game12 = new Game("Silent Hill 4: The Room",
                "Silent Hill 4: The Room is a 2004 survival horror game developed by Team Silent, and published by Konami.",
                "/images/SH4TR.jpg",
                "1.8 GHz Memory, 2GB RAM, GPU compatible with DirectX 9.0c and 256 MB VRAM");

        showGameDetails(game12);
    }
    @FXML
    private void buttonAction13() {
        Game game13 = new Game("Signalis",
                "Signalis is a survival horror video game developed by rose-engine and published by Humble Games and Playism. ",
                "/images/S.jpg",
                "Intel Core i5, 4GB RAM, NVIDIA GeForce GTX 450/AMD Radeon HD 6570");

        showGameDetails(game13);
    }
    @FXML
    private void buttonAction14() {
        Game game14 = new Game("Until Dawn",
                "Until Dawn is a 2015 interactive drama horror game developed by Supermassive Games and published by Sony Computer Entertainment.",
                "/images/UD.jpg",
                "AMD Athlon X2 2.8GHz, 4GB RAM, AMD Radeon 3870/NVIDIA GeForce 8800 GT");

        showGameDetails(game14);
    }
    @FXML
    private void buttonAction15() {
        Game game15 = new Game("Murder House",
                "Murder House is a slasher-inspired horror game by Puppet Combo, originally released for Microsoft Windows in October 2020.",
                "/images/MH.png",
                "x86 32 bit, 4GB RAM, GPU compatible with DirectX: Version 9.0");

        showGameDetails(game15);
    }
    private void showGameDetails(Game game) {
        Stage stage = new Stage();
        VBox vbox = new VBox();

        Label title = new Label("Title: " + game.getTitle());
        Label description = new Label("Description: " + game.getDescription());
        Label specifications = new Label("Specifications: " + game.getSpecifications());

        vbox.getChildren().addAll(title, description, specifications);

        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.setTitle(game.getTitle() + " Details");
        stage.show();
    }
    @FXML
    private void buttonLogOut() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/LoginView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();
    }
    @FXML
    private void buttonForum() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/ForumView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Forum Form");
        primaryStage.centerOnScreen();
    }
    @FXML
    private void buttonDocumentation() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/DocView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Documentation Form");
        primaryStage.centerOnScreen();
    }
    @FXML
    private void buttonAdmin() throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/application/TOV_App/AdminView.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Form");
        primaryStage.centerOnScreen();
    }
}