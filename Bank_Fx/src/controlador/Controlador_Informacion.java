package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import view.Informacion_Usuario;
import view.Menu_Usuario;

public class Controlador_Informacion {

	private static Informacion_Usuario pane;

	private Button salir;

	public Controlador_Informacion(Informacion_Usuario pane) {

		this.pane = pane;

		salir = pane.getBut_salir();
		salir.setOnAction(new Manejador());

	}

	class Manejador implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentana();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void CambioVentana() throws FileNotFoundException, SQLException {
			String iban = pane.getIbanx();
			Menu_Usuario root = new Menu_Usuario(iban);
			Scene scene = new Scene(root, 1000, 500);
			Stage stage = new Stage();
			stage = (Stage) pane.getScene().getWindow();
			stage.setScene(scene);
			Controlador_Menu_Usuario cc = new Controlador_Menu_Usuario(root);

		}
	}

}
