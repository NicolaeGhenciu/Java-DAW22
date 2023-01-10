package application;

import javafx.application.Application;
import javafx.stage.Stage;
import vista.PanelPrincipal;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
   
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			PanelPrincipal root = new PanelPrincipal();
			Scene scene = new Scene(root, 1300, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setFullScreen(true);
			primaryStage.setResizable(false);
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			primaryStage.setTitle("MathKid");
			primaryStage.show();
			scene.setOnKeyPressed(e -> {
				if (e.getCode() == KeyCode.ESCAPE) {
					primaryStage.setFullScreen(false);
				}
				if (e.getCode() == KeyCode.F11) {
					primaryStage.setFullScreen(true);
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
