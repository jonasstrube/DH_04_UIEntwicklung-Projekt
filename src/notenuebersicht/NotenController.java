package notenuebersicht;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NotenController extends Application{
	
	private BorderPane parent;
	
	private BorderPane startseite;
	
	private BorderPane semester12Seite;
	
	private BorderPane semester34Seite;


	@FXML
	private BorderPane basicpane;
	
	@FXML
	private GridPane centerpane;

	@FXML
	private void zurueck() {
	}
	
	@FXML
	private void logout() {
		System.out.println("logout!");
	}

	@FXML
	private void semester12() {
		System.out.println("semester12!");
		basicpane.setCenter(semester12Seite.getCenter());
	}

	@FXML
	private void semester34() {
		System.out.println("semester34!");
		basicpane.setCenter(semester34Seite.getCenter());
	}
	
	@FXML
	protected void initialize() {
		System.out.println("Method initialize!");
		System.out.println(basicpane.getHeight());

		try {
			semester12Seite = FXMLLoader.load(getClass().getResource("../notenuebersicht/first/noten12.fxml"));
			semester34Seite = FXMLLoader.load(getClass().getResource("../notenuebersicht/second/noten34.fxml"));
		} catch(IOException e) {
			System.out.println(e.getMessage());
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
