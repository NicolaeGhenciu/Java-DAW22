package application;

import controlador.Controlador_Login;
import javafx.application.Application;
import javafx.stage.Stage;
import view.Login_View;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Login_View pane = new Login_View();
			StackPane root = new StackPane();

			root.getChildren().add(pane);

			Controlador_Login loanController = new Controlador_Login(pane);

			Scene scene = new Scene(root, 800, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Login");
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
