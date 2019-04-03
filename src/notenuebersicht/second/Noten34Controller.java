package notenuebersicht.second;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class Noten34Controller {
	
	@FXML
	private BorderPane borderPane;
	
	private BorderPane notenuebersicht;


	
	@FXML
	void mitarbeiteranlegen() {
		System.out.println("Reaction!");
	}
	
	@FXML
	void zurueck() {

		try {
			notenuebersicht = FXMLLoader.load(getClass().getResource("../noten12.fxml"));
		} catch(IOException e) {
			System.out.println("Seite konnte nicht geladen werden");
		}
		borderPane.setCenter(notenuebersicht);
	}
}
