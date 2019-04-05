package notenuebersicht;

import java.io.IOException;
import java.util.List;

import data.DataProvider;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import navigation.NavigationHandler;

public class NotenController extends Application {
	
	private DataProvider provider;
	
	private GridPane semester12Seite;

	private GridPane semester34Seite;

	@FXML
	private BorderPane rootPane;

	@FXML
	private GridPane centerpane;
	
	@FXML
	private Label semesterlabel1;
	
	@FXML
	private Label semesterlabel2;

	@FXML
	private Label semesterlabel3;
	
	@FXML
	private Label semesternote1;

	@FXML
	private Label semesternote2;

	@FXML
	private Label semesternote3;
	
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
		
		provider = new DataProvider();
		
		this.setSemesterLabels();
		this.setSemesterNoten();
	}

	// =====================================================

	private void setSemesterLabels() {
		List<String> texte = provider.getSemesterTexte();
		
		semesterlabel1.setText(texte.get(0));	
		semesterlabel2.setText(texte.get(1));	
		semesterlabel3.setText(texte.get(2));		
	}

	private void setSemesterNoten() {
		List<Double> noten = provider.getSemesterNoten();
		
		semesternote1.setText(noten.get(0).toString());
		semesternote2.setText(noten.get(1).toString());
		semesternote3.setText(noten.get(2).toString());
		
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
