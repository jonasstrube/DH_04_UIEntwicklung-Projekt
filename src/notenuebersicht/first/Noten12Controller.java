package notenuebersicht.first;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Noten12Controller extends Application{
	
	private BorderPane parent;

	private BorderPane notenuebersicht;

	@FXML
	private BorderPane basicpane12;
	
	@FXML
	private GridPane centerpane;

	@FXML
	private void zurueck() {
		System.out.println("zurueck!");
		try {
			notenuebersicht = FXMLLoader.load(getClass().getResource("../noten.fxml"));
		} catch(IOException e) {
			System.out.println("Seite konnte nicht geladen werden");
		}
		
		parent = (BorderPane) centerpane.getParent();
		parent.setCenter(notenuebersicht.getCenter());
	}
	
	@FXML
	private void logout() {
		System.out.println("logout!");
	}

	@FXML
	private void semester12() {
		System.out.println("semester12!");
	}

	@FXML
	private void semester34() {
		System.out.println("semester34!");
	}
	
	@FXML
	protected void initialize() {
		System.out.println("Method initialize!");
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
