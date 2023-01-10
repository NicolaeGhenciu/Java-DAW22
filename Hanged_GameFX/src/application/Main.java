package application;

import controlador.Controlador_Pp;
import javafx.application.Application;
import javafx.stage.Stage;
import view.Panel_Principal;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Panel_Principal rootDos = new Panel_Principal();
			StackPane root = new StackPane();
			root.getChildren().add(rootDos);

			Controlador_Pp controlador2 = new Controlador_Pp(rootDos);
			
			Scene scene = new Scene(root, 1000, 600);
			primaryStage.setTitle("The Hangman Game");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
