package notenuebersicht;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NotenController extends Application{

	private BorderPane startseite;
	
	private BorderPane semester12Seite;

	@FXML
	private BorderPane borderPane;

	@FXML
	private void zurueck() {
		System.out.println("zurueck!");
		borderPane.setCenter(startseite);
	}
	
	@FXML
	private void logout() {
		System.out.println("logout!");
	}

	@FXML
	private void semester12() {
		System.out.println("semester12!");
		borderPane.setCenter(semester12Seite.getCenter());
	}

	@FXML
	private void semester34() {
		System.out.println("semester34!");
	}
	
	@FXML
	protected void initialize() {
		System.out.println("Method initialize!");
		System.out.println(borderPane.getHeight());
		try {
			semester12Seite = FXMLLoader.load(getClass().getResource("../notenuebersicht/first/noten.fxml"));
			//startseite = FXMLLoader.load(getClass().getResource("../startseite/startseite.fxml"));
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
