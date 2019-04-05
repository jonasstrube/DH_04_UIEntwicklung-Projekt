package startseite;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import navigation.NavigationHandler;

public class Controller extends Application {

    private GridPane noten;
    
    @FXML
    private BorderPane borderPane;
    
    @FXML
    GridPane mainGridPane;
    
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
        NavigationHandler.setBackFillPane(mainGridPane);
        NavigationHandler.navigateTo(noten);
    }

    @FXML
    private void stundenplan() {
        System.out.println("stundenplan");
    }

    @FXML
    protected void initialize() {
        System.out.println("Method initialize!");
        
		NavigationHandler.setRootPane(borderPane);
        
        try {
            noten = FXMLLoader.load(getClass().getResource("../notenuebersicht/noten.fxml"));
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
