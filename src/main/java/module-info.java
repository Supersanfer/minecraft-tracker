module anguita.garcia.alvaro.minecrafttracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens anguita.garcia.alvaro.minecrafttracker to javafx.fxml;
    exports anguita.garcia.alvaro.minecrafttracker;
	exports controller;
	opens controller to javafx.fxml;
}