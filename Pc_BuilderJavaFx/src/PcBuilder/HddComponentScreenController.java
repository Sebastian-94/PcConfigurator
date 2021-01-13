package PcBuilder;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class HddComponentScreenController {

	public void returnScreen() {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.getMainStage().setScene(scene);
			Main.getMainStage().show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}