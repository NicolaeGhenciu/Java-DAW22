package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import view.Cuentas_View;
import view.Menu_Usuario;

public class Controlador_Cuentas_View {

	private static Cuentas_View pane;

	private ArrayList<Button> boton;

	private static String iban;

	public Controlador_Cuentas_View(Cuentas_View pane) {

		this.pane = pane;

		boton = pane.getCuentas();

		for (int i = 0; i < boton.size(); i++) {
			boton.get(i).setOnAction(new Manejador());
		}
	}

	class Manejador implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			for (int i = 0; i < boton.size(); i++) {
				if ((Button) arg0.getSource() == boton.get(i)) {
					iban = boton.get(i).getText();
					try {
						CambioVentana();
					} catch (FileNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void CambioVentana() throws FileNotFoundException, SQLException {

		Menu_Usuario root = new Menu_Usuario(iban);
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Menu_Usuario cc = new Controlador_Menu_Usuario(root);
	}
}
