package PcBuilder;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainScreenController {

	public void showCpuSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("CpuComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showGpuSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("GpuComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showRamSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("RamComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showPsuSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("PsuComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showCaseSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("CaseComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showMainboardSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("MainboardComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showHddSearchScreen() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("HddComponentScreen.fxml"));
			Scene scene = new Scene(root, 800, 600);
			Main.getMainStage().setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
