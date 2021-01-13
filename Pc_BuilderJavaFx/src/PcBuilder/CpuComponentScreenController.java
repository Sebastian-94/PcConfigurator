package PcBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import builder.PcComponent;
import database.Database;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class CpuComponentScreenController {

	@FXML
	private TableColumn<PcComponent, String> cpuNameColumn;
	@FXML
	private TableColumn<PcComponent, BigDecimal> cpuPriceColumn;
	@FXML
	private TableColumn<PcComponent, Integer> cpuWattsColumn;
	@FXML
	private TableColumn<PcComponent, Integer> cpuRatingColumn;
	@FXML
	private TableColumn<PcComponent, String> cpuInterfacenameColumn;
	@FXML
	private TableView<PcComponent> cpuTable;
	@FXML
	private TextField cpuSearchField;

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

	public void initialize() {

		// still from files
		// List<PcComponent> cpuList = CpuList.readCpuFromFile();
		List<PcComponent> cpuList = Database.getAllCpus();
		cpuNameColumn.setCellValueFactory(new PropertyValueFactory<PcComponent, String>("partName"));
		cpuPriceColumn.setCellValueFactory(new PropertyValueFactory<PcComponent, BigDecimal>("partPrice"));
		cpuWattsColumn.setCellValueFactory(new PropertyValueFactory<PcComponent, Integer>("watt"));
		cpuRatingColumn.setCellValueFactory(new PropertyValueFactory<PcComponent, Integer>("partRating"));
		cpuInterfacenameColumn.setCellValueFactory(new PropertyValueFactory<PcComponent, String>("interfaceName"));
		cpuTable.setItems(FXCollections.observableArrayList(cpuList));
	}

	public void searchCpus() {

		String cpuName = cpuSearchField.getText();

		// List<PcComponent> cpuList = CpuList.readCpuFromFile();
		List<PcComponent> cpuList = Database.getAllCpus();
		List<PcComponent> filteredCpuList = new ArrayList<>();
		// for each object in cpuList -> assign to cpu Object
		for (PcComponent cpu : cpuList) {
			if (cpu.getPartName().contains(cpuName)) {
				filteredCpuList.add(cpu);
			}

		}
		cpuTable.setItems(FXCollections.observableArrayList(filteredCpuList));

	}

}
