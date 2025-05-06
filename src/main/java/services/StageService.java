package services;

import anguita.garcia.alvaro.minecrafttracker.MinecraftTrackerApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StageService {
	public static void createStage(String title, String nameView) {
		try {
			FXMLLoader loader = new FXMLLoader(MinecraftTrackerApp.class.getResource(nameView));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle(title);
			stage.setScene(scene);
			stage.show();
		}
		catch (IOException ex) {
			createAlert(Alert.AlertType.ERROR, "Exception!", "", "ERROR ----" + ex.getMessage());
		}
	}
	public static void createAlert(Alert.AlertType alertType, String headerText, String title, String contentText){
		Alert alert = new Alert(alertType);
		alert.setHeaderText(headerText);
		alert.setTitle(title);
		alert.setContentText(contentText);
		alert.showAndWait();
	}
}
