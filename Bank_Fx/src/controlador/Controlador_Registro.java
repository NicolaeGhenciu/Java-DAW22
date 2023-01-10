package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Date;

import bank_database.DbJava;
import bank_database.Registro;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.Ingreso;
import view.Menu_Usuario;
import view.Registo_View;

public class Controlador_Registro {

		private static Registo_View pane;

		private Button salir;

		private static String ibanx;

		public Controlador_Registro(Registo_View pane, String ibanx) {

			this.pane = pane;
			this.ibanx = ibanx;

			salir = pane.getSalir();
			salir.setOnAction(new Salir());
			
		}

		class Salir implements EventHandler<ActionEvent> {

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

		}
		public static void CambioVentana() throws FileNotFoundException, SQLException {
			Menu_Usuario root = new Menu_Usuario(ibanx);
			Scene scene = new Scene(root, 1000, 500);
			Stage stage = new Stage();
			stage = (Stage) pane.getScene().getWindow();
			stage.setScene(scene);
			Controlador_Menu_Usuario cc = new Controlador_Menu_Usuario(root);

	}

}
