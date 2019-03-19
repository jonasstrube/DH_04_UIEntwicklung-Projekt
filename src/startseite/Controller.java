package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	  	@FXML
	    private TextField mitarbeitereingabefeld;
	  	
	    @FXML
	    private TextArea mitarbeiterliste;

	    @FXML
	    void mitarbeiteranlegen(ActionEvent event) {
	    	mitarbeiterliste.appendText(mitarbeitereingabefeld.getText() + "\n");
	    }
}
