package notenuebersicht.first;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NotenController extends Application{

	@FXML
	private BorderPane borderPane;

	@FXML
	private void zurueck() {
		System.out.println("zurueck!");
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
