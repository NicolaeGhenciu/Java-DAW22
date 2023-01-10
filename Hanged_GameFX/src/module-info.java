module Hanged_GameFX {
	requires javafx.controls;
	requires javafx.base;
	requires java.desktop;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
