package src.startseite;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller extends Application {

    private BorderPane noten;
    
    @FXML
    private BorderPane borderPane;
    
    @FXML
    private void logout() {
        System.out.println("logout!");
    }

    @FXML
    private void notenverlauf() {
        System.out.println("notenverlauf");
    }

    @FXML
    private void notenuebersicht() {
        System.out.println("notenuebersicht");
        borderPane.setCenter(noten);
    }

    @FXML
    private void stundenplan() {
        System.out.println("stundenplan");
    }

    @FXML
    protected void initialize() {
        System.out.println("Method initialize!");
        try {
            noten = FXMLLoader.load(getClass().getResource("/src/notenuebersicht/noten.fxml"));
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    // =====================================================

    @Override
    public void init() {
        System.out.println("Method init!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Method start!");

    }

}
