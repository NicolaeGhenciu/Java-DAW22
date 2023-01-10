package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import vista.Informacion_View;
import vista.PanelMenu;

public class Informacion_Controlador {

	private static Informacion_View pane;

	private Button but_Salir;
	private Button but_Editar;

	private static String email;

	public Informacion_Controlador(Informacion_View pane, String email) {

		this.pane = pane;
		this.email = email;

		but_Salir = pane.getSalir();
		but_Salir.setOnAction(new Salir());

	}

	class Salir implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaUsuario();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void CambioVentanaUsuario() throws FileNotFoundException, SQLException {
		PanelMenu root = new PanelMenu(email);
		Scene scene = new Scene(root, 1300, 800);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}
}
