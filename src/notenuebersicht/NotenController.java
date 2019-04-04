package notenuebersicht;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import navigation.NavigationHandler;

public class NotenController extends Application {

	private GridPane semester12Seite;

	private GridPane semester34Seite;

	@FXML
	private BorderPane rootPane;

	@FXML
	private BorderPane basicpane;

	@FXML
	private GridPane centerpane;

	@FXML
	private void zurueck() {
		System.out.println("zurueck!");
		NavigationHandler.navigateBack();
		;
	}

	@FXML
	private void logout() {
		System.out.println("logout!");
	}

	@FXML
	private void semester12() {
		System.out.println("semester12!");
		NavigationHandler.setBackFillPane(centerpane);
		NavigationHandler.navigateTo(semester12Seite);
	}

	@FXML
	private void semester34() {
		System.out.println("semester34!");
		NavigationHandler.setBackFillPane(centerpane);
		NavigationHandler.navigateTo(semester34Seite);
	}

	@FXML
	protected void initialize() {
		System.out.println("Method initialize!");

		NavigationHandler.setRootPane(rootPane);

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
