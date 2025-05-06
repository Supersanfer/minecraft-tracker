package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.MinecraftWorld;
import repository.MinecraftWorldRepository;
import services.StageService;

import java.util.ArrayList;
import java.util.List;

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

	@FXML
	void initialize() {
		List<MinecraftWorld> worldList;
		worldList = new MinecraftWorldRepository().getAll();
		if(worldList.isEmpty()) {
			btnCreateWorld.setLayoutX(200);
			btnCreateWorld.setLayoutY(200);
			btnCreateWorld.prefHeight(400);
			btnCreateWorld.prefWidth(400);
		}
		else {
			worldList.forEach(world -> createButtonEachWorld(world));
		}
	}

	private void createButtonEachWorld(MinecraftWorld world) {
		Button btnCreatedWorld = new Button(world.getName());
		btnCreatedWorld.setPrefHeight(100);
		btnCreatedWorld.setPrefWidth(200);
		btnCreatedWorld.setOnMouseClicked(e->showWorldInfo());
	}

	private void showWorldInfo() {

	}


}
