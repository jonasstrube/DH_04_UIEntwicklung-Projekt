package application.startseite;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Controller extends Application {

    // Constructor:
    // public Controller() {}

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
    }
    
    @FXML
    private void stundenplan() {
        System.out.println("stundenplan");
    }

    @FXML
    protected void initialize() {
        System.out.println("Method initialize!");
    }


    @Override
    public void init() {
        System.out.println("Method init!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Method start!");

    }

}
