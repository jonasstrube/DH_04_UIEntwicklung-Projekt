package startseite;

import java.io.IOException;
import java.util.ArrayList;

import data.DataProvider;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import navigation.NavigationHandler;

public class Controller extends Application {

    private GridPane noten;
    
    private GridPane stundenplan;
    
    private DataProvider provider;
    
    @FXML
    private BorderPane borderPane;
    
    @FXML
    GridPane mainGridPane;
    
    @FXML
    private Text gradeHeading;

    @FXML
    private Text gradeCaption;

    @FXML
    private Text calendarHeading;

    @FXML
    private Text calendarCaption;

    @FXML
    private Text news1Heading;

    @FXML
    private Text news1Caption;

    @FXML
    private Text news2Heading;

    @FXML
    private Text news2Caption;

    @FXML
    private Text news3Heading;

    @FXML
    private Text news3Caption;

    @FXML
    private Text news4Heading;

    @FXML
    private Text news4Caption;
    
    @FXML
    private void logout() {
        System.out.println("logout!");
        System.exit(0);
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
        NavigationHandler.setBackFillPane(mainGridPane);
        NavigationHandler.navigateTo(stundenplan);
    }

    @FXML
    protected void initialize() {
        System.out.println("Method initialize!");
        
        provider = new DataProvider();
        
		NavigationHandler.setRootPane(borderPane);
        
        try {
            noten = FXMLLoader.load(getClass().getResource("../notenuebersicht/noten.fxml"));
            stundenplan = FXMLLoader.load(getClass().getResource("../kalender/wochenansicht/woche.fxml"));
        } catch(IOException e) {
            e.printStackTrace();
        } 
        
        //setTiles();

    }

    // =====================================================
    
    private void setTiles() {

        ArrayList<Tile> tiles = this.provider.getTiles();
        ArrayList<Tile> news = this.provider.getNews();

        this.gradeHeading.setText(tiles.get(0).getHeading());
        this.gradeCaption.setText(tiles.get(0).getCaption());

        this.calendarHeading.setText(tiles.get(1).getHeading());
        this.calendarCaption.setText(tiles.get(1).getCaption());

        this.news1Heading.setText(news.get(0).getHeading());
        this.news1Caption.setText(news.get(0).getCaption());

        this.news2Heading.setText(news.get(1).getHeading());
        this.news2Caption.setText(news.get(1).getCaption());

        this.news3Heading.setText(news.get(2).getHeading());
        this.news3Caption.setText(news.get(2).getCaption());

        this.news4Heading.setText(news.get(3).getHeading());
        this.news4Caption.setText(news.get(3).getCaption());

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
