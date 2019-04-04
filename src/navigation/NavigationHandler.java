package navigation;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

// verwaltet das Navigieren von Seite zu Seite
public class NavigationHandler {
	private static BorderPane rootPane;
	private static GridPane backFillPane;
	
	public static void navigateTo(GridPane pane) {
		System.out.println("pane to navigate to: " + pane);
		System.out.println("rootpane: " + rootPane);
		rootPane.setCenter(pane);
	}
	
	public static void navigateBack() {
		rootPane.setCenter(backFillPane);
	}
	
	// getter und setter
	
	public static BorderPane getRootPane() {
		return rootPane;
	}
	
	public static void setRootPane(BorderPane backRootPane) {
		NavigationHandler.rootPane = backRootPane;
	}
	public static GridPane getBackFillPane() {
		return backFillPane;
	}
	public static void setBackFillPane(GridPane backFillPane) {
		NavigationHandler.backFillPane = backFillPane;
	}
	
	
}
