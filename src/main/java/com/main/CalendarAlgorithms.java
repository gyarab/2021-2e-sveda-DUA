package com.main;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CalendarAlgorithms implements Initializable {
    @javafx.fxml.FXML
    private Button mainMenuButton;
    @javafx.fxml.FXML
    private WebView webView;
    @javafx.fxml.FXML
    private Button previousPageButton;
    @javafx.fxml.FXML
    private Button nextPageButton;
    @javafx.fxml.FXML
    private Button testButton;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File htmlFile = new File("src/main/java/com/main/htmlFiles/calendarAlgorithms.html");
        webView.getEngine().load(htmlFile.toURI().toString());
    }

    @javafx.fxml.FXML
    public void goToPreviousPage(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(DUA.class.getResource("matrixAlgorithms.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void goToMainMenu(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(DUA.class.getResource("mainMenu.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void goToTestPage(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(DUA.class.getResource("calendarAlgorithmsTestPage.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
