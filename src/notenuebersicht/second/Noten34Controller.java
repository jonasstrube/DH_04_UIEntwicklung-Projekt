package notenuebersicht.second;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Noten34Controller {
	
	@FXML
	private BorderPane borderPane;
	
	@FXML
	private GridPane centerpane;
	
	private BorderPane notenuebersicht;

	private BorderPane parent;

	
	@FXML
	void mitarbeiteranlegen() {
		System.out.println("Reaction!");
	}
	
	@FXML
	void zurueck() {
		System.out.println("zurueck!");
		try {
			notenuebersicht = FXMLLoader.load(getClass().getResource("../noten.fxml"));
		} catch(IOException e) {
			System.out.println("Seite konnte nicht geladen werden");
		}
		
		parent = (BorderPane) centerpane.getParent();
		parent.setCenter(notenuebersicht.getCenter());
	}
}
