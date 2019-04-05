package kalender.wochenansicht;

import javafx.fxml.FXML;
import navigation.NavigationHandler;

public class WochenController {
	@FXML
	void zurueckgehen() {
		System.out.println("Zurueck!");
		NavigationHandler.navigateBack();
	}
	
	@FXML
	void logout() {
		System.out.println("Home!");
		System.exit(0);
	}
}
