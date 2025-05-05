package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import services.StageService;

public class HomePageController {

	@FXML
	private Button btnCreateWorld;

	@FXML
	private Label lblSelectWorld;

	@FXML
	private Label lblTitle;

	@FXML
	private Pane paneWorldManager;

	@FXML
	void btnCreateWorld_clicked(MouseEvent event) {
		//	Creamos nueva pestaña formulario pidiendo todos los datos.
		StageService.createStage("Create new World", "createWorld-view.fxml");
	}

}
