package kalender.wochenansicht;

import javafx.fxml.FXML;
import navigation.NavigationHandler;

public class WochenController {
	@FXML
	void zurueckgehen() {
		System.out.println("Zurueck!");
		NavigationHandler.navigateBack();
	}
}
