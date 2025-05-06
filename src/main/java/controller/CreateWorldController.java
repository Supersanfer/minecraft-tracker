package controller;

import enums.WorldType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import model.MinecraftWorld;
import services.StageService;

import java.time.LocalDate;

public class CreateWorldController {

	@FXML
	private Button btnCreateNewWorld;

	@FXML
	private ComboBox<WorldType> cbWorldType; // Compulsory

	@FXML
	private DatePicker dpCreationDate;

	@FXML
	private Label lblWorldCreated;

	@FXML
	private TextField txtDescription;

	@FXML
	private TextField txtName; // Compulsory

	@FXML
	private TextField txtSeed;

	@FXML
	private TextField txtVersion; // Compulsory

	@FXML
	void btnCreateNewWorld_clicked(MouseEvent event) {
		try{
			String name = txtName.getText();
			String version = txtVersion.getText();
			String seed = txtSeed.getText();
			String description = txtDescription.getText();
			WorldType worldType = cbWorldType.getValue();
			LocalDate creationDate = dpCreationDate.getValue();

			if(mandatoryFieldsNotFilledIn(name, version, worldType)){
				StageService.createAlert(Alert.AlertType.WARNING, "WARNING!", "Uncompleted fields", "Review all fields.The fields Name, World Type, and Version are required.");
			}
			MinecraftWorld minecraftWorld = new MinecraftWorld(
				name,
				version,
				worldType,
				seed,
				description,
				creationDate
			);
			lblWorldCreated.setText(String.format("The world %s has been created", name));
		}
		catch (Exception ex){
			StageService.createAlert(Alert.AlertType.ERROR, "Exception", "Exception", "An exception has occurred: %n" + ex.getMessage());
		}
	}

	private static boolean mandatoryFieldsNotFilledIn(String name, String version, WorldType worldType) {
		return name.isBlank() || version.isBlank() || worldType == null;
	}

	@FXML
	void initialize(){
		addWorldTypeComboBox();
		dpCreationDate.setValue(LocalDate.now());
	}

	void addWorldTypeComboBox(){
		ObservableList<WorldType> worldTypes = FXCollections.observableArrayList();
		worldTypes.add(WorldType.SINGLEPLAYER);
		worldTypes.add(WorldType.MULTIPLAYER);
		worldTypes.add(WorldType.CREATIVE);
		cbWorldType.setItems(worldTypes);
	}

}



